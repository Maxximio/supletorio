package ec.edu.uce.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.repository.modelo.Producto;

@Transactional
@Repository
public class ProductoRepoImpl implements IProductoRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Producto buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Producto.class, id);
	}

	@Override
	public List<Producto> buscarTodos() {
		TypedQuery<Producto> myQuery=(TypedQuery<Producto>)
				this.entityManager.createQuery("SELECT c FROM Producto c   ",
						Producto.class);
		return myQuery.getResultList();
	}

	@Override
	public void actualizar(Producto pro) {
		this.entityManager.merge(pro);
	}

	@Override
	public void insertar(Producto pro) {
		this.entityManager.persist(pro);
	}

	@Override
	public void borrar(Integer id) {
		Producto pro=this.buscar(id);
		this.entityManager.remove(pro);
	}

	@Override
	public Producto buscarCodigo(String codigo) {
		Query miQuery= this.entityManager.createNativeQuery("select * from producto c where c.prod_codigoBarras=:valor",Producto.class);
		miQuery.setParameter("valor", codigo);
		return (Producto) miQuery.getSingleResult();
	}

}
