package defecto;

public class Gerente extends Funcionario implements Autenticable {
	private String clave;

	
	public double getBonificacion() {
		System.out.println("Ejecutando desde gerente");
		return  2000;
	}


	@Override
	public boolean iniciarSesion(String clave) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void setClave(String clave) {
		// TODO Auto-generated method stub
		
	}
	
	


	
	

}
