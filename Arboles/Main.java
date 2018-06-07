import java.awt.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//http://decsai.ugr.es/~jfv/ed1/tedi/cdrom/icons/arb2.gif
		
		
		Arbol<String> a = new Arbol<String>(null);
		ArrayList<String> preorden = new ArrayList<>();
		ArrayList<String> inorden = new ArrayList<>();
		
		preorden.add("G");
		preorden.add("E");
		preorden.add("A");
		preorden.add("I");
		preorden.add("B");
		preorden.add("M");
		preorden.add("C");
		preorden.add("L");
		preorden.add("D");
		preorden.add("F");
		preorden.add("K");
		preorden.add("J");
		preorden.add("H");
		
		inorden.add("I");		
		inorden.add("A");
		inorden.add("B");
		inorden.add("E");
		inorden.add("G");
		inorden.add("L");
		inorden.add("D");
		inorden.add("C");
		inorden.add("F");
		inorden.add("M");
		inorden.add("K");
		inorden.add("H");
		inorden.add("J");

		
		a.setRaiz(a.construirArbol(preorden, inorden));
	

		a.preOrden();
		
		System.out.println("");
		
		
		a.setRaiz(a.construirArbol2(preorden, inorden,0,preorden.size()-1,0,inorden.size()-1));

		a.preOrden();

	}

}
