package Objetos;

public class Persona<E> {

	protected String nombre;
	protected int edad;
	protected enum Sex {
		Femenino, Masculino
	}
	protected Sex sexo;
	
	
	
	protected Persona(String nombre, int edad, Sex sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Sex getSexo() {
		return sexo;
	}
	public void setSexo(Sex sexo) {
		this.sexo = sexo;
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + "]";
	}
	
	
	
}
