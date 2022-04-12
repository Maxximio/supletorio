package ec.edu.uce.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.repository.modelo.Bodega;
import ec.edu.uce.repository.modelo.Producto;
import ec.edu.uce.repository.modelo.Registro;

@Service
public class GestorServiceImpl implements IGestorService{

	@Autowired
	private IBodegaService bodeService;
	
	@Autowired
	private IRegistroService regiService;
	
	@Autowired
	private IProductoService prodService;

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
		
		prodService.insertarService(pro);
	}

	@Override
	public List<Producto> listaDeTodosLosProductos() {
		List<>
		
		
		return null;
	}

	@Override
	public void ingresarProductosInventario(String numeroBodega, String codBarras, Integer Cantidad) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
