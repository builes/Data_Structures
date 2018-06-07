package Pizzeria;

public class Mediana extends Pizza{

	public Mediana(String codigo, double precio) {
		super(codigo, precio);
		this.precio = this.calcularPrecio();
		// TODO Auto-generated constructor stub
	}


	public double calcularPrecio(){
		return this.precio - this.precio*0.25;
	}
	

}
