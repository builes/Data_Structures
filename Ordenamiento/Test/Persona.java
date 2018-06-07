package Test;

public class Persona implements Comparable<Persona> {
	
	protected String nombre;
	protected Integer edad;
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
	


	@Override
	public int compareTo(Persona o) {
		// TODO Auto-generated method stub
		int byAge = Integer.compare(edad, o.edad);
        if ( byAge != 0 ) {
            return byAge;
        }
        //Solo se organizan por nombre las 
        //personas que tienen la misma edad	
        return nombre.compareToIgnoreCase(o.nombre);
	}

	
	
}
