package ec.edu.uce.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.repository.modelo.Bodega;
import ec.edu.uce.repository.modelo.Producto;
import ec.edu.uce.repository.modelo.ProductoVenta;
import ec.edu.uce.repository.modelo.Registro;

@Service
public class GestorServiceImpl implements IGestorService{

	private static final Logger log = LoggerFactory.getLogger(GestorServiceImpl.class);
	
//	private String nombreHilo;
//	
//	GestorServiceImpl(String nombre){
//	        nombreHilo=nombre;
//	    }
	
	@Autowired
	private IBodegaService bodeService;
	
	@Autowired
	private IRegistroService regiService;
	
	@Autowired
	private IProductoService prodService;
	
	@Autowired
	private IProductoVentaService prodVentaService;

	@Override
	public void crearNuevaBodega(String nombre, String numero, String direccion, String telefonos) {
		Bodega bod=new Bodega();
		
		bod.setNombre(nombre);
		bod.setNumero(numero);
		bod.setDireccion(direccion);
		bod.setTelefonos(telefonos);
		
		bodeService.insertarService(bod);
	}

	@Override
	public void crearNuevoProducto(String nombre, String codBarras, String categoria) {
		Producto pro=new Producto();
		
		pro.setNombre(nombre);
		pro.setCodigoBarras(codBarras);
		pro.setCategoria(categoria);
		pro.setStock(0);
		
		ProductoVenta prov=new ProductoVenta();
		
		prov.setNombre(nombre);
		prov.setCodigoBarras(codBarras);
		prov.setCategoria(categoria);
		prov.setStock(0);
		
		prodService.insertarService(pro);
		prodVentaService.insertarService(prov);
	}

	@Override
	public List<Producto> listaDeTodosLosProductos() {
		
		List<Producto> lista=this.prodService.buscarTodosService();
		
		return lista;
	}

	@Override
	@Transactional
	public void ingresarProductosInventario(String numeroBodega, String codBarras, Integer cantidad) {
		int i=-1;
		
		Bodega bod=this.bodeService.buscarNumeroService(numeroBodega);
		ProductoVenta pro=this.prodVentaService.buscarCodigoService(codBarras);
		
		Registro regi=new Registro();
		regi.setBodega(bod);
		regi.setProductov(pro);
		regi.setCantidad(cantidad);
		
		//for(i)
		
		while(i<cantidad) {
			regi.setNombreHilo(i+"");
			regi.setCodigoBarrasI(codBarras+i);
			
			
			regiService.insertarService(regi);
			i++;
		}
		
		pro.setBodega(bod);
		pro.setStock(cantidad+pro.getStock());
		prodVentaService.actualizarService(pro);
		
	}
	
	@Override
	public void borrarProducto(Integer id) {
		this.prodService.borrarService(id);
	}
	
	
	@Override
	public List<ProductoVenta> listaDeTodosLosProductosIngresados() {
		
		List<ProductoVenta> lista=this.prodVentaService.buscarTodosService();

		List<ProductoVenta> collect = lista
				.stream()
				.filter(li -> li.getStock() >0)
				.collect(Collectors.toList());

		return collect;

	}
	
	@Override
	public void borrarProductoVenta(Integer id) {
			this.prodVentaService.borrarService(id);
	}
	

//	@Override
//	public void run() {
//		int cantidad=2;
//		
//		 for (int i=0; i<cantidad; i++){
//		    
//		    log.info(nombreHilo+i);
//		}
//		
//	}
	
}
