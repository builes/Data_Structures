package Listas;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListaEnlazada<Comparable> lista = new ListaEnlazada<Comparable>();
		
		
		lista.addElement(0);
		lista.addElement(1);
		lista.addElement(2);
		lista.addElement(2);
		lista.addElement(4);
		lista.addElement(5);
		
		System.out.println(lista.getElement(0));
		System.out.println(lista.getElement(1));
		System.out.println(lista.getElement(2));
		System.out.println(lista.getElement(3));
		System.out.println(lista.getElement(4));
		System.out.println(lista.getElement(5));

		
		System.out.println("");
		
		lista.removeConsecutiveDuplicate();
		
		
		System.out.println(lista.getElement(0));
		System.out.println(lista.getElement(1));
		System.out.println(lista.getElement(2));
		System.out.println(lista.getElement(3));
		System.out.println(lista.getElement(4));
		
		System.out.println("");
		lista.removeLastElement();

		System.out.println(lista.getElement(0));
		System.out.println(lista.getElement(1));
		System.out.println(lista.getElement(2));
		System.out.println(lista.getElement(3));
		
		
	}

}
