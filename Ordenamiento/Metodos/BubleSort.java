package Metodos;

public class BubleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Integer[] arreglo = {1,2,3,4,5,5,10,2,2};
		System.out.println("Método desordenado");
		Imprimir.printList(arreglo);
		System.out.println();
		System.out.println();
		System.out.println("Método ordenado");
		arreglo = (Integer[]) bubbleSort(arreglo);
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
		arreglo2 = (String[]) bubbleSort(arreglo2);
		Imprimir.printList(arreglo2);
		
		
	}
	
	
	
	
	//Método numérico
	public static int[] bubbleSort(int [] a){
		
		//O(n^2)
				 
		for (int i=0; i < a.length-1; i++)

			for (int j=0; j<a.length-1-i; j++)

					if (a[j+1]<a[j]){

						//Variable local, no ocupa memoria, se borra y se crea
						int temp=a[j];

						a[j]=a[j+1];

						a[j+1]=temp;

					}
		return a;

	}
	
	//Método genérico
	public static Comparable[] bubbleSort(Comparable[] a){

		for (int i=0; i < a.length-1; i++)

			for (int j=0; j<a.length-1-i; j++)

					if (a[j+1].compareTo(a[j])<0){

							Comparable temp=a[j];

							a[j]=a[j+1];

							a[j+1]=temp;

					}
		
		return a;

	}

}
