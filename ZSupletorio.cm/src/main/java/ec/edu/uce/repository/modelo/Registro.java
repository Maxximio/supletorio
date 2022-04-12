package ec.edu.uce.repository.modelo;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="registro")
public class Registro {

	@Id
	@Column(name="regi_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_regi")
	@SequenceGenerator(name="seq_regi",sequenceName = "seq_regi",allocationSize = 1)
	private Integer id;
	
	@Column(name="regi_codigo_barras_i")
	private String codigoBarrasI;
	
	@Column(name="regi_cantidad")
	private String cantidad;
	
	@Column(name="regi_hilo")
	private String nombreHilo;
	
	@ManyToOne
	@JoinColumn(name="prod_id")
	private Producto producto;
	
	@ManyToOne
	@JoinColumn(name="bode_id")
	private Bodega bodega;

	//constructor
	public Registro() {
		
	}

	public Registro(Integer id, String codigoBarrasI, String cantidad, String nombreHilo, Producto producto,
			Bodega bodega) {
		this.id = id;
		this.codigoBarrasI = codigoBarrasI;
		this.cantidad = cantidad;
		this.nombreHilo = nombreHilo;
		this.producto = producto;
		this.bodega = bodega;
	}

	///set y get
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodigoBarrasI() {
		return codigoBarrasI;
	}

	public void setCodigoBarrasI(String codigoBarrasI) {
		this.codigoBarrasI = codigoBarrasI;
	}

	public String getCantidad() {
		return cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}

	public String getNombreHilo() {
		return nombreHilo;
	}

	public void setNombreHilo(String nombreHilo) {
		this.nombreHilo = nombreHilo;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Bodega getBodega() {
		return bodega;
	}

	public void setBodega(Bodega bodega) {
		this.bodega = bodega;
	}
	
	
}
