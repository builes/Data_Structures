package Arreglos;

import java.util.Arrays;

public class Pruebas {

	public static void main(String[] args) {

		int[] c = { 1, 2, 3, 4, 5 };
		int[] d = { 0, 0, 0, 0, 0, 0 };

		// System.arraycopy(src, srcPos, dest, destPos, length);
		System.arraycopy(c, 0, d, 1, c.length);

		for (int i = 0; i <= d.length - 1; i++) {
			System.out.println(d[i]);
		}
		int[] a = new int[10];

		Arrays.fill(a, 4);

		for (int value : a) {

			System.out.println(value);

		}
	}

}
