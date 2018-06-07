package Polimorfismo;

public class Uno extends Cero{

	@Override
	public int suma() {
		// TODO Auto-generated method stub
		return this.a + this.b;
	}

	@Override
	public int multiplicacion() {
		// TODO Auto-generated method stub
		return this.a * this.b;
	}

	protected int a;
	protected int b;
	public Uno(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	
	
}
