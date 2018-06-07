package Complejo;
public class NumeroComplejo {
	
	private double entero;
	private double realcito;
	
	public NumeroComplejo(double entero, double realcito) {
		//Llama métodos de clases de herencia
		super();
		//Trabajo con el objeto actual
		this.entero = entero;
		this.realcito = realcito;
	}

	public double getEntero() {
		return entero;
	}

	public void setEntero(double entero) {
		this.entero = entero;
	}

	public double getRealcito() {
		return realcito;
	}

	public void setRealcito(double realcito) {
		this.realcito = realcito;
	}


}
