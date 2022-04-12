package ec.edu.uce.repository;

import java.util.List;

import ec.edu.uce.repository.modelo.Producto;

public interface IProductoRepo {

	public Producto buscar(Integer id);
	
	public Producto buscarCodigo(String ced);
	
	public List<Producto> buscarTodos();
	
	public void actualizar(Producto paci);
	
	public void insertar(Producto paci);
	
	public void borrar(Integer id);
	
}
