package Piezas;

public class Pieza {
	
	protected String codigo;
	protected String descripcion;
	protected double peso;
	protected double costo;
	
	
	
	
	public Pieza(String codigo, String descripcion, double peso, double costo) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.peso = peso;
		this.costo = costo;
	}


	public double calcularCosto()
	{
		return 0;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public double getCosto() {
		return costo;
	}


	public void setCosto(double costo) {
		this.costo = costo;
	}
	
	
	
}
