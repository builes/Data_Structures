package Metodos;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] arreglo = {1,2,3,4,5,5,10,2,2};
		System.out.println("Método desordenado");
		Imprimir.printList(arreglo);
		System.out.println();
		System.out.println();
		System.out.println("Método ordenado");
		arreglo = (Integer[]) insertSort(arreglo);
		Imprimir.printList(arreglo);
		System.out.println();
		System.out.println();
		System.out.println();
		
		float a = System.currentTimeMillis();
		String[] arreglo2 = {"Ricardo", "Andrés", "Felipe", "Jarod"};
		System.out.println("Método desordenado");
		Imprimir.printList(arreglo2);
		System.out.println();
		System.out.println();
		System.out.println("Método ordenado");
		arreglo2 = (String[]) insertSort(arreglo2);
		Imprimir.printList(arreglo2);
		float b = System.currentTimeMillis();
		System.out.println(b-a);
		
		
	}
	
	public static Comparable[] insertSort(Comparable[] a){

		for( int i=1; i<a.length; i++ ) {

			Comparable temp=a[i]; //el que quiero insertar

			int j=i;

				while(j>0 && temp.compareTo(a[j-1])<0) {

					a[j]=a[j-1];

					j--;

				}

			a[j]= temp;

		}
		
		return a;

	}

}
