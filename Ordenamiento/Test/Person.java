package Test;

import Metodos.InsertionSort;

public class Person implements Comparable<Person> {

	protected String nombre;
	protected int edad;
	
	
	
	public Person(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
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
	
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return this.edad - o.getEdad();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person("Alex", 25);
		Person p2 = new Person("Ricardo", 12);
		Person p3 = new Person("Juan", 17);
		Person p4 = new Person("Felipe", 15);
		Person p5 = new Person("Checho", 20);

		Person[] listaPersonas = {p1,p2,p3,p4,p5};
		listaPersonas = (Person[]) InsertionSort.insertSort(listaPersonas);
		

		for(Person p : listaPersonas){
			System.out.print(p.getEdad() + " ");
			System.out.print(p.getNombre() + " ");
			System.out.println();
		}
		
	}
	
	


}
