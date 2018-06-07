public class Binaria {
	
	public static int busquedaBinIterativa(Comparable[] a, Comparable valor){

		int inicio = 0;

		int fin = a.length-1;

		int medio;

		while (inicio <= fin){

			medio = (inicio+fin)/2; // posición media

			if (a[medio].compareTo(valor) == 0){ // búsqueda satisfactoria

				return medio;

			}

			else{ // actualización de los límites

				if (a[medio].compareTo(valor)>0)

					fin = medio-1;

				else

					inicio = medio+1;

			}

		}

			return -1; // no se encontró el elemento

		}
	
	
	public static int busquedaBinRecursiva(Comparable[] a, Comparable valor, int inicio, int fin){

			int medio;

			if (inicio >= fin)

				return a[inicio].compareTo(valor) == 0 ? inicio : -1;

			else {

				medio = (inicio+fin)/2;

				if (a[medio].compareTo(valor) == 0)

					return medio;

				else{

					if (a[medio].compareTo(valor) > 0)

						return busquedaBinRecursiva(a,valor, inicio,medio-1);

					else
				
						return busquedaBinRecursiva(a, valor,medio+1,fin);

				}

			}

		}


}
