package Pizzeria;

import java.util.ArrayList;


public class Combo extends Producto{
	
	protected ArrayList<Producto> productos;

	public Combo(String codigo, double precio, ArrayList<Producto> productos) {
		super(codigo, precio);
		this.productos = productos;
		// TODO Auto-generated constructor stub
	}
	
	public void agregarProductos(Producto p){
		productos = new ArrayList<Producto>();
		productos.add(p);
		precio = calcularPrecio();
	}
	
	public float calcularPrecio(){
		
		float suma = 0;
		for(Producto p : productos){
			suma += p.precio;
		}
		return suma;
		
	}

}
