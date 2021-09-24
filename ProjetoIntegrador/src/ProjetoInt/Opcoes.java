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
		System.out.print("\n");
		System.out.println("Cadastro de aluno");
		System.out.println("");

		System.out.println("Id do aluno");
		VetorIdAluno = Integer.parseInt(teclado.nextLine());
		aluno1.addId(VetorIdAluno);

		System.out.println("Nome do aluno");
		VetornomeAluno = teclado.nextLine();
		aluno1.addNome(VetornomeAluno);

		System.out.println("Data de nascimento do aluno:");
		VetordataAluno = Integer.parseInt(teclado.nextLine());
		aluno1.addData(VetordataAluno);

		System.out.println("CPF do aluno");
		VetorcpfAluno = Integer.parseInt(teclado.nextLine());
		aluno1.addCpf(VetorcpfAluno);

	}

	public void Listar() {
			System.out.print("\n");
			System.out.println("Alunos listados");
			System.out.println("id:"+aluno1.IdAluno);
            System.out.println("nome:"+aluno1.Nome);
            System.out.println("data:"+aluno1.dataAluno);
            System.out.println("cpf:"+aluno1.cpfAluno);
	}

	public void Pesquisar() {
		System.out.print("\n");
		System.out.println("Digite o nome do Aluno");
		String i = teclado.nextLine();
		if (i.equals(VetornomeAluno)) {
			aluno1.printId(VetorIdAluno);
			aluno1.printStr(VetornomeAluno);
			aluno1.printData(VetordataAluno);
			aluno1.printCpf(VetorcpfAluno);
		} else {
			System.out.println("Digite um Nome Válido");
			Pesquisar();
		}
	}

	public void Atualizar() {
		System.out.print("\n");
		System.out.println("Digite o id do Aluno");
		int i = teclado.nextInt();
		if (i != VetorIdAluno) {
			System.out.println("Digite um id Valido");
			Atualizar();
		} else {
			System.out.println("Digite o nome do aluno");
			String novoNome = teclado.next();
			aluno1.UpdateStr(VetornomeAluno, novoNome);
		}
		System.out.println("Digite a data de Nascimento do aluno");
		int novoData = teclado.nextInt();
		aluno1.UpdateData(VetordataAluno, novoData);

		System.out.println("Digite o CPF do aluno");
		int novoCpf = teclado.nextInt();
		aluno1.UpdateCpf(VetorcpfAluno, novoCpf);

	}

	public void Remover() {
		System.out.print("\n");
		System.out.println("Digite o id do Aluno");
		Integer i = teclado.nextInt();

		if (i != VetorIdAluno) {
			System.out.println("Digite um ID valido");
			Remover();
		} else {
			aluno1.RemoveId(VetorIdAluno);
			aluno1.RemoveStr(VetornomeAluno);
			aluno1.RemoveData(VetordataAluno);
			aluno1.RemoveCpf(VetorcpfAluno);
			System.out.println("Aluno removido com sucesso");
		}
	}
}