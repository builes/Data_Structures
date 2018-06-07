package Objetos;

public class ChequeCondicion<E> implements Condicion<Persona> {

	@Override
	public boolean condicion(Persona p){
		
		return (p.edad >= 18) && (p.edad<=25) && (p.sexo == Persona.Sex.Masculino);
		
	}
	
}
