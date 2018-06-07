package Complejo;

public class Main {

	private static double getModulo(double a, double b){
		
		return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		
	}
	
	private static double getArgumento(double a, double b){
		
		return Math.asin(b/a);
		
	}
	
	public static void main(String[] args) {
	
		
		NumeroComplejo nuevo = new NumeroComplejo(2,3);
		System.out.println(nuevo.getEntero());
		System.out.println(nuevo.getRealcito());
		System.out.println(getModulo(2,3));
		System.out.println(getArgumento(100,10));
		

	}

}
