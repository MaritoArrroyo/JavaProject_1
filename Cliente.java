package defecto;

public class Cliente implements Autenticable {
	private String Titular;
	private String Nombre;
	private String Documento;
	private String Telefono;
	private String Clave;
	private Autenticacion_Util util;
	
	public Cliente() {
		this.util = new Autenticacion_Util();
	}
	
	public String getTitular() {
		return Titular;
	}
	public void setTitular(String titular) {
		Titular = titular;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getDocumento() {
		return Documento;
	}
	public void setDocumento(String documento) {
		Documento = documento;
	}
	public String getTelefono() {
		return Telefono;
	}
	@Override
	public boolean iniciarSesion(String clave) {
		// TODO Auto-generated method stub
		return this.util.iniciarSesion(clave);
	}
	@Override
	public void setClave(String clave) {
		// TODO Auto-generated method stub
		this.setClave(clave);
	}
	
	

}
