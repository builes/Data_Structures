public class SumaDeUnArreglo {


	public static int suma(int[] v){
		return suma(v, 0);
	}
	
	public static int suma(int[] v, int n){
		
		if(n == v.length-1)
			return v[n];
		
		else
			return v[n] + suma(v,n+1);
					
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] m = {1,2,3,4,5};
		System.out.println(suma(m));

	}
	
}