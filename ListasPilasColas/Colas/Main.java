package Colas;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cola<Integer> c = new Cola<Integer>();
		c.enqueue(1);
		c.enqueue(2);
	 	c.enqueue(3);
	 	c.enqueue(4);
	 	

	 	System.out.println(c.getElement(0));
	 	System.out.println(c.getElement(1));
	 	System.out.println(c.getElement(2));
	 	System.out.println(c.getElement(3));
	 	
	 	System.out.println("");
	 	System.out.println("Reverse");
	 	System.out.println("");
	 	c.reverse();
	 	
	 	System.out.println(c.getElement(0));
	 	System.out.println(c.getElement(1));
	 	System.out.println(c.getElement(2));
	 	System.out.println(c.getElement(3));
	 	
	 	
	}

}
