package Piezas;

import java.util.ArrayList;

public class Mixta extends Pieza{

	public Mixta(String codigo, String descripcion, double peso, double costo, ArrayList<Pieza> componentes) {
		super(codigo, descripcion, peso, costo);
		this.componentes = componentes;
		// TODO Auto-generated constructor stub
	}


	protected ArrayList<Pieza> componentes;
	
	public void agregarPiezas(Pieza p){
		componentes = new ArrayList<Pieza>();
		componentes.add(p);
		costo = calcularCosto();
	}
	
	
	public double calcularCosto(Pieza[] componentes){
		
		float suma = 0;
		for(Pieza p : componentes){
			
			suma += (float) p.calcularCosto();
			
		}
		
		return suma;
	}
	
	
	
	
}
