package ec.edu.uce.repository;

import java.util.List;

import ec.edu.uce.repository.modelo.Registro;

public interface IRegistroRepo {

	public Registro buscar(Integer id);
	
	public List<Registro> buscarTodos();
	
	public void actualizar(Registro compra);
	
	public void insertar(Registro compra);
	
	public void borrar(Integer id);
	
	public Registro buscarCodigo(String numero);
	
}
