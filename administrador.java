package defecto;

public class Administrador extends Funcionario implements Autenticable {
	
	private Autenticacion_Util util;

	public Administrador() {
		this.util = new Autenticacion_Util();
	}
	
	@Override
	public double getBonificacion() {
		return this.getSalario();
	}

	@Override
	public void setClave(String clave) {
		this.util.setClave(clave);
	}

	@Override
	public boolean iniciarSesion(String clave) {
		return this.util.iniciarSesion(clave);
	}

}
