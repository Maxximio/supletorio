package ec.edu.uce.service;

import java.util.List;

import ec.edu.uce.repository.modelo.Bodega;

public interface IBodegaService {

public Bodega buscarService(Integer id);
	
	public List<Bodega> buscarTodosService();
	
	public void actualizarService(Bodega bod);
	
	public void insertarService(Bodega bod);
	
	public void borrarService(Integer id);
	
	public Bodega buscarNumeroService(String num);
	
}
