package Metodos;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] arreglo = {1,2,3,4,5,5,10,2,2, 999,-1,-4,-5,19};
		System.out.println("Método desordenado");
		Imprimir.printList(arreglo);
		System.out.println();
		System.out.println();
		System.out.println("Método ordenado");
		arreglo = (Integer[]) quickSort(arreglo);
		Imprimir.printList(arreglo);
		System.out.println();
		System.out.println();
		System.out.println();
		
		String[] arreglo2 = {"Ricardo", "Andrés", "Felipe", "Jarod"};
		System.out.println("Método desordenado");
		Imprimir.printList(arreglo2);
		System.out.println();
		System.out.println();
		System.out.println("Método ordenado");
		arreglo2 = (String[]) quickSort(arreglo2);
		Imprimir.printList(arreglo2);
		
	}
	
	public static Comparable[] quickSort(Comparable[] a){

		return quickSort(a, 0, a.length-1);

	}
	
	private static Comparable[] quickSort(Comparable[] a, int inicio, int fin){

		if (fin <= inicio)

			return a;

		else {

			
			Comparable pivote = a[fin];
			
			int i = inicio;

			int j = fin;
			
			Comparable temp;
			
			
				while (i <= j) { 

					 //Para cuando encontramos un valor mayor que el pivote
					 while (a[i].compareTo(pivote)<0) {
                         i++;
					 }
					 
					//Para cuando encontramos un valor menor que el pivote
					 while (a[j].compareTo(pivote)>0) {
                         j--;
                 	}
					 
					 
					//Si i es menor o igual que jota, intercambiamos	
					if( i <= j ){

							temp = a[i];
		                	
							a[i] = a[j];
		                	
							a[j] = temp;
							
							i++;
							
                            j--;

					}

				}		

				if (inicio < j)
                    quickSort(a, inicio, j);
				if (i < fin)
                    quickSort(a, i, fin);

			}

		return a;
		
		}

}
