package ec.edu.uce.repository;

import java.util.List;

import ec.edu.uce.repository.modelo.ProductoVenta;

public interface IProductoVentaRepo {

	public ProductoVenta buscar(Integer id);
	
	public ProductoVenta buscarCodigo(String ced);
	
	public List<ProductoVenta> buscarTodos();
	
	public void actualizar(ProductoVenta pro);
	
	public void insertar(ProductoVenta pro);
	
	public void borrar(Integer id);
	
}
