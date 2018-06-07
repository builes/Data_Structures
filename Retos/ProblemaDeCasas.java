
import java.util.ArrayList;

public class ProblemaDeCasas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(solucion(100));

	}
	
	public static int solucion(int n){
		
		ArrayList<Integer> l = new ArrayList<Integer>();
		
		for(int i=1; i<=n; i++){
			l.add(i);
		}

		int d,i;
		for(int a : l){
			
			d = 0;
			i = 0;
			
			for(int k = a; k < l.size(); k++){
				d += l.get(k);
			}
			
			
			for(int j = a-2; j > -1 ; j--){
				i += l.get(j);
			}
			
			if(d == i) return a;
		}
		
		return -1;
		
	}

}
