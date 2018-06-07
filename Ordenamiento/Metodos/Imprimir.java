package Metodos;

public class Imprimir {

	public static void printList(Comparable[] lista){
		
		if(lista!=null)
			for(Comparable p : lista)
				System.out.print(p + " ");
		System.out.println();
		
	}
	
	
}
