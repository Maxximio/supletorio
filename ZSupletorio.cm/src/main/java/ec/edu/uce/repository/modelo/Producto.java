package ec.edu.uce.repository.modelo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto {

	@Id
	@Column(name = "prod_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_prod")
	@SequenceGenerator(name = "seq_prod", sequenceName = "seq_prod", allocationSize = 1)
	private Integer id;

	@Column(name = "prod_nombre")
	private String nombre;

	@Column(name = "prod_codigoBarras")
	private String codigoBarras;
	
	@Column(name = "prod_categoria")
	private String categoria;
	
	@Column(name = "prod_stock")
	private Integer stock;


	// constructores
	public Producto() {

	}

	public Producto(Integer id, String nombre, String codigoBarras, String categoria, Integer stock) {
		this.id = id;
		this.nombre = nombre;
		this.codigoBarras = codigoBarras;
		this.categoria = categoria;
		this.stock = stock;
	}

	//set y get
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Integer getStock() {
		return stock;
	}



	public void setStock(Integer stock) {
		this.stock = stock;
	}

	

}
