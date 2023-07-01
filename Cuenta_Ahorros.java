package defecto;

public class Cuenta_Ahorros extends Cuenta{

	public Cuenta_Ahorros(int Agencia, int Numero) {
		super(Agencia, Numero);
		}

	@Override
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
		
		
		
		
		
		// TODO Auto-generated method stub
		
	}

	public void depositar1(double valor) {
		// TODO Auto-generated method stub
		
	}
	

}
