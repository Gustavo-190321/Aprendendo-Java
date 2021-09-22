package SetimaAula;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Entre com o nome do titular:");
		String nomeTitular = teclado.nextLine();
		
		System.out.println("Entre com o saldo inicial:");
		double saldoInicial = Double.parseDouble(teclado.nextLine());
		
		Conta conta = new Conta();
		
		conta.setNomeTitular(nomeTitular);
		conta.setSaldo(saldoInicial);
		
		int op = 0;
		do {
			System.out.println("Escolha a Operação:");
			System.out.println("(1) Sacar:");
			System.out.println("(2) Depositar:");
			System.out.println("(3) Extrato:");
			System.out.println("(4) Sair:");
			op = Integer.parseInt(teclado.nextLine());
			
			switch(op) {
			
			case 1:
				System.out.println("Entre com o valor");
				valor = Double.parseDouble(teclado.nextLine());
				conta.sacar(valor);
				break;
			case 2:
				System.out.println("Entre com o valor");
				valor = Double.parseDouble(teclado.nextLine());
				break;
			case 3:
				conta.extrato();
				break;
			default
				System.out.println("Opcao invalida");
			}
			
		}while(op != 4);
		
	}

}
