package ProjetoInt;

import java.util.ArrayList;
import java.util.Scanner;

public class Opcoes {
	private Integer VetorIdAluno;
	private Integer VetornomeAluno;
	private Integer VetordataAluno;
	private Integer VetorcpfAluno;

	private ArrayList<Integer> IdAluno = new ArrayList<Integer>();

	public Scanner teclado = new Scanner(System.in);

	public void Cadastrar() {

		System.out.println("Cadastro de aluno");
		System.out.println("");

		System.out.println("Id do aluno");
		VetorIdAluno = Integer.parseInt(teclado.nextLine());
		IdAluno.add(VetorIdAluno);

		System.out.println("Nome do aluno");
		VetornomeAluno = Integer.parseInt(teclado.nextLine());
		IdAluno.add(VetornomeAluno);

		System.out.println("Data de nascimento do aluno");
		VetordataAluno = Integer.parseInt(teclado.nextLine());
		IdAluno.add(VetordataAluno);

		System.out.println("CPF do aluno");
		VetorcpfAluno = Integer.parseInt(teclado.nextLine());
		IdAluno.add(VetorcpfAluno);
	}

	public void Listar() {
		int i;
		System.out.println("Alunos listados");

		for (i = 0; i < IdAluno.size(); i++) {
			System.out.println("Id Aluno:" + IdAluno.get(i));
		}
	}

	public void Pesquisar() {
		// System.out.println("Digite o nome do aluno");
		// IdAluno = IdAluno.replace("péssimo","ruim");
	}

	public void Atualizar() {

		System.out.println("Digite o nome do aluno");
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

	public void Remover() {
		int i;
		System.out.println("Digite o id do Aluno");
		i = teclado.nextInt();
		
		if (i == VetorIdAluno) {
			IdAluno.clear();

		}
	}
}