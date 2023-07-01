package defecto;

public class Test_Cuenta {
	public static void main(String[] args) {
		CuentaCorriente cc = new CuentaCorriente(1, 1);
		Cuenta_Ahorros ca = new Cuenta_Ahorros(2, 3);
		cc.depositar(2000);
		cc.transfiere(1000, ca);
		
		System.out.println(cc.getSaldo());
		System.out.println(ca.getSaldo());
	}
	
}