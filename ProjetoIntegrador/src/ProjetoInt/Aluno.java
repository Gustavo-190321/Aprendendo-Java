package ProjetoInt;

import java.util.ArrayList;

public class Aluno {

	public ArrayList<Integer> IdAluno = new ArrayList<Integer>();
	public ArrayList<String> Nome = new ArrayList<String>();
	
	public int idAluno;
	public String nome;
	public int cpf;
	public int dataNascimento;

	public Aluno(int idAluno, String nome, int cpf, int dataNascimento) {
		this.idAluno = idAluno;
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}

	public void addId(int id) {
		try {
		if (id < 0 & 5 < id) {
			System.out.println("Erro ao incluir Id");
		}}
			catch (Exception e) {
			IdAluno.add(id);
		}
	}

	public void addNome(String nome) {
		if (nome.length() < 0 || 10 < nome.length()) {
			System.out.println("Erro ao incluir nome");
		} else {
			Nome.add(nome);
		}
	}

	public void addData(int data) {
		///if (data < 0 || 6 < data) {
			//System.out.println("Erro ao incluir data");
		//} else {

			IdAluno.add(data);
		//}
	}

	public void addCpf(int cpf) {
		if (cpf < 0 & 11 < cpf) {
			System.out.println("Erro ao incluir Id");
		} else {

			IdAluno.add(cpf);
		}
	}

	public void printId() {
		for (int item : IdAluno) {
			System.out.println("Id aluno:" + item);

		}

	}

	public void printStr() {
		for (String item : Nome) {
			System.out.println("Nome do Aluno:" + item);
		}

	}

	public void printData() {
		for (int item : IdAluno) {
			System.out.println("Data de nascimento do aluno:" + item);
		}

	}

	public void printCpf() {
		for (int item : IdAluno) {
			System.out.println("Cpf do aluno:" + item);
		}

	}

	public void UpdateStr(String antigo, String novo) {
//
//		String i;
//		System.out.println("Digite o id do Aluno");
//		i = teclado.nextLine();
//		System.out.println("Digite o nome do aluno");
//		if (!i.equals(VetornomeAluno)) {
//			System.out.println("Digite um id Valido");
//		} else {
//			int e = teclado.nextInt();
//			Nome.indexOf(e, nome);
//			System.out.println("Registro alterado com sucesso");
//		}
//		System.out.println("Digite a data de Nascimento do aluno");
//		int valorData = IdAluno.indexOf(dataNascimento);
//		int novoData = teclado.nextInt();
//
//		if (valorData == -1) {
//			System.out.println("valor não encontrado");
//
//		} else {
//			IdAluno.set(valorData, novoData);
//
//			System.out.println("Registro alterado com sucesso");
//		}
//
//		System.out.println("Digite o CPF do aluno");
//		int valorCpf = IdAluno.indexOf(VetorcpfAluno);
//		int novoCpf = teclado.nextInt();
//
//		if (valorCpf == -1) {
//			System.out.println("valor não encontrado");
//
//		} else {
//			IdAluno.set(valorCpf, novoCpf);
//
//			System.out.println("Registro alterado com sucesso");
//		}
	}

	public void Remove(int idAluno, String nome, int cpf, int dataNascimento) {
		Integer i = 0;
		int a = IdAluno.indexOf(i);
		IdAluno.remove(a);
		Nome.remove(a);
	}

}