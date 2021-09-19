package ProjetoInt;

import java.util.ArrayList;
import java.util.Scanner;

public class Opcoes {

	public ArrayList<String> IdAluno = new ArrayList<String>();
	public ArrayList<String> nomeAluno = new ArrayList<String>();
	public ArrayList<String> dataAluno = new ArrayList<String>();
	public ArrayList<String> cpfAluno = new ArrayList<String>();

	public Scanner teclado = new Scanner(System.in);

	public void Cadastrar() {
		String VetorcpfAluno;

		System.out.println("Cadastro de aluno");
		System.out.println();

		System.out.println("Id do aluno");
		String VetorIdAluno = teclado.nextLine();
		IdAluno.add(VetorIdAluno);

		System.out.println("Nome do aluno");
		String VetornomeAluno = teclado.nextLine();
		nomeAluno.add(VetornomeAluno);

		System.out.println("Data de nascimento do aluno");
		String VetordataAluno = teclado.nextLine();
		dataAluno.add(VetordataAluno);

		System.out.println("CPF do aluno");
		VetorcpfAluno = teclado.nextLine();
		cpfAluno.add(VetorcpfAluno);
	}

	public void Listar() {
		int i;
		System.out.println("Alunos listados");

		for (i = 0; i < IdAluno.size(); i++) {
			System.out.println("Id Aluno:" + IdAluno.get(i));
			System.out.println("Nome Aluno:" + nomeAluno.get(i));
			System.out.println("Data de Nascimento:" + dataAluno.get(i));
			System.out.println("CPF do aluno:" + cpfAluno.get(i));
		}
	}

	public void Pesquisar() {
		System.out.println("Digite o nome do aluno");
	}

	public void Atualizar() {
		System.out.println("Digite o Id do aluno");
	}

	public void Remover() {
		System.out.println("Cuidado voce esta preste a excluir um aluno cadastrado");
		System.out.println("Digite o Id do aluno");
	}

}
