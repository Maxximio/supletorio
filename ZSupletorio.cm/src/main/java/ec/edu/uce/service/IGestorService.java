package ec.edu.uce.service;

import java.time.LocalDateTime;
import java.util.List;

import ec.edu.uce.repository.modelo.Producto;

public interface IGestorService {

	public void crearNuevaBodega(String nombre,String numero,String direccion,String telefonos);
	
	public void crearNuevoProducto(String nombre,String codBarras,String categoria);
	
	public List<Producto> listaDeTodosLosProductos();
	
	public void ingresarProductosInventario(String numeroBodega,String codBarras,Integer Cantidad);

	void borrarProducto(Integer id);
}
