package empresa;

import java.util.Scanner;

public class Principal {
	
	public static void cadastrarFuncionario(Scanner teclado, Empresa empresa) {

		Funcionario funcionario = new Funcionario();
		
		System.out.println("\nInserir um funcionário");
		System.out.println("Id: ");
		int id = Integer.parseInt(teclado.nextLine());
		funcionario.setId(id);
		
		System.out.println("Nome: ");
		funcionario.setNome(teclado.nextLine());
		
		System.out.println("Salário: ");
		double salario = Double.parseDouble(teclado.nextLine());
		funcionario.setSalario(salario);
		
		System.out.println("Cargo: ");
		funcionario.setCargo(teclado.nextLine());
		
		empresa.cadastrarFuncionario(funcionario);
	}
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Empresa empresa = new Empresa();
		
		// Cadastrar 1 (um) funcionario
		cadastrarFuncionario(teclado, empresa);
		
		// Listar todos os funcionarios
		empresa.listarFuncionarios();	
		
		// Fechando o teclado
		teclado.close();
	}
}
