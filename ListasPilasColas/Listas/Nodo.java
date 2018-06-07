package Listas;


public class Nodo<E extends Comparable> {

	protected E key;
	protected Nodo<E> next;

	public Nodo() {
		super();
	}
	
	public Nodo(E key) {
		super();
		this.key = key;
	}

	public E getKey() {
		return key;
	}

	public void setKey(E key) {
		this.key = key;
	}

	public Nodo<E> getNext() {
		return next;
	}

	public void setNext(Nodo<E> next) {
		this.next = next;
	}
	
}
