package PriorityQueues;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Comparator;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Comparator<Integer> comparator = new NumbersComparator();
	     PriorityQueue<Integer> pq = new PriorityQueue<Integer>(10, comparator);
	     pq.add(2);
	     pq.add(99);
	     pq.add(-2);
	     pq.add(3);
	     pq.add(55);
	     
	     while (pq.size() != 0){
	         System.out.println(pq.remove());
	     }

	}

	public static class StringLengthComparator implements Comparator<String>{
	 @Override
	 	public int compare(String x, String y){
		 		return x.length() - y.length();
	 	}
	}
	
	public static class NumbersComparator implements Comparator<Integer>{
		@Override
		public int compare(Integer x, Integer y){
			return x-y;
		}
	}

}