package SextaAula;

public class Principal {

	public static void main(String[] args) {

		Conta minhaConta = new Conta();

		//minhaConta.nomeTitular = "Gustavo";
		minhaConta.setNomeTitular("Gustavo");
		
		
		minhaConta.depositar(150);
		minhaConta.extrato();

		minhaConta.sacar(50);
		minhaConta.extrato();
		
	}

}
