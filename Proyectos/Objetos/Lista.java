package Objetos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lista<E> {

	public void printList(List<Persona> personas, ChequeCondicion<Persona> cc){
		
		Iterator<E> it = (Iterator<E>) personas.listIterator();
		while(it.hasNext()){
			E p = it.next();
			if(cc.condicion((Persona) p)){
				System.out.println(p.toString());
			}
		}
		
		
	}

}
