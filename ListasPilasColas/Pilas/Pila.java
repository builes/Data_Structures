package Pilas;

public class Pila<E extends Comparable> {

	protected Nodo<E> top;
	protected int size;
	
	protected Pila() {
		super();
		top = null;
		size = 0;
		// TODO Auto-generated constructor stub
	}
	

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public E peek() {
		return top.getKey();
	}
	
	public void push(E key){
		
		if(top == null){
			Nodo<E> nodo = new Nodo<E>(key);
			top = nodo;
		}
		else{
			
			Nodo<E> temporal = top;
			top = new Nodo<E>(key);
			top.setLast(temporal);
			
		}
		size++;
	}
	
	public E pop(){
		
		Nodo<E> temporal = top;
		top = temporal.getLast();
		size--;
		return temporal.getKey();
	}
	
	public boolean isEmpty(){
		return (size==0) ? true : false;
	}	
	
}
