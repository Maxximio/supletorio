package ec.edu.uce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.repository.IBodegaRepo;
import ec.edu.uce.repository.IProductoRepo;
import ec.edu.uce.repository.modelo.Bodega;
import ec.edu.uce.repository.modelo.Producto;

@Service
public class BodegaServiceImpl implements IBodegaService{

	@Autowired
	private IBodegaRepo bodeRepo;

	@Override
	public Bodega buscarService(Integer id) {
		// TODO Auto-generated method stub
		return this.bodeRepo.buscar(id);
	}

	@Override
	public List<Bodega> buscarTodosService() {
		// TODO Auto-generated method stub
		return this.bodeRepo.buscarTodos();
	}

	@Override
	public void actualizarService(Bodega bod) {
		this.bodeRepo.actualizar(bod);
	}

	@Override
	public void insertarService(Bodega bod) {
		this.bodeRepo.insertar(bod);
	}

	@Override
	public void borrarService(Integer id) {
		this.bodeRepo.borrar(id);
	}

	@Override
	public Bodega buscarNumeroService(String num) {
		return this.bodeRepo.buscarNumero(num);
	}

	
	

}
