package Piezas;

public class Metalica extends Pieza{
	
	public Metalica(String codigo, String descripcion, double peso, double costo) {
		super(codigo, descripcion, peso, costo);
		// TODO Auto-generated constructor stub
	}

	public double calcularCosto(){
		return (float) 2.8 * peso + 56;
	}

}
