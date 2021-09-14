package SextaAula;

	public class Conta {
		public String nomeTitular;
		public double saldo = 0;
		
		public Conta() {
		saldo = 0;
		}
		
		public void extrato() {
		System.out.println("Nome: " + nomeTitular);
		System.out.println("Saldo atual: " + saldo);
		}
		
		public void depositar(double valor) {
		saldo = saldo + valor;
		}
		
		public void sacar (double valor) {
		saldo = saldo - valor;
		}
		
	}


