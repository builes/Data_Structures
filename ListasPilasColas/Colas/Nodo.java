package Colas;

import Colas.Nodo;

public class Nodo<E> {

	protected E key;
	protected Nodo<E> last;


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

	public Nodo<E> getLast() {
		return last;
	}

	public void setLast(Nodo<E> last) {
		this.last = last;
	}
	
}

