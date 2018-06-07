package Listas;

public class ListaEnlazada<E extends Comparable> {
	
	protected Nodo<E> first;
	protected int size;

	protected ListaEnlazada() {
		first = null;
		size = 0;
	}
	
	public int getSize() {
		return size;
	}


	public void addElement(E key){
		
		if(first==null)
			first = new Nodo<E>(key);
		else{
			Nodo<E> temporal = first;
			first = new Nodo<E>(key);
			first.setNext(temporal);
		}
		
		size++;
	}
	
	public E getElement(int index){
		
		Nodo<E> nodo = first;
		int i = 0;
		while(i < index){
			nodo = nodo.getNext();
			i++;
		}
		return nodo.getKey();
		
	}
	
	public void setElement(int index, E elemento){
		
		Nodo<E> nodo = first;
		int i = 0;
		while(i < index){
			nodo = nodo.getNext();
			i++;
		}
		nodo.setKey(elemento);
		
	}
	
	
	public int getIndex(E key){
		
		int i = 0;
		Nodo<E> nodo = first;
		
		while(i < this.getSize()-1 && nodo.getKey() != key){
			nodo = nodo.getNext();
			i++;
		}
		 
		return (nodo.getKey() == key) ? i : -1;
		
	}
	
	public boolean contains(E key){
		
		int i = 0;
		Nodo<E> nodo = first;
		
		while(i < getSize()-1 && nodo.getKey() != key){
			nodo = nodo.getNext();
			i++;
		}
		
		return (nodo.getKey() == key) ? true : false;
	}
	

	public boolean isEmpty(){
		
		if(size == 0)
			return true;
		else
			return false;
		
	}
	
	public void remove(int index){
		
		if(index==0){
			first = first.getNext();
		}else{
			int i = 0;
			Nodo<E> nodo = first;
			while(i < index-1){
				nodo = nodo.getNext();
				i++;
			}
			nodo.setNext(nodo.getNext().getNext());
		}
		size--;
		
	}
	

	public void remove(E key){
		remove(getIndex(key));
	}
	
	
	public void isPalindrome(){
		reverse(0,size-1);
	}
	
	
	public boolean isPalindrome(int i, int j){
		
		if(i==j){
			return true;
		}
		else if(this.getElement(i) == this.getElement(j)){
			return isPalindrome(i+1,j-1);
		}
		else{
			return false;
		}
		
	}
	
	
	public void reverse(){
		reverse(0,size-1);
	}
	
	public void reverse(int i, int j){
		
		if(j<=i){
			return;
		}
		else{
			E temporal = this.getElement(j);
			this.setElement(j, this.getElement(i));
			this.setElement(i, temporal);
			reverse(i+1,j-1);
		}
			
	}
	
	public void removeConsecutiveDuplicate(){
		
		E temporal = null;
		
		for(int i = 0; i < size-1; i++){
			
			if(this.getElement(i) == temporal){
				this.remove(this.getElement(i));
			}
			
			temporal = this.getElement(i);
			
			
		}
		
	}
	
	public void removeLastElement(){
		
		int s = size-1;
		int i = 0;
		while(i < s){
			i++;
		}
		this.remove(i);
		
	}
	
	
	
	

}
