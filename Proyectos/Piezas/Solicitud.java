package Piezas;

import java.util.Date;

public class Solicitud {

	protected String codigo;
	protected Date fecha;
	protected String codigoPieza;
	protected int cantidad;
	
	
	
	
	public Solicitud(String codigo, Date fecha, String codigoPieza, int cantidad) {
		super();
		this.codigo = codigo;
		this.fecha = fecha;
		this.codigoPieza = codigoPieza;
		this.cantidad = cantidad;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getCodigoPieza() {
		return codigoPieza;
	}
	public void setCodigoPieza(String codigoPieza) {
		this.codigoPieza = codigoPieza;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
}
