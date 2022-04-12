package ec.edu.uce.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ec.edu.uce.repository.modelo.Bodega;
import ec.edu.uce.repository.modelo.Producto;
import ec.edu.uce.repository.modelo.Registro;
import ec.edu.uce.service.IBodegaService;
import ec.edu.uce.service.IProductoService;
import ec.edu.uce.service.IRegistroService;
import ec.edu.uce.service.IGestorService;

@Controller
@RequestMapping("/sistema")
public class ServiciosController {
	
	@Autowired
	private IGestorService gestorService;
	
	///////////////Funcionalidad 1//////////////////////////////////////////////
	
	@GetMapping("/nuevaBodega")
	public String nuevaBodega1(Bodega bodega) {
		return "ingresoBodega";
		
	}
	
	@PostMapping("/datosBodega")
	public String ingresaBodega(Bodega bodega,BindingResult result,Model modelo) {
	
		this.gestorService.crearNuevaBodega(bodega.getNombre(), bodega.getNumero(),
				 bodega.getDireccion(),  bodega.getTelefonos());
		
		return "redirect:/sistema/nuevaBodega";
		
	}
	
///////////////Funcionalidad 2//////////////////////////////////////////////
	
	@GetMapping("/nuevoProducto")
	public String nuevoProducto1(Producto producto) {
		return "ingresoProducto";
		
	}
	
	@PostMapping("/datosProducto")
	public String ingresaProducto(Producto producto,BindingResult result,Model modelo) {
	
		this.gestorService.crearNuevoProducto(producto.getNombre(), producto.getCodigoBarras(), 
				producto.getCategoria());
		
		List<Producto> lista=this.gestorService.listaDeTodosLosProductos();
		
		modelo.addAttribute("lista", lista);
		
		return "listaProductos";
		
	}
	
	@DeleteMapping("borrar/{idProducto}")
	public String eliminarProducto(@PathVariable("idProducto")Integer idProducto,Model modelo) {
		this.gestorService.borrarProducto(idProducto);
		List<Producto> lista=this.gestorService.listaDeTodosLosProductos();
		
		modelo.addAttribute("lista", lista);
		
		return "listaProductos";
	}

///////////////Funcionalidad 3//////////////////////////////////////////////
	
	
	
///////////////Funcionalidad 4//////////////////////////////////////////////	
	
}
