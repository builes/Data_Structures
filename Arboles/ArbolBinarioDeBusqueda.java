import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class ArbolBinarioDeBusqueda <E extends Comparable> extends Arbol{

	protected ArbolBinarioDeBusqueda() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected ArbolBinarioDeBusqueda(Nodo<E> raiz) {
		super(raiz);
		// TODO Auto-generated constructor stub
	}
	
	
	//---------------------------------------------------
	
	public Nodo<E> busqueda(E key) throws ExceptionNodo {
		return busqueda(key, raiz);
	}
	
	public Nodo<E> busqueda(E key, Nodo<E> r) throws ExceptionNodo{
		
		if(r==null){
			throw new ExceptionNodo("El nodo no existe");
		}
		if(key.compareTo(r.getKey()) < 0){
			return busqueda(key,r.getHijoIzquierdo());
		}
		if(key.compareTo(r.getKey()) > 0){
			return busqueda(key,r.getHijoDerecho());
		}
		return r;
		
	}
	
	//---------------------------------------------------

	public Nodo<E> insertar(E key) throws ExceptionNodo {
		raiz = insertar(key, raiz);
		return raiz;
	}
	
	public Nodo<E> insertar(E key, Nodo<E> r) throws ExceptionNodo{
		
		if(r == null){
			Nodo<E> nodo = new Nodo<E>(key);
			r = nodo;
		}
		else{
			
			if (key.compareTo(r.getKey()) < 0)
				r.setHijoIzquierdo(insertar(key, r.getHijoIzquierdo()));
			
			if (key.compareTo(r.getKey()) > 0)
				r.setHijoDerecho(insertar(key, r.getHijoDerecho()));
			
			if (key.compareTo(r.getKey()) == 0)
				throw new ExceptionNodo("El Nodo ya Existe");
			
		}
		
		return r;
		
	}
	
	//---------------------------------------------------

	//El mayor de los menores
	public Nodo<E> buscarAntecesor(Nodo<E> nodo) throws ExceptionNodo {
		
		if (nodo.getHijoIzquierdo() == null)
			throw new ExceptionNodo("El nodo no tiene antecesor");
		
		return buscarMayor(nodo.getHijoIzquierdo());
	}

	public Nodo<E> buscarMayor(Nodo<E> nodo) throws ExceptionNodo {
		
		if (nodo.getHijoDerecho() == null)
			return nodo;
		
		else
			return buscarMayor(nodo.getHijoDerecho());
	}

	public void eliminar(E key) throws ExceptionNodo {
		raiz = eliminar(key, raiz);
	}

	public Nodo<E> eliminar(E key, Nodo<E> r) throws ExceptionNodo {
		
		if (r == null)
			throw new ExceptionNodo("El nodo no se encuentra");
		
		if (key.compareTo(r.getKey()) < 0)
			r.setHijoIzquierdo(eliminar(key, r.getHijoIzquierdo()));
		
		if (key.compareTo(r.getKey()) > 0)
			r.setHijoDerecho(eliminar(key, r.getHijoDerecho()));
		
		if (key.compareTo(r.getKey()) == 0) {
			// Caso 3
			
			if (r.getHijoDerecho() != null && r.getHijoIzquierdo() != null) {
				Nodo<E> antecesor = buscarAntecesor(r);
				r.setKey(antecesor.getKey());
				r.setHijoIzquierdo(eliminar(antecesor.getKey(), r.getHijoIzquierdo()));
				
			} else {
				// Caso 2 o Caso 1
				
				if (r.getHijoDerecho() != null)
					r = r.getHijoDerecho();
				
				else
					r = r.getHijoIzquierdo();
			}

		}
		return r;
	}
	
	//------------------------------------
	
	
	
	

}

class ExceptionNodo extends Exception {

	public ExceptionNodo(String m) {
		super(m);
	}

}

