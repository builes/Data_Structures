package Colas;


public class Cola<E extends Comparable>{
	
	protected Nodo<E> front;
	protected Nodo<E> back;
	protected int size;
	
	protected Cola() {
		super();
		size = 0;
		front = null;
		back = null;
		// TODO Auto-generated constructor stub
	}
	
	public E lastElement() {
		return back.getKey();
	}
	
	public Nodo<E> getBack() {
		return back;
	}

	public void enqueue(E key){
		
		Nodo<E> nodo = new Nodo<E>(key);
		
		if(front==null){
			front = nodo;
		}
		else if(back==null){
			back = nodo;
			front.setLast(back);
		}
		else{
			Nodo<E> temporal = back;
			back = nodo;
			temporal.setLast(back);
		}
		
		size++;
		
	}
	
	public boolean isEmpty(){
		return (size==0) ? true : false;
	}
	
	public E peek(){
		
		if(!isEmpty()){
			
			return front.getKey();
		}
		
		return null;
	}
	
	
	public E poll(){
		
		if(!isEmpty()){
			
			Nodo<E> nodo = front;
			front = nodo.getLast();
			size--;
			return nodo.getKey();
			
		}
		
		return null;
	}
	
	
	public E getElement(int index){
		
		if(!isEmpty() && index < size){
			
			Nodo<E> nodotemporal = front;
			int temporal = 0;
			
			
			while(temporal >= 0 && temporal < index){
				
				nodotemporal = nodotemporal.getLast();
				temporal++;
				
			}
			
			
			return nodotemporal.getKey();
			
			
		}
		return null;
	}
	
	public Nodo<E> getNodo(int index){
	if(!isEmpty() && index < size){
			
			Nodo<E> nodotemporal = front;
			int temporal = 0;
			
			
			while(temporal >= 0 && temporal < index){
				
				nodotemporal = nodotemporal.getLast();
				temporal++;
				
			}
			
			
			return nodotemporal;
			
			
		}
		return null;
	}
	
	
	
	public void reverse(){
		reverse(0,size-1);
	}
	
	private void reverse(int i, int j){
		
		if(i<j){
			
			E temporal = getNodo(i).getKey();
			getNodo(i).setKey(getElement(j));
			getNodo(j).setKey(temporal);
			
			reverse(i+1,j-1);
		}
		
	}
		
	

}
