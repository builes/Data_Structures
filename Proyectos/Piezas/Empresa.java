package Piezas;

import java.util.ArrayList;

public class Empresa {
	
	protected String nombre;
	protected String direccion;
	protected Pieza[] Piezas;
	protected ArrayList<Cliente> clientes;
	
	
	public void addCliente(Cliente c){
		
		clientes = new ArrayList<Cliente>();
		clientes.add(c);
		
	}
	
	public void searchCliente(String nombre){
		
		
		
	}
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Pieza[] getPiezas() {
		return Piezas;
	}
	public void setPiezas(Pieza[] piezas) {
		Piezas = piezas;
	}
	

	
	
	
	
}
