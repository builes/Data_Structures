public class Secuencial {
	
	public static int busqueda(Comparable[] ps, Comparable p3){

		int i = 0;

		while ( i < ps.length && ps[i] != p3) i++ ;

		return i == ps.length ? -1: i;

	}
}
