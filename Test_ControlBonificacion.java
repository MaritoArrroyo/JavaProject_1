package defecto;

public class Test_ControlBonificacion {
	public static void main(String[] args) {
		Funcionario diego = new Contador();
		diego.setSalario(2000);
		Gerente jimena = new Gerente();
		jimena.setSalario(10000);
		Contador alex = new Contador();
		alex.setSalario(2500);
		
		ControlBonificacion controlBonificacion = new ControlBonificacion();
		controlBonificacion.registrarSalario(diego);
		controlBonificacion.registrarSalario(jimena);
		controlBonificacion.registrarSalario(alex);
		
		
	}

}
