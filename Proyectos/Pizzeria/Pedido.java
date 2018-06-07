package Pizzeria;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {
	
	protected Date fecha;
	protected ArrayList<Producto> productos;
	protected boolean status;
	
	public Pedido(Date fecha, ArrayList<Producto> productos, boolean status) {
		super();
		this.fecha = fecha;
		this.productos = productos;
		this.status = status;
	}
	
	public float calcularPrecioTotal(){
		
		float suma = 0;
		
		for(Producto p : productos){
			
			suma += p.precio;
			
		}
		
		return suma;
		
	}
	

}
