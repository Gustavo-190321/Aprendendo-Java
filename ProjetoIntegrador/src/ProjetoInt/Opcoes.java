package ProjetoInt;

import java.util.ArrayList;
import java.util.Scanner;

public class Opcoes {
	private int VetorIdAluno;
	private int VetornomeAluno;
	private int VetordataAluno;
	private int VetorcpfAluno;

	private ArrayList<Integer> IdAluno = new ArrayList<Integer>();
	
	public Scanner teclado = new Scanner(System.in);

	public void Cadastrar() {

		System.out.println("Cadastro de aluno");
		System.out.println("");

		System.out.println("Id do aluno");
		VetorIdAluno = teclado.nextInt();
		IdAluno.add(VetorIdAluno);

		System.out.println("Nome do aluno");
		VetornomeAluno = teclado.nextInt();
		IdAluno.add(VetornomeAluno);

		System.out.println("Data de nascimento do aluno");
		VetordataAluno = teclado.nextInt();
		IdAluno.add(VetordataAluno);

		System.out.println("CPF do aluno");
		VetorcpfAluno = teclado.nextInt();
		IdAluno.add(VetorcpfAluno);
	}

	public void Listar() {
		System.out.println("Alunos listados");

		System.out.println("Id Aluno:" + IdAluno.get(0));
		System.out.println("Nome do Aluno:" + IdAluno.get(1));
		System.out.println("Data de nascimento do aluno:" + IdAluno.get(2));
		System.out.println("CPF do Aluno:" + IdAluno.get(3));
	}

	public void Pesquisar() {
		int i;
		System.out.println("Digite o nome do Aluno");
		i = teclado.nextInt();
		if (i != VetornomeAluno) {
			System.out.println("Digite um Nome Válido");
		}
		System.out.println("Nome do Aluno:" + IdAluno.get(1));
		System.out.println("Id Aluno:" + IdAluno.get(0));
		System.out.println("Data de nascimento do aluno:" + IdAluno.get(2));
		System.out.println("CPF do Aluno:" + IdAluno.get(3));
	}

	public void Atualizar() {
		int i;
		System.out.println("Digite o id do Aluno");
		i = teclado.nextInt();
		System.out.println("Digite o nome do aluno");
		if (i != VetorIdAluno) {
			System.out.println("Digite um id Valido");
		} else {
			int valorNome = IdAluno.indexOf(VetornomeAluno);
			int novoNome = teclado.nextInt();

			if (valorNome == -1) {
				System.out.println("valor não encontrado");

			} else {
				IdAluno.set(valorNome, novoNome);

				System.out.println("Registro alterado com sucesso");
			}
			System.out.println("Digite a data de Nascimento do aluno");
			int valorData = IdAluno.indexOf(VetordataAluno);
			int novoData = teclado.nextInt();

			if (valorData == -1) {
				System.out.println("valor não encontrado");

			} else {
				IdAluno.set(valorData, novoData);

				System.out.println("Registro alterado com sucesso");
			}

			System.out.println("Digite o CPF do aluno");
			int valorCpf = IdAluno.indexOf(VetorcpfAluno);
			int novoCpf = teclado.nextInt();

			if (valorCpf == -1) {
				System.out.println("valor não encontrado");

			} else {
				IdAluno.set(valorCpf, novoCpf);

				System.out.println("Registro alterado com sucesso");
			}
		}
	}

	public void Remover() {
		int i;
		System.out.println("Digite o id do Aluno");
		i = teclado.nextInt();

		if (i != VetorIdAluno) {
			System.out.println("Digite um ID valido");
		} else {
			IdAluno.clear();
		}
	}
}