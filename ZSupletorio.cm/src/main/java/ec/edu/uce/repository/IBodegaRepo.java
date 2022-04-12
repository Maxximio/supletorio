package ec.edu.uce.repository;

import java.util.List;

import ec.edu.uce.repository.modelo.Bodega;
import ec.edu.uce.repository.modelo.Producto;

public interface IBodegaRepo {

	public Bodega buscar(Integer id);
	
	public List<Bodega> buscarTodos();
	
	public void actualizar(Bodega bod);
	
	public void insertar(Bodega bod);
	
	public void borrar(Integer id);
	
	public Bodega buscarNumero(String num);
	
}
