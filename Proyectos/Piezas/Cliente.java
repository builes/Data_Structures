package Piezas;

public class Cliente {

	protected String codigo;
	protected String nombre;
	protected String direccion;
	protected String correoElectronico;
	protected String medioDePago;
	protected Solicitud Solicitudes[];
	
	
	
	
	
	public Cliente(String codigo, String nombre, String direccion, String correoElectronico, String medioDePago,
			Solicitud[] solicitudes) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.direccion = direccion;
		this.correoElectronico = correoElectronico;
		this.medioDePago = medioDePago;
		Solicitudes = solicitudes;
	}
	
	
	
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	public String getMedioDePago() {
		return medioDePago;
	}
	public void setMedioDePago(String medioDePago) {
		this.medioDePago = medioDePago;
	}
	public Solicitud[] getSolicitudes() {
		return Solicitudes;
	}
	public void setSolicitudes(Solicitud[] solicitudes) {
		Solicitudes = solicitudes;
	}
	
	
	
}
