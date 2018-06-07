package Objetos;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Persona> personas = new ArrayList<Persona>();
		Persona a = new Persona ("Ricardo", 19, Persona.Sex.Masculino);
		Persona b = new Persona ("Estefania", 20, Persona.Sex.Femenino);
		Persona c = new Persona ("Sara", 20, Persona.Sex.Femenino);
		Persona d = new Persona ("Andrés", 33, Persona.Sex.Masculino);
		Persona e = new Persona ("Juan", 18, Persona.Sex.Masculino);
		Persona r = new Persona ("Lúcio", 14, Persona.Sex.Masculino);
		Persona t = new Persona ("Leonardo", 20, Persona.Sex.Masculino);
		personas.add(a);
		personas.add(b);
		personas.add(c);
		personas.add(d);
		personas.add(e);
		personas.add(r);
		personas.add(t);
		ChequeCondicion<Persona> cc = new ChequeCondicion<Persona>();
		Lista l = new Lista();
		l.printList(personas,cc);


	}

}
