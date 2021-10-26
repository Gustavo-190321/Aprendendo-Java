package escola;

import java.util.Scanner;

public class Principal {
	
	public static void cadastrarAluno(Scanner teclado, Escola escola) {

		Aluno aluno = new Aluno();
		
		System.out.println("\nInserir um Aluno");
		System.out.println("Id: ");
		int id = Integer.parseInt(teclado.nextLine());
		aluno.setIdAluno(id);
		
		System.out.println("Nome: ");
		aluno.setNome(teclado.nextLine());
		
		System.out.println("CPF: ");
		int cpf = Integer.parseInt(teclado.nextLine());
		aluno.setCpf(cpf);
		
		System.out.println("Data de Nascimento: ");
		int data = Integer.parseInt(teclado.nextLine());
		aluno.setDataNascimento(data);
		
		escola.cadastrarAluno(aluno);
	}
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Escola escola = new Escola();
		int opc = 0;

		do {
			@SuppressWarnings("resource")
			Scanner menu = new Scanner(System.in);
			System.out.print("\n");
			System.out.println("Cadastro de Estudantes");
			System.out.println("1 – Cadastrar");
			System.out.println("2 – Listar");
			System.out.println("3 – Pesquisar");
			System.out.println("4 – Atualizar");
			System.out.println("5 – Remover");
			System.out.println("6 – Sair");
			opc = menu.nextInt();

			if (opc == 1) {
				// Cadastrar 1 (um) funcionario
				cadastrarAluno(teclado, escola);
			}

			else if (opc == 2) {
				// Listar todos os funcionarios
				escola.listarAlunos();
			}

			else if (opc == 3) {
				
			} 
			else if (opc == 4) {
				
			} 
			else if (opc == 5) {
				
			}
		} while (opc != 6);

		System.out.print("Voce Saiu");
		// Fechando o teclado
		teclado.close();
	}
	}

