import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Stack;

public class Grafo<E extends Comparable<E>> {

	private LinkedList<Vertice<E>> vertices;

	public Grafo(LinkedList<Vertice<E>> vertices) {
		this.vertices = vertices;
	}

	public Grafo() {
		this.vertices = new LinkedList<Vertice<E>>();
	}

	public LinkedList<Vertice<E>> getVertices() {
		return vertices;
	}

	public void setVertices(LinkedList<Vertice<E>> vertices) {
		this.vertices = vertices;
	}

	public Stack<Vertice<E>> menorCaminoSinPesos(Vertice<E> vInicio, Vertice<E> vDestino) throws Exception {

		Queue<Vertice<E>> vSinVisitar = new LinkedList<Vertice<E>>();
		vSinVisitar.add(vInicio);
		while (!vSinVisitar.isEmpty()) {

			Vertice<E> actual = vSinVisitar.poll();
			
			// Recorrer adyacentes y poner en cola sin visitar
			ListIterator<Arista<E>> iterador = actual.getAdyacentes().listIterator();
			while (iterador.hasNext()) {
				Arista<E> a = iterador.next();
				Vertice<E> v = a.getDestino();
				if (v.getAnterior() == null) {
					v.setAnterior(actual);
					v.setDistancia(actual.getDistancia() + 1);
					vSinVisitar.add(v);
				}
			}

		}
		return camino(vInicio, vDestino);

	}

	public Stack<Vertice<E>> camino(Vertice<E> vInicio, Vertice<E> vDestino) {
		Stack<Vertice<E>> result = new Stack<Vertice<E>>();
		Vertice<E> v = vDestino;
		while (v != null && vInicio.getInfo().compareTo(v.getInfo()) != 0) {
			result.push(v);
			v = v.getAnterior();
		}
		result.push(vInicio);

		return result;
	}

	public static void main(String[] args) {
		
		Vertice<Integer> v1 = new Vertice<Integer>(1);
		Vertice<Integer> v2 = new Vertice<Integer>(2);
		Vertice<Integer> v3 = new Vertice<Integer>(3);
		Vertice<Integer> v4 = new Vertice<Integer>(4);
		Vertice<Integer> v5 = new Vertice<Integer>(5);
		Vertice<Integer> v6 = new Vertice<Integer>(6);
		Vertice<Integer> v7 = new Vertice<Integer>(7);

		Arista<Integer> a12 = new Arista<Integer>(v2, 3);
		Arista<Integer> a13 = new Arista<Integer>(v3, 10);
		Arista<Integer> a14 = new Arista<Integer>(v4, 7);
		Arista<Integer> a25 = new Arista<Integer>(v5, 8);
		Arista<Integer> a24 = new Arista<Integer>(v4, 2);
		Arista<Integer> a36 = new Arista<Integer>(v6, 5);
		Arista<Integer> a47 = new Arista<Integer>(v7, 3);
		Arista<Integer> a57 = new Arista<Integer>(v7, 1);
		Arista<Integer> a67 = new Arista<Integer>(v7, 1);

		v1.getAdyacentes().add(a12);
		v1.getAdyacentes().add(a14);
		v1.getAdyacentes().add(a13);

		v2.getAdyacentes().add(a25);
		v2.getAdyacentes().add(a24);

		v3.getAdyacentes().add(a36);

		v4.getAdyacentes().add(a47);

		v5.getAdyacentes().add(a57);

		v6.getAdyacentes().add(a67);

		Grafo<Integer> grafo = new Grafo<Integer>();
		grafo.getVertices().add(v1);
		
		Stack<Vertice<Integer>> s;
		try {
			s = grafo.menorCaminoSinPesos(v1, v7);
			while(!s.isEmpty()){
				Vertice<Integer> v =s.pop();
				System.out.print(v.getInfo() + " ");
			}
			System.out.println();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		

	}

}
