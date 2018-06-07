package Metodos;

public class SelectSort {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] arreglo = {99,87,11,56,43,25,68,9,1,26,28,2,3};
		System.out.println("Método desordenado");
		Imprimir.printList(arreglo);
		System.out.println();
		System.out.println();
		System.out.println("Método ordenado");
		selectionSort(arreglo);
		Imprimir.printList(arreglo);
		System.out.println();
		System.out.println();
		System.out.println();
	}
	
	
	
	public static void selectionSort2(Comparable [] a){

		
		//Crecientemente posiciones pares
		for (int i=0; i<a.length-3; i += 2){
			
				int menorPar	=	i;
			
				for (int j=i+2; j<a.length; j += 2){

					if (a[j].compareTo(a[menorPar])<0){
						
						menorPar=j;
					
					}
					
				}

				Comparable temp = a[i];

				a[i]=a[menorPar];

				a[menorPar]=temp;
						
					
				
		}
		
		
		//Decrecentemente posiciones impares
		for (int t=1; t<a.length-1; t += 2){
				
				int mayorImpar	=	t;
				
				for (int k=t+2; k<a.length; k += 2){

					if (a[k].compareTo(a[mayorImpar])>0){
						

						mayorImpar=k;
						
					}
					
				}

				Comparable temp=a[t];

				a[t]=a[mayorImpar];

				a[mayorImpar]=temp;
						
		}
		
		
		
	}
	
	
	public static Comparable[] selectionSort(Comparable [] a){

		//O(n^2)
		
		for (int i=0; i<a.length-1; i++){

			int im=i;

			
			//Recorro toda la lista buscando uno menor que el menor actual
			for (int j=i+1; j<a.length; j++){

					if (a[j].compareTo(a[im])<0){
						
						//O(n)
						//Más eficiente que bubleSort

						im=j;
						
					}
					
			}

			 Comparable temp=a[i];

			 a[i]=a[im];

			 a[im]=temp;

			}

		return a;
		
		
	    }

}
