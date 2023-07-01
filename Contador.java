package defecto;

public class Contador extends Funcionario {
	private String clave;

	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public boolean iniciarSesion(String clave) {
		return clave == "Aluracursosonline";
		
	}
	@Override
	public double getBonificacion() {
		System.out.println("Ejecutando desde contador");
		return 200;
	}
	
	

}
