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
		if (data < 0 & 6 < data) {
			System.out.println("Erro ao incluir data");
		} else {

			IdAluno.add(data);
		}
	}

	public void addCpf(int cpf) {
		if (cpf < 0 & 11 < cpf) {
			System.out.println("Erro ao incluir Id");
		} else {

			IdAluno.add(cpf);
		}
	}

	public void printId(int id) {
		//for (int item : IdAluno) {
			System.out.println("Id aluno:" + id);

		//}

	}

	public void printStr(String nome) {
		//for (String item : Nome) {
			System.out.println("Nome do Aluno:" + nome);
		//}

	}

	public void printData(int data) {
		//for (int item : IdAluno) {
			System.out.println("Data de nascimento do aluno:" + data);
		//}

	}

	public void printCpf(int cpf) {
		//for (int item : IdAluno) {
			System.out.println("Cpf do aluno:" + cpf);
		//}

	}
	public void Update(int antigo, int novo) {
		
		int recebe = IdAluno.indexOf(antigo);
		if (recebe == -1) {
			System.out.println("valor não encontrado");

		} else {
			IdAluno.set(recebe, novo);

			System.out.println("Registro alterado com sucesso");
		}
	}
	

	public void UpdateStr(String antigo, String novo) {
		

			int valor = Nome.indexOf(antigo);
			
			if (valor == -1)
			{
				 System.out.println("valor não encontrado");		
				
			}else
			{
				Nome.set(valor, novo);
				
				System.out.println("Registro alterado com sucesso");				
			}
			
		}
		
	public void Remove(int num) {
		int a = IdAluno.indexOf(num);
		IdAluno.remove(a);
	}
	
	public void RemoveStr(String _nome)
	{
		int valor = Nome.indexOf(_nome);
		Nome.remove(valor);		
		
	}
}