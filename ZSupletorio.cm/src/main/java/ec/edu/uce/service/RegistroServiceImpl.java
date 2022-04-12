package ec.edu.uce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.repository.IProductoRepo;
import ec.edu.uce.repository.IRegistroRepo;
import ec.edu.uce.repository.modelo.Producto;
import ec.edu.uce.repository.modelo.Registro;

@Service
public class RegistroServiceImpl implements IRegistroService{

	@Autowired
	private IRegistroRepo regiService;

	@Override
	public Registro buscarService(Integer id) {
		return this.regiService.buscar(id);
	}

	@Override
	public List<Registro> buscarTodosService() {
		return this.regiService.buscarTodos();
	}

	@Override
	public void actualizarService(Registro compra) {
		this.regiService.actualizar(compra);
	}

	@Override
	public void insertarService(Registro compra) {
		this.regiService.insertar(compra);
	}

	@Override
	public void borrarService(Integer id) {
		
		this.regiService.borrar(id);
	}

	@Override
	public Registro buscarCodigoService(String numero) {
		return this.regiService.buscarCodigo(numero);
	}

	
	
	

}
