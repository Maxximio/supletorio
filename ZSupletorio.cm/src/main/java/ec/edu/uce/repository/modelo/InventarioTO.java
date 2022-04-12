package ec.edu.uce.repository.modelo;

public class InventarioTO {

	private String numeroBodega;
	
	private String codigoBarras;
	
	private Integer cantidad;

	//constructor
	public InventarioTO() {
		
	}

	public InventarioTO(String numeroBodega, String codigoBarras, Integer cantidad) {
		this.numeroBodega = numeroBodega;
		this.codigoBarras = codigoBarras;
		this.cantidad = cantidad;
	}

	//set y get
	public String getNumeroBodega() {
		return numeroBodega;
	}

	public void setNumeroBodega(String numeroBodega) {
		this.numeroBodega = numeroBodega;
	}

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	

	
	
	
	
}
