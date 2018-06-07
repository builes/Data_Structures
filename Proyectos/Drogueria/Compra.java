package Drogueria;

import java.util.Date;

public class Compra {
	
	protected String codigo;
	protected Cliente cliente;
	protected Date fecha;
	protected String[] listaDeMedicamentos;
	protected int[] listaDeCantidades;
	
	
	
	
	
	public Compra(int[] listaDeCantidades) {
		super();
		this.listaDeCantidades = listaDeCantidades;
	}



	public Compra(String codigo, Cliente cliente, Date fecha, String[] listaDeMedicamentos, int[] listaDeCantidades) {
		super();
		this.codigo = codigo;
		this.cliente = cliente;
		this.fecha = fecha;
		this.listaDeMedicamentos = listaDeMedicamentos;
		this.listaDeCantidades = listaDeCantidades;
	}



	public Compra(String codigo, Cliente cliente, Date fecha, String[] listaDeMedicamentos) {
		super();
		this.codigo = codigo;
		this.cliente = cliente;
		this.fecha = fecha;
		this.listaDeMedicamentos = listaDeMedicamentos;
	}



	public Compra(String codigo, Cliente cliente, Date fecha) {
		super();
		this.codigo = codigo;
		this.cliente = cliente;
		this.fecha = fecha;
	}



	protected void addMedicamento(String m, int cantidad){
		
	}



	public String getCodigo() {
		return codigo;
	}



	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}



	public Cliente getCliente() {
		return cliente;
	}



	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}



	public Date getFecha() {
		return fecha;
	}



	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}



	public String[] getListaDeMedicamentos() {
		return listaDeMedicamentos;
	}



	public void setListaDeMedicamentos(String[] listaDeMedicamentos) {
		this.listaDeMedicamentos = listaDeMedicamentos;
	}



	public int[] getListaDeCantidades() {
		return listaDeCantidades;
	}



	public void setListaDeCantidades(int[] listaDeCantidades) {
		this.listaDeCantidades = listaDeCantidades;
	}
	
	

}
