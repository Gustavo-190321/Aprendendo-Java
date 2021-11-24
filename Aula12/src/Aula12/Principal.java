package Aula12;

import java.util.Scanner;

public class Principal {
	
	public static void CadastrarFuncionario(Scanner teclado, Empresa empresa) {
		String aux;
		int op;
		
		System.out.println("1 - Analista");
		System.out.println("2 - Tecnico");
		aux = teclado.nextLine();
		op = Integer.parseInt(aux);
		
		System.out.println("Entre com o nome: ");
		String nome = teclado.nextLine();
		
		if(op == 1) {
			Funcionario analista = new Analista();
			
			analista.setNome(nome);
			analista.setSalario(empresa.getSalarioBaseAnalista());
			empresa.cadastrarFuncionario(analista);
		}
		else {
			Funcionario tecnico = new Tecnico();
			
			tecnico.setNome(nome);
			tecnico.setSalario(empresa.getSalarioBaseTecnico());
			empresa.cadastrarFuncionario(tecnico);
		}
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Empresa empresa = new Empresa();
		
		String aux;
		int op;
		
		System.out.println("Entre com salario base do Analista");
		aux = teclado.nextLine();
		empresa.setSalarioBaseAnalista(Double.parseDouble(aux));
		
		System.out.println("Entre com salario base do Tecnico");
		aux = teclado.nextLine();
		empresa.setSalarioBaseTecnico(Double.parseDouble(aux));
		
		do {
			System.out.println("1- Cadastrar Funcionario");
			System.out.println("2- Imprimir folha de pagamento");
			System.out.println("3- Sair");
			aux = teclado.nextLine();
			op = Integer.parseInt(aux);
			
			switch(op) {
			case 1:
				CadastrarFuncionario(teclado,empresa);
				break;
			case 2: 
				empresa.imprimirFolhaPagamento();
				break;	
			case 3:
			break;
			
			default:
				System.out.println("Opção Invalida");
				break;
			}
			
		}while(op != 3);
	}

}
