package ec.edu.uce.repository.modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="bodega")
public class Bodega {

	@Id
	@Column(name="bode_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_bode")
	@SequenceGenerator(name="seq_bode",sequenceName = "seq_bode",allocationSize = 1)
	private Integer id;
		
	@Column(name="bode_nombre")
	private String nombre;
	
	@Column(name="bode_numero")
	private String numero;
	
	@Column(name="bode_direccion")
	private String direccion;
	
	@Column(name="bode_telefonos")
	private String telefonos;
	
	@OneToMany(mappedBy = "bodega",cascade=CascadeType.ALL)
	private List<Registro> registro;
	
	@OneToMany(mappedBy = "bodega",cascade=CascadeType.ALL)
	private List<ProductoVenta> productov;

	//constructores
	public Bodega() {
		
	}
	public Bodega(Integer id, String nombre, String numero, String direccion, String telefonos, List<Registro> registro,
			List<ProductoVenta> productov) {
		this.id = id;
		this.nombre = nombre;
		this.numero = numero;
		this.direccion = direccion;
		this.telefonos = telefonos;
		this.registro = registro;
		this.productov = productov;
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

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(String telefonos) {
		this.telefonos = telefonos;
	}

	public List<Registro> getRegistro() {
		return registro;
	}

	public void setRegistro(List<Registro> registro) {
		this.registro = registro;
	}
	public List<ProductoVenta> getProductov() {
		return productov;
	}
	public void setProductov(List<ProductoVenta> productov) {
		this.productov = productov;
	}

	

	
	
}
