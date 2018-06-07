package Herencia;

public class Trabajador {

	protected String nombre;
	protected float salarioBasico;
	protected float diasTrabajados;
	
	public Trabajador(String nombre, float salarioBasico, float diasTrabajados){
		this.nombre=nombre;
		this.salarioBasico=salarioBasico;
		this.diasTrabajados=diasTrabajados;
	}
	
	public float salario(){
		return salarioBasico*diasTrabajados/24;
	}
	
}
