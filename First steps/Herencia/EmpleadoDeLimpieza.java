package Herencia;

public class EmpleadoDeLimpieza extends Trabajador{

	private float norma;
	private float cump;
	
	public EmpleadoDeLimpieza(String nombre, float salarioBasico,
							  float diasTrabajados, float norma, float cump){

	
	super(nombre, salarioBasico, diasTrabajados);
	this.norma=norma;
	this.cump=cump;
	
	
}
	public float salario(){
		return super.salario()+50*cump/norma;
			//Super porque el metodo es de la clase padre
	}
	
}
