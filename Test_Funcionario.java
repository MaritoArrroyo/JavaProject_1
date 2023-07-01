package defecto;

public class Test_Funcionario {
	public static void main(String[] args) {
		Funcionario diego = new Contador();
		diego.setDocumento("Diego");
		diego.setDocumento("445566565");
		diego.setSalario(2000);
		System.out.println(diego.getSalario());
		System.out.println(diego.getBonificacion());
		
	}

}
