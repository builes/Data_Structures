package Cuerpo;

public class Cuerpo {
	
	private double espacio;
	private double tiempo;
	
	
	public Cuerpo(double espacio, double tiempo) {
		super();
		this.espacio = espacio;
		this.tiempo = tiempo;
	
	}


	public double getEspacio() {
		return espacio;
	}


	public void setEspacio(double espacio) {
		this.espacio = espacio;
	}


	public double getTiempo() {
		return tiempo;
	}

	public void setTiempo(double tiempo) {
		this.tiempo = tiempo;
	}


	public double getVelocity(){
		
		return espacio/tiempo;
		
	}
	
	

}
