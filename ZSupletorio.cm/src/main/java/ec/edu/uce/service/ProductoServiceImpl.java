package ec.edu.uce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.repository.IProductoRepo;
import ec.edu.uce.repository.modelo.Producto;

@Service
public class ProductoServiceImpl implements IProductoService{

	@Autowired
	private IProductoRepo prodService;

	@Override
	public Producto buscarService(Integer id) {
		// TODO Auto-generated method stub
		return this.prodService.buscar(id);
	}

	@Override
	public Producto buscarCodigoService(String ced) {
		// TODO Auto-generated method stub
		return this.prodService.buscarCodigo(ced);
	}

	@Override
	public List<Producto> buscarTodosService() {
		// TODO Auto-generated method stub
		return this.prodService.buscarTodos();
	}

	@Override
	public void actualizarService(Producto pro) {
		this.prodService.actualizar(pro);
	}

	@Override
	public void insertarService(Producto pro) {
		this.prodService.insertar(pro);
	}

	@Override
	public void borrarService(Integer id) {
		this.prodService.borrar(id);
	}
	
	

}
