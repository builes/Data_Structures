package Pizzeria;

public class Producto {
	
	protected String codigo;
	protected  double precio;
	public Producto(String codigo, double precio) {
		super();
		this.codigo = codigo;
		this.precio = precio;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	

}
