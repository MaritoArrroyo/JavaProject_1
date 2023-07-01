package defecto;

public class Test_Referencias {
	public static void main(String[] args) {
		Funcionario g1 = new Gerente();
		g1.setNombre("Dilan");
		
		Gerente gerente = new Gerente();
		gerente.setNombre("Jimena");
		g1.setSalario(2000);
		gerente.setSalario(10000);
		
	}

}
