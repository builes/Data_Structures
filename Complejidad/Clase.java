
public class Clase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(mayorNumero(999,3));
		
		String[] vectorPrueba = {"hola", "nelson", "jarod", "richar"};
		imprimirVector(vectorPrueba);
		
		
		String[][] matrizPrueba = {{"hola", "nelson", "jarod", "richar"},
								   {"hola2", "nelson2", "jarod2", "richar2"}};
		imprimirMatriz(matrizPrueba);
		
	}
	
									//1        //1  = 2
	public static double mayorNumero(double a, double b){
		
		return (a>b) ? a : b;
				//1  //1  //1 == 2
		
		//Cantidad de pasos: 4
		//O(4) = O(1)
		//Solución = O(1)
	}
									  //1	
	public static void imprimirVector(String[] vector){
		
		//Tamaño del vector = n
		
			//2         //n+1  			//n  = 
		for(int i = 0; i<vector.length; i++){
			//n				   //n
			System.out.println(vector[i]);
		}
		
		
		//Cantidad de pasos: 4n + 4
		//O(4n + 4) = O(n) + O(4) = O(n) + O(1)
		//Solución = O(n)
		
	}
	
									  //1
	public static void imprimirMatriz(String[][] matriz){
		
		//Tamaño de filas: n
		//Tamaño de columnas: m
		
			//2			//n+1			//n
		for(int i = 0; i < matriz.length; i++){
				//2N		       //(n*m)+1			//m
			for(int j = 0; j < matriz[i].length; j++){
				
				//n*m
				System.out.println(matriz[i][j]);
				
			}
			
		}

		//O(n*m)
		
	}
		

}