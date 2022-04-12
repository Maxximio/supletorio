package ec.edu.uce.service;

import java.util.List;

import ec.edu.uce.repository.modelo.ProductoVenta;

public interface IProductoVentaService {

public ProductoVenta buscarService(Integer id);
	
	public ProductoVenta buscarCodigoService(String ced);
	
	public List<ProductoVenta> buscarTodosService();
	
	public void actualizarService(ProductoVenta paci);
	
	public void insertarService(ProductoVenta paci);
	
	public void borrarService(Integer id);
	
}
