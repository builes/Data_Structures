import java.util.ArrayList;

public class Arbol<E extends Comparable> {

	protected Nodo<E> raiz;
	protected int altura;

	public Arbol() {
		raiz = null;
	}
	
	
	public Arbol(Nodo<E> raiz) {
		super();
		this.raiz = raiz;
	}

	public Nodo<E> getRaiz() {
		return raiz;
	}

	public void setRaiz(Nodo<E> raiz) {
		this.raiz = raiz;
	}
	
	
	//-------------------------------------------------------------
	
	public void preOrden(){
		preOrden(this.raiz);
	}
	
	public void preOrden(Nodo<E> raiz){	
		if(raiz != null){
			System.out.println(raiz.toString());
			preOrden(raiz.getHijoIzquierdo());
			preOrden(raiz.getHijoDerecho());
		}
	}
	 
	//-------------------------------------------------------------

	public void postOrden(){
		postOrden(this.raiz);
	}
	
	public void postOrden(Nodo<E> raiz){
		
		if(raiz != null){
			preOrden(raiz.getHijoIzquierdo());
			preOrden(raiz.getHijoDerecho());
			System.out.println(raiz.toString());
		}

		
	}
	
	//-------------------------------------------------------------

		public void inOrden(){
			inOrden(this.raiz);
		}
		
		public void inOrden(Nodo<E> raiz){
			
			if(raiz != null){
				inOrden(raiz.getHijoIzquierdo());
				System.out.println(raiz.toString());
				inOrden(raiz.getHijoDerecho());
			}

			
		}
		
	
	//----------------------------------------
		
		public int contarHojas() {
			return contarHojas(raiz);
		}
		
		public int contarHojas(Nodo<E> r){
			

			if (r == null)
				return 0;
			else {
				if (r.getHijoIzquierdo() == null && r.getHijoDerecho() == null)
					return 1;
				else
					return contarHojas(r.getHijoIzquierdo()) + contarHojas(r.getHijoDerecho());
			}
		
			
		}
	
	//-----------------------------
		

		//Desde preOrden e inorden
		public Nodo<E> construirArbol(ArrayList<E> preorden, ArrayList<E> inorden){		
			

			if(preorden.size()>0 && inorden.size()>0){
				
				//Raiz
				Nodo<E> raiz = new Nodo<E>(preorden.get(0));
				
				//Buscar raiz en inorden
				int i;
				for(i = 0; i < inorden.size(); i++){
					if(inorden.get(i).compareTo(raiz.getKey()) == 0 ){
						break;
					}
				}
				
				//Asignación de hijos correspondientes
				raiz.setHijoIzquierdo(construirArbol(
						new ArrayList<E> (preorden.subList(1, i+1)),
						new ArrayList<E> (inorden.subList(0,i))
				));
				raiz.setHijoDerecho(construirArbol(
						new ArrayList<E> (preorden.subList(i+1, preorden.size())),
						new ArrayList<E> (inorden.subList(i+1,inorden.size()))
				));
				
				return raiz;
			}
			
			return null;
			
		}
		
		
		//-----------------

		//Desde preOrden e inorden
		public Nodo<E> construirArbol2(ArrayList<E> preorden, ArrayList<E> inorden, int preordenInicio, int preordenFin, int inordenInicio, int inordenFin){		
			

			if(preordenInicio<=preordenFin||inordenInicio<=inordenFin){
		    
				
				//Raiz
				Nodo<E> raiz = new Nodo<E>(preorden.get(preordenInicio));
				
				//Buscar raiz en inorden
				int i;
				for(i = inordenInicio; i < inorden.size(); i++){
					if(inorden.get(i).compareTo(raiz.getKey()) == 0 ){
						break;
					}
				}
				
				//Asignación de hijos correspondientes
				raiz.setHijoIzquierdo(construirArbol2(preorden, inorden,preordenInicio+1,preordenInicio+(i-inordenInicio),inordenInicio,i-1));
				raiz.setHijoDerecho(construirArbol2(preorden,inorden,preordenInicio+(i-inordenInicio)+1,inordenFin,i+1,inordenFin));
				
				return raiz;
				
			}
			
			return null;
			
		}
			
		
		
}
