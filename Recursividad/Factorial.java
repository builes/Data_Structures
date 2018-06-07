public class Factorial {
	
	public static long factorial(long n){
		
		if(n==1 || n==0)
			return 1;		
		else
			//Ocupa mucho espacio porque deja en memoria cada resultado hasta llegar al final
			return n*factorial(n-1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(5));
	}
	
}
