package Excepciones;

public class Cuenta {
	
	public float getSaldo() {
		return saldo;
	}

	private float saldo;
	
	public Cuenta(float saldoInicial) throws EValorNegativo{
		if(saldoInicial>0)
		saldo=saldoInicial;
		else
			throw new EValorNegativo();
	}
	
											
	//Lanza hacia cualquier otro método que lo use
	public void depositar(float v) throws EValorNegativo{
		if(v>0){
			saldo+=v;
		}
		else{
			throw new EValorNegativo();
		}
	}
	
	public void extraer(float v) throws EValorNegativo, EValorMayorSaldo{
		
		if(v>0){
			if(v<=saldo){
				saldo-=v;}
			else{
				throw new EValorMayorSaldo();}
			
		}else{
			throw new EValorNegativo();}
		
	}
	

}


