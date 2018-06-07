
public class Adivina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(adivina(100));
		
	}
	
	private static int adivina(int N){
		int c=N;
		while (c>0){
			if (c==N)
				for (int i=1;i<c;i++){
					if (i%3== 0)
						System.out.print(i + " ");
				}
			c=c/3;
		}
		return c;
	}


}
