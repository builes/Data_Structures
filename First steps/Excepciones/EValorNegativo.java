package Excepciones;


public class EValorNegativo extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EValorNegativo(){
		super("Valor negativo no permitido");
	}
		
}
