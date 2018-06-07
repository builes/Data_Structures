package Arreglos;

public class Produccion {
	
	private String[] productos;
	private int[][] cantidad;
	public Produccion(String[] productos) {
		super();
		this.productos = productos;
		cantidad = new int[5][productos.length];
	}
	
	
	
	
	public String[] getProductos() {
		return productos;
	}




	public void setProductos(String[] productos) {
		this.productos = productos;
	}




	public int[][] getCantidad() {
		return cantidad;
	}


	public void setCantidad(int[][] cantidad) {
		this.cantidad = cantidad;
	}




	private int produccionTotal(){
		int total = 0;
		for(int i=0; i < cantidad.length; i++){
			for(int j=0; j < cantidad[i].length; j++){
				
				total += cantidad[i][j];
				
			}
		}
		return total;
		
	}
	
	private int produccionDiaria(String dia){
		
		String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes"};
		
		int contador = 0;
		int contador2 = 0;
		while(dia != dias[contador]){
			if(dia.equals(dias[contador])){
				contador2 = contador;
				break;
			}
			contador++;
		}
		
		
		int total = 0;
		
		for(int i=0; i < cantidad[contador2].length; i++){
			
			total += cantidad[contador2][i];
			
		}
		
		return total;
	}



}
