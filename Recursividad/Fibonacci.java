public class Fibonacci {

	//Recursivo
	public static long fibonacci(long n){
		if (n<=1)
			return n;
		else
			return  fibonacci(n-2) + fibonacci(n-1);	
	}
	
	//Iterativo
	public static long fibonacci2(long n){
		
		if(n<=1)
			return n;
		
		long anterior = 0;
		long actual = 1;
		
		for(int i = 0; i < n-1; i++){
			long x 	 = anterior;
			anterior = actual;
			actual 	 = x + anterior;
		}
		
		return actual;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(fibonacci(10));
		System.out.println(fibonacci2(10));

	}
	
}