package SetimaAula;

public class Conta {
	private String nomeTitular;
	private double saldo = 0;

	public Conta() {
		saldo = 0;
	}
	
	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void extrato() {
		System.out.println("Nome: " + nomeTitular);
		System.out.println("Saldo atual: " + saldo);
	}

	public void depositar(double valor) {
		if (valor > 0)
			saldo = saldo + valor;
	}

	public void sacar(double valor) {
		if ((valor > 0) && (valor <= saldo))
			saldo = -valor;
	}

}
