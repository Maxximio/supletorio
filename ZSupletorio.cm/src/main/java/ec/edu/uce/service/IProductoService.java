package ec.edu.uce.service;

import java.util.List;

import ec.edu.uce.repository.modelo.Producto;

public interface IProductoService {

public Producto buscarService(Integer id);
	
	public Producto buscarCodigoService(String ced);
	
	public List<Producto> buscarTodosService();
	
	public void actualizarService(Producto paci);
	
	public void insertarService(Producto paci);
	
	public void borrarService(Integer id);
	
}
