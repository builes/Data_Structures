public class SumaDeNumerosNaturales {

	public static int suma(int n){
	
		if(n==0)
			return 0;
		else
			return n + suma(n-1);
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println(suma(20));

	}

}