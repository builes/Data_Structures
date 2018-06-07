public class MaximoDeUnArreglo {
		
	public static int maximo(int[] w){
		return maximo(w,0);
	}
	
	
	public static int maximo(int[] v, int i){
		
		if(i == v.length-1)
			return v[v.length-1];
		else
			return Math.max(v[i],maximo(v, i+1));
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] m = {1,2,3,4,5};
		System.out.println(maximo(m));

	}

}