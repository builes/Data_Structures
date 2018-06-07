package Estudiante;

public class Estudiante {

	//Cada uno puede sobreescribir en esta variable
	//Se puede tomar como si fuera 'publica'
	private static int index;
	private String nombre;
	private int edad;
	
	public Estudiante(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		index++;
	}

	public static int getIndex() {
		return index;
	}

	public static void setIndex(int index) {
		Estudiante.index = index;
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
	

	
}
