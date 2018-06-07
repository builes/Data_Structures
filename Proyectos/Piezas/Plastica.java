package Piezas;

public class Plastica extends Pieza{
	
	public Plastica(String codigo, String descripcion, double peso, double costo) {
		super(codigo, descripcion, peso, costo);
		// TODO Auto-generated constructor stub
	}

	public double calcularCosto(double peso){
		return (float) 1.3 * peso + 30;
	}

	
	
}
