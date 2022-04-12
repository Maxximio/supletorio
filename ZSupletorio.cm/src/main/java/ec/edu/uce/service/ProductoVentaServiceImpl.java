package ec.edu.uce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.repository.IProductoVentaRepo;
import ec.edu.uce.repository.modelo.ProductoVenta;

@Service
public class ProductoVentaServiceImpl implements IProductoVentaService{

	@Autowired
	private IProductoVentaRepo prodService;

	@Override
	public ProductoVenta buscarService(Integer id) {
		// TODO Auto-generated method stub
		return this.prodService.buscar(id);
	}

	@Override
	public ProductoVenta buscarCodigoService(String ced) {
		// TODO Auto-generated method stub
		return this.prodService.buscarCodigo(ced);
	}

	@Override
	public List<ProductoVenta> buscarTodosService() {
		// TODO Auto-generated method stub
		return this.prodService.buscarTodos();
	}

	@Override
	public void actualizarService(ProductoVenta pro) {
		this.prodService.actualizar(pro);
	}

	@Override
	public void insertarService(ProductoVenta pro) {
		this.prodService.insertar(pro);
	}

	@Override
	public void borrarService(Integer id) {
		this.prodService.borrar(id);
	}
	
	

}
