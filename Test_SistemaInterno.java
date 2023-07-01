package defecto;

public class Test_SistemaInterno {
	public static void main(String[] args) {
		Sistema_Interno sistema = new Sistema_Interno();
		Gerente gerente1 = new Gerente();
		Administrador admin = new Administrador();
		
		sistema.autentica(gerente1);
		sistema.autentica(admin);
		
	}

}
