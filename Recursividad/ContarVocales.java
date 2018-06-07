public class ContarVocales {

	public static int contarVocales(String c) {
		c = c.toLowerCase();
		return contarVocales(c, c.length()-1);
	}

	public static int contarVocales(String c, int i) {
		
		String vocales = "aeiou";
		
		if (i < 0) {
			return 0;
		}
		
		if (vocales.contains(Character.toString(c.charAt(i)))) {
			return 1 + contarVocales(c, i - 1);
		}
		
		return contarVocales(c, i - 1);
	}

	public static void main(String[] args){
		System.out.println(contarVocales("sarita"));
	}
	
}
