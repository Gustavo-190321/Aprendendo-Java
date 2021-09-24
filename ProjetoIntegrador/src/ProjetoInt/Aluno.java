package ProjetoInt;

import java.util.ArrayList;

public class Aluno {

	public ArrayList<Integer> IdAluno = new ArrayList<Integer>();
	public ArrayList<String> Nome = new ArrayList<String>();
	public ArrayList<Integer> dataAluno = new ArrayList<Integer>();
	public ArrayList<Integer> cpfAluno = new ArrayList<Integer>();

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
		if (id < 0 & 5 < id) {
		System.out.println("Erro ao incluir Id");
		}else
		IdAluno.add(id);
	}

	public void addNome(String nome) {
		if (nome.length() < 0 || 10 < nome.length()) {
			System.out.println("Erro ao incluir nome");
		} else 
			Nome.add(nome);
	}

	public void addData(int data) {
		if (data < 0 && 6 < data) {
			System.out.println("Erro ao incluir data");
		} else 
			dataAluno.add(data);
	}

	public void addCpf(int cpf) {
		if (cpf < 0 & 11 < cpf) {
			System.out.println("Erro ao incluir Id");
		} else 
			cpfAluno.add(cpf);
	}

	public void printId(int id) {
		System.out.println("Id aluno:" + id);

	}

	public void printStr(String nome) {
		System.out.println("Nome do Aluno:" + nome);
	}

	public void printData(int data) {
		System.out.println("Data de nascimento do aluno:" + data);
	}

	public void printCpf(int cpf) {
		System.out.println("Cpf do aluno:" + cpf);

	}

	public void UpdateStr(String antigo, String novo) {

		int valor = Nome.indexOf(antigo);
		Nome.set(valor, novo);
	}
	public void UpdateData(int antigo, int novo) {

		int recebe = dataAluno.indexOf(antigo);
		dataAluno.set(recebe, novo);
	}
	public void UpdateCpf(int antigo, int novo) {

		int recebe = cpfAluno.indexOf(antigo);
		cpfAluno.set(recebe, novo);
	}

	public void RemoveId(int num) {
		int a = IdAluno.indexOf(num);
		IdAluno.remove(a);
	}

	public void RemoveStr(String _nome) {
		int valor = Nome.indexOf(_nome);
		Nome.remove(valor);
	}

	public void RemoveData(int num) {
		int a = dataAluno.indexOf(num);
		dataAluno.remove(a);
	}

	public void RemoveCpf(int num) {
		int a = cpfAluno.indexOf(num);
		cpfAluno.remove(a);
	}
}