package ec.edu.uce.repository.modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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

	@OneToMany(mappedBy = "producto", cascade = CascadeType.ALL)
	private List<Registro> registro;
	
	@ManyToOne
	@JoinColumn(name="bode_id")
	private Bodega bodega;

	// constructores
	public Producto() {

	}

	

	public Producto(Integer id, String nombre, String codigoBarras, String categoria, Integer stock,
			List<Registro> registro, Bodega bodega) {
		this.id = id;
		this.nombre = nombre;
		this.codigoBarras = codigoBarras;
		this.categoria = categoria;
		this.stock = stock;
		this.registro = registro;
		this.bodega = bodega;
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

	public List<Registro> getRegistro() {
		return registro;
	}

	public void setRegistro(List<Registro> registro) {
		this.registro = registro;
	}

	public Bodega getBodega() {
		return bodega;
	}

	public void setBodega(Bodega bodega) {
		this.bodega = bodega;
	}



	public Integer getStock() {
		return stock;
	}



	public void setStock(Integer stock) {
		this.stock = stock;
	}

	

}
