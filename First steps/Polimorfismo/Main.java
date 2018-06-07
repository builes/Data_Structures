package Polimorfismo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cero[] listas = new Cero[4];
		Cero d0 = new Dos(1,1,1);
		listas[0] = d0;
		Cero d1 = new Uno(3,4);
		listas[1] = d1;
		Cero d2 = new Dos(3,4,5);
		listas[2] = d2;
		Cero d3 = new Cero(){
		
			
			public int suma(){
				return 0;
			}
			
			public int multiplicacion(){
				return 0;
			}
			
		};
		listas[3] = d3;
		
		for(Cero u: listas){
			System.out.println(u.suma());

			if(u instanceof Dos) {System.out.println("Dos: "+
						((Dos)u).multiplicacion2() );
						//Typecast
			}
		}

	}

}
