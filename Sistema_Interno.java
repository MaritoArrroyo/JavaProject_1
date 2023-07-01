package defecto;

public class Sistema_Interno {
	private String clave = "12345";
	public boolean autentica(Autenticable gerente) {
		boolean puedeIniciarSesion = gerente.iniciarSesion(clave);
		
		if (puedeIniciarSesion) {
			System.out.println("login Exitoso");
			return true;
		}
		else {
			System.out.println("Error en login");
			return false;
		}
	}
	

}
