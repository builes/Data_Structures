package Pizzeria;

public class Roja extends Bebida{

	public Roja(String codigo, double precio){
		super(codigo, precio);
		precio = calcularPrecio(precio);
	}
	
	public double calcularPrecio(double precio){
		
		return precio - precio*0.5;
		
	}
	
}
