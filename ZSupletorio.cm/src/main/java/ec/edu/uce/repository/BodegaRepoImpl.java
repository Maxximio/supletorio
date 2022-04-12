package ec.edu.uce.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.repository.modelo.Bodega;
import ec.edu.uce.repository.modelo.Producto;

@Transactional
@Repository
public class BodegaRepoImpl implements IBodegaRepo{

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Bodega buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Bodega.class, id);
	}

	@Override
	public List<Bodega> buscarTodos() {
		TypedQuery<Bodega> myQuery=(TypedQuery<Bodega>)
				this.entityManager.createQuery("SELECT b FROM Bodega b   ",
						Bodega.class);
		return myQuery.getResultList();
	}

	@Override
	public void actualizar(Bodega bod) {
		this.entityManager.merge(bod);
		
	}

	@Override
	public void insertar(Bodega bod) {
		this.entityManager.persist(bod);
	}

	@Override
	public void borrar(Integer id) {
		Bodega bod=this.buscar(id);
		this.entityManager.remove(bod);
	}

	@Override
	public Bodega buscarNumero(String num) {
		Query miQuery= this.entityManager.createNativeQuery("select * from bodega c where c.bode_numero=:valor",Bodega.class);
		miQuery.setParameter("valor", num);
		return (Bodega) miQuery.getSingleResult();
	}

}
