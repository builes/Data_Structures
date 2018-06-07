package Herencia;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Trabajador t = new Trabajador("Ricardo", 400,23);
		System.out.println("El salario es:" + t.salario());

		EmpleadoDeLimpieza l = new EmpleadoDeLimpieza("Verga María", 250,19,50,40);
		System.out.println("El salario es:" + l.salario());
		
		Trabajador lt = new EmpleadoDeLimpieza("Verga María", 1561,19,50,40);
		System.out.println("El salario es:" + l.salario());
		//It's okay, works fine!
		//Cuando quiera una lista de trabajadores, puedo tener hijos y padres!
		
	}

}
