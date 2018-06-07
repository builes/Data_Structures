package Pizzeria;

import java.util.ArrayList;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Producto grande = new Pizza("Hawaiana", 8000);
		Producto mixta = new Ensalada("Mixta", 6000);
		Producto small = new Small(grande.getCodigo(), grande.getPrecio());
		Producto mediana = new Mediana(grande.getCodigo(), grande.getPrecio());
		
		System.out.println(grande.getPrecio());
		System.out.println(small.getPrecio());
		System.out.println(mediana.getPrecio());
		
		ArrayList<Producto> p = new ArrayList<Producto>();
		p.add(mixta);
		p.add(small);
		
		Date date = new Date();
		
		Pedido pedido = new Pedido(date, p, true);
		
		System.out.println(pedido.calcularPrecioTotal());
		
	}
	
	

}
