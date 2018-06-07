package Pilas;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pila<Integer> pila = new Pila<Integer>();
		
		pila.push(68);
		pila.push(96);
		
		System.out.println(pila.getSize());
		System.out.println(pila.pop());
		System.out.println(pila.peek());
		System.out.println(pila.getSize());
		
	}

}
