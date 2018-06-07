package Test;

import java.util.ArrayList;

import Metodos.*;
import Test.Persona.Sex;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona a = new Persona("Carlos",15,Sex.Masculino);
		Persona b = new Persona("Felipe",17,Sex.Femenino);
		Persona c = new Persona("Ana",15,Sex.Femenino);
		Persona d = new Persona("Rosa",19,Sex.Femenino);
		Persona e = new Persona("Jose",20,Sex.Femenino);
		Persona f = new Persona("Ricardo",15,Sex.Femenino);
		Persona[] personas = {a,b,c,d,e,f};
		MergeSort mg = new MergeSort();
		mg.sort(personas);

		for(Persona p : personas){
			System.out.print(p + " ");
			System.out.println();
		}
	}

}
