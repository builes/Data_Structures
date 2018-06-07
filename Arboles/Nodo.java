public class Nodo<E> {

	protected E key;
	protected int altura;
	protected Nodo<E> hijoIzquierdo;
	protected Nodo<E> hijoDerecho;
	protected Nodo<E> padre;
	
	
	
	protected Nodo(E key, Nodo<E> hijoIzquierdo, Nodo<E> hijoDerecho) {
		super();
		this.key = key;
		this.hijoIzquierdo = hijoIzquierdo;
		this.hijoDerecho = hijoDerecho;
	}

	protected Nodo(E key) {
		super();
		this.key = key;
	}

	public E getKey() {
		return key;
	}

	public void setKey(E key) {
		this.key = key;
	}

	public Nodo<E> getHijoIzquierdo() {
		return hijoIzquierdo;
	}

	public void setHijoIzquierdo(Nodo<E> hijoIzquierda) {
		this.hijoIzquierdo = hijoIzquierda;
	}

	public Nodo<E> getHijoDerecho() {
		return hijoDerecho;
	}

	public void setHijoDerecho(Nodo<E> hijoDerecha) {
		this.hijoDerecho = hijoDerecha;
	}

	public Nodo<E> getPadre() {
		return padre;
	}

	public void setPadre(Nodo<E> padre) {
		this.padre = padre;
	}
	
	

	public int getAltura() {
		return altura;
	}

	public void alturaNodo() {
		altura = alturaNodo(this);
	}
	
	public int alturaNodo(Nodo<E> nodo) {
		int altura = 0;
		if(nodo==null){
			altura = -1;
		}
		else{
			int alturaIzq = alturaNodo(nodo.getHijoIzquierdo());
			int alturaDer = alturaNodo(nodo.getHijoDerecho());
			altura = 1 + Math.max(alturaIzq, alturaDer);
		}
		return altura;
	}
	
	
	

	@Override
	public String toString() {
		String hi = (hijoIzquierdo == null) ? "null" : hijoIzquierdo.getKey().toString();
		String hd = (hijoDerecho == null) ? "null" : hijoDerecho.getKey().toString();
		return (((Comparable<E>) key)).toString() + " [" + hi + " , " + hd + "]";

	}
	
	
	
	
	
}
