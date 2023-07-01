package defecto;

public class Test_Gerente {
	public static void main(String[] args) {
		//Gerente gerente = new Gerente();
		Gerente gerente = new Gerente();
		gerente.setSalario(5000);
		gerente.setClave("Aluracursosonline");
		gerente.setTipo(1);
		System.out.println("este funcionario tiene un salario de: " + gerente.getSalario() + " y una bonificacion de: " + gerente.getBonificacion());
		System.out.println(gerente.iniciarSesion("Aluracursosonline"));
	}
}
