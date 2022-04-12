package ec.edu.uce.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.repository.modelo.Registro;

@Transactional
@Repository
public class RegistroRepoImpl implements IRegistroRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Registro buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Registro.class, id);
	}

	@Override
	public List<Registro> buscarTodos() {
		TypedQuery<Registro> myQuery=(TypedQuery<Registro>)
				this.entityManager.createQuery("SELECT p FROM CompraPasaje p   ",
						Registro.class);
		return myQuery.getResultList();
	}

	@Override
	public void actualizar(Registro cita) {
		this.entityManager.merge(cita);
	}

	@Override
	public void insertar(Registro cita) {
		this.entityManager.persist(cita);
	}

	@Override
	public void borrar(Integer id) {
		Registro cita=this.buscar(id);
		this.entityManager.remove(cita);
	}

	@Override
	public Registro buscarCodigo(String numero) {
		Query miQuery= this.entityManager.createNativeQuery
				("select * from registro c where c.regi_codigo_barras_i=:valor",Registro.class);
		miQuery.setParameter("valor", numero);
		return (Registro) miQuery.getSingleResult();
	}

}
