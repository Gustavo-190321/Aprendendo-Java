package ProjetoInt;

import java.util.ArrayList;

public class Aluno {

	public ArrayList<String> IdAluno = new ArrayList<String>();
	public ArrayList<String> Nome = new ArrayList<String>();
	public ArrayList<String> dataAluno = new ArrayList<String>();
	public ArrayList<String> cpfAluno = new ArrayList<String>();
	public ArrayList<String> tutorAluno = new ArrayList<String>();
	public ArrayList<String> departamentoAluno = new ArrayList<String>();
	public ArrayList<String> disciplinaAluno = new ArrayList<String>();

	public String idAluno;
	public String nome;
	public String cpf;
	public String dataNascimento;
	public String tutor;
	public String departamento;
	public String disciplina;

	public Aluno(String idAluno, String nome, String cpf, String dataNascimento, String tutor, String departamento,
			String disciplina) {
		this.idAluno = idAluno;
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.tutor = tutor;
		this.departamento = departamento;
		this.disciplina = disciplina;
	}

	/////////////////////////////////////////// ADICIONA///////////////////////////////////
	public void addId(String id) {
		if (id.length() > 0 && 5 >= id.length()) {
			IdAluno.add(id);
			// Opcoes.Cadastrar();
		} else
			System.out.println("Erro ao incluir Id");
	}

	public void addNome(String nome) {
		if (nome.length() > 0 && 10 >= nome.length()) {
			Nome.add(nome);
		} else
			System.out.println("Erro ao incluir Nome");
	}

	public void addData(String data) {
		if (data.length() == 6) {
			dataAluno.add(data);
		} else
			System.out.println("Erro ao incluir Data");
	}

	public void addCpf(String cpf) {
		if (cpf.length() == 11) {
			cpfAluno.add(cpf);
		} else
			System.out.println("Erro ao incluir CPF");

	}

	public void addTutor(String tutor) {
		if (tutor.length() > 0 && 10 >= tutor.length()) {
			tutorAluno.add(tutor);
		} else
			System.out.println("Erro ao incluir Tutor");

	}

	public void addDepartamneto(String departamento) {
		if (departamento.length() > 0 && 15 >= departamento.length()) {
			departamentoAluno.add(departamento);
		} else
			System.out.println("Erro ao incluir Departamento");

	}

	public void addDisciplina(String disciplina) {
		if (disciplina.length() > 0 || 15 >= disciplina.length()) {
			disciplinaAluno.add(disciplina);
		} else
			System.out.println("Erro ao incluir Disciplina");

	}

	////////////////////////////////////////////////// IMPRIME////////////////////////////////////////////
	public void printId(String id) {
		System.out.println("Id aluno:" + id);

	}

	public void printStr(String nome) {
		System.out.println("Nome do Aluno:" + nome);
	}

	public void printData(String data) {
		System.out.println("Data de nascimento do aluno:" + data);
	}

	public void printCpf(String cpf) {
		System.out.println("Cpf do aluno:" + cpf);

	}

	public void printTutor(String tutor) {
		System.out.println("Cpf do aluno:" + tutor);

	}

	public void printDepartamento(String departamento) {
		System.out.println("Cpf do aluno:" + departamento);

	}

	public void printDisciplina(String disciplina) {
		System.out.println("Cpf do aluno:" + disciplina);

	}

	//////////////////////////////////////////////// UPDATE//////////////////////////////////////////////////////////////////

	public void UpdateStr(String antigo, String novo) {

		int valor = Nome.indexOf(antigo);
		Nome.set(valor, novo);
	}

	public void UpdateData(String antigo, String novo) {

		int recebe = dataAluno.indexOf(antigo);
		dataAluno.set(recebe, novo);
	}

	public void UpdateCpf(String antigo, String novo) {

		int recebe = cpfAluno.indexOf(antigo);
		cpfAluno.set(recebe, novo);
	}

	public void UpdateTutor(String antigo, String novo) {

		int recebe = tutorAluno.indexOf(antigo);
		tutorAluno.set(recebe, novo);
	}

	public void UpdateDepartamento(String antigo, String novo) {

		int recebe = departamentoAluno.indexOf(antigo);
		departamentoAluno.set(recebe, novo);
	}

	public void UpdateDisciplina(String antigo, String novo) {

		int recebe = disciplinaAluno.indexOf(antigo);
		disciplinaAluno.set(recebe, novo);
	}

	//////////////////////////////////////////////// REMOVE/////////////////////////////////////////////
	public void RemoveId(String num) {
		int a = IdAluno.indexOf(num);
		IdAluno.remove(a);
	}

	public void RemoveStr(String nome) {
		int valor = Nome.indexOf(nome);
		Nome.remove(valor);
	}

	public void RemoveData(String nome) {
		int a = dataAluno.indexOf(nome);
		dataAluno.remove(a);
	}

	public void RemoveCpf(String nome) {
		int a = cpfAluno.indexOf(nome);
		cpfAluno.remove(a);
	}

	public void RemoveTutor(String nome) {
		int a = tutorAluno.indexOf(nome);
		tutorAluno.remove(a);
	}

	public void RemoveDepartamento(String nome) {
		int a = departamentoAluno.indexOf(nome);
		departamentoAluno.remove(a);
	}

	public void RemoveDisciplina(String nome) {
		int a = disciplinaAluno.indexOf(nome);
		disciplinaAluno.remove(a);
	}
}