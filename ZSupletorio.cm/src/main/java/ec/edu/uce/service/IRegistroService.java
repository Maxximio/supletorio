package ec.edu.uce.service;

import java.util.List;

import ec.edu.uce.repository.modelo.Registro;

	public interface IRegistroService {

		public Registro buscarService(Integer id);

		public List<Registro> buscarTodosService();

		public void actualizarService(Registro compra);

		public void insertarService(Registro compra);

		public void borrarService(Integer id);

		public Registro buscarCodigoService(String numero);
	
}
