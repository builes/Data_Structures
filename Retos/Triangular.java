
public class Triangular {
	
	
	public static boolean recursivo(int n, int a){

		if((a*(a+1))/2 == n){
			return true;
		}
		
		if(a>n){
			return false;
		}
		
		return recursivo(n, a+1);
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Triangular.recursivo(78,1));

	}

}
