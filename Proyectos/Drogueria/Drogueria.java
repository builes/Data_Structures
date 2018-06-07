package Drogueria;

import java.util.Date;

public class Drogueria {
	
	protected Cliente[] listaClients;
	protected Medicamento[] listaMedicamentos;
	protected Restringido[] listaMedicamentosRestringidos;
	protected Compra[] listaCompras;
	
	
	public Drogueria() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public void addCliente(Cliente c){
		
	}
	
	public void addCompra(int[] cantidadesMedicamentos){
		
	}
	
	public void addMedicamento(Medicamento m){
		
	}
	
	public Cliente buscarClientes(String cedula){
		Cliente c = new Cliente();
		return c;
	}
	
	public Medicamento buscarMedicamento(String codigo){
		Medicamento m = new Medicamento();
		return m;
	}
	
	
	/*
	 * c)	Implemente el método en la clase principal que devuelve la cantidad de medicamentos restringidos 
	 * que  se han comprado, o sea, los que están en la lista de compras (listaCompras). Tenga en cuenta que 
	 * los medicamentos comprados  en cada compra (clase Compra) están en ListaMedicamentos y la cantidad de unidades
	 *  de cada uno está en listacantidades (0.5 puntos).
	 * */
	public int cantidadMedicamentosRestringidosEnCompra(Compra c){
		
		int b = 0;
		
		for(int a : c.listaDeCantidades){
			for(Restringido r : listaMedicamentosRestringidos){
				if(c.listaDeMedicamentos[a] == r.getNombreComercial()){
					b += c.listaDeCantidades[a];
				}
			}
		}
		
		return b;
	}
	
	
	public int disponibilidadMedicamento(Medicamento m){
		return 0;
	}

	public int disponibilidadMedicamento(String codigo){
		return 0;
	}
	
	
	
	/*  
	 * 3.	Basado en el ejercicio 1. Haga un procedimiento recursivo (en la clase Droguería que se describe abajo) 
	 * que devuelva la cantidad de compras de la lista de compras cuya cantidad de medicamentos sea mayor que 2, o sea, 
	 * que el tamaño de la lista de medicamentos en la compra sea mayor a 2, no importa la cantidad que se compró de cada 
	 * uno. Impleméntelo con la estrategia “divide y vencerás” (1.5 puntos).
	 * */
	
	public static int recursividad(Compra[] compra, int i, int f){
		

		if (i==f) {
			if(compra[i].getListaDeCantidades().length > 2){
				return 1;
			}
			return 0;
		}
		
		int medio = (i+f)/2;
		return recursividad(compra, i, medio) + recursividad(compra, medio+1, f);
		
	}
	
	
	
}
