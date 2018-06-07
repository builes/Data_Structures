
public class DivisiblesPorTres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,2,3,4,5,6,9,18,1};
		System.out.println(recursivo(a,0,a.length-1));;

	}
	
	
	public static int recursivo(int[] a, int b, int c){
		
		if(b == c){
			
			if(a[b] % 3 == 0){
				
				return 1;
			}
			else{
				return 0;
			}
			
		}
		
		
		int mitad = (b+c)/2;
		return recursivo(a, b, mitad) + recursivo(a, mitad+1, c);
		
		
	}

}
