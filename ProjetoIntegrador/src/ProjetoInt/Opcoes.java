package ProjetoInt;

import java.util.Scanner;

public class Opcoes {
	private int VetorIdAluno;
	private String VetornomeAluno;
	private int VetordataAluno;
	private int VetorcpfAluno;

	Aluno aluno1 = new Aluno(VetorIdAluno, VetornomeAluno, VetorIdAluno, VetorIdAluno);

	public Scanner teclado = new Scanner(System.in);

	public void Cadastrar() {

		System.out.println("Cadastro de aluno");
		System.out.println("");

		System.out.println("Id do aluno");
		VetorIdAluno = Integer.parseInt(teclado.nextLine());
		aluno1.addId(VetorIdAluno);

		System.out.println("Nome do aluno");
		VetornomeAluno = teclado.nextLine();
		aluno1.addNome(VetornomeAluno);

		System.out.println("Data de nascimento do aluno");
		VetordataAluno = Integer.parseInt(teclado.nextLine());
		aluno1.addData(VetordataAluno);

		System.out.println("CPF do aluno");
		VetorcpfAluno = Integer.parseInt(teclado.nextLine());
		aluno1.addCpf(VetorcpfAluno);

	}

	public void Listar() {
		try {
			System.out.println("Alunos listados");
			aluno1.printId(VetorIdAluno);
			aluno1.printStr(VetornomeAluno);
			aluno1.printData(VetordataAluno);
			aluno1.printCpf(VetorcpfAluno);
		} catch (Exception e) {
			System.out.println("Lista Vazia");
		}
	}

	public void Pesquisar() {
		System.out.println("Digite o nome do Aluno");
		String i = teclado.nextLine();
		if (i.equals(VetornomeAluno)) {
			aluno1.printStr(VetornomeAluno);
			aluno1.printData(VetordataAluno);
			aluno1.printCpf(VetorcpfAluno);
		} else {
			System.out.println("Digite um Nome Válido");
		}
	}

	public void Atualizar() {
		int i;
		System.out.println("Digite o id do Aluno");
		i = teclado.nextInt();
		if (i != VetorIdAluno) {
			System.out.println("Digite um id Valido");
		} else {
			System.out.println("Digite o nome do aluno");
			String novoNome = teclado.nextLine();
			aluno1.UpdateStr(VetornomeAluno, novoNome);
			System.out.println("Registro alterado com sucesso");
		}
		System.out.println("Digite a data de Nascimento do aluno");
		int novoData = teclado.nextInt();
		aluno1.Update(VetordataAluno, novoData);

		System.out.println("Registro alterado com sucesso");

		System.out.println("Digite o CPF do aluno");
		int novoCpf = teclado.nextInt();
		aluno1.Update(VetorcpfAluno, novoCpf);

		System.out.println("Registro alterado com sucesso");

	}

	public void Remover() {
		Integer i;
		System.out.println("Digite o id do Aluno");
		i = teclado.nextInt();

		if (i != VetorIdAluno) {
			System.out.println("Digite um ID valido");
		} else {
			aluno1.Remove(VetorIdAluno);
			aluno1.RemoveStr(VetornomeAluno);
			aluno1.Remove(VetordataAluno);
			aluno1.Remove(VetorcpfAluno);
		}
	}
}