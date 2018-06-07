public class InvertirString {

	public static String invertir(String s) {
		return invertir(s, 0);
	}

	public static String invertir(String s, int n) {
		
		if (n == s.length() - 1) 
			return Character.toString(s.charAt(n));
		else
			return invertir(s, n + 1) + s.charAt(n);
		
	}

	public static void main(String[] args) {
		System.out.println(invertir("Sarita"));
	}
	
}
