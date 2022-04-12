package ec.edu.uce.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.repository.modelo.Producto;
import ec.edu.uce.repository.modelo.ProductoVenta;

@Transactional
@Repository
public class ProductoVentaRepoImpl implements IProductoVentaRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public ProductoVenta buscar(Integer id) {
		return this.entityManager.find(ProductoVenta.class, id);
	}

	@Override
	public List<ProductoVenta> buscarTodos() {
		TypedQuery<ProductoVenta> myQuery=(TypedQuery<ProductoVenta>)
				this.entityManager.createQuery("SELECT c FROM ProductoVenta c   ",
						ProductoVenta.class);
		return myQuery.getResultList();
	}

	@Override
	public void actualizar(ProductoVenta pro) {
		this.entityManager.merge(pro);
	}

	@Override
	public void insertar(ProductoVenta pro) {
		this.entityManager.persist(pro);
	}

	@Override
	public void borrar(Integer id) {
		ProductoVenta pro=this.buscar(id);
		this.entityManager.remove(pro);
	}

	@Override
	public ProductoVenta buscarCodigo(String codigo) {
		Query miQuery= this.entityManager.createNativeQuery("select * from productov c where c.prodv_codigo_barras=:valor",ProductoVenta.class);
		miQuery.setParameter("valor", codigo);
		return (ProductoVenta) miQuery.getSingleResult();
	}

}
