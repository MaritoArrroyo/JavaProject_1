package defecto;

public class Autenticacion_Util {
	private String Clave;
	public boolean iniciarSesion(String clave) {
		return this.Clave == clave;
		
	}

	public void setClave(String clave) {
		this.Clave = clave;
	}
}
