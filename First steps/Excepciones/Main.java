package Excepciones;

public class Main {

	public static void main(String[] args) {

		try {
			Cuenta c = new Cuenta(555);
			c.depositar(50);
			c.extraer(20);
		} catch (EValorNegativo e) {
			
			//Consigue el mensajito
			System.out.println(e.getMessage());
			
		} catch (EValorMayorSaldo e) {
			
			System.out.println(e.getMessage());
		}
		finally{
			System.out.println("Se acabó el flujo");
		}
		
	}

}
