package ProjetoInt;

import java.util.Scanner;

public class Opcoes {
	private String VetorIdAluno;
	private String VetorNomeAluno;
	private String VetorDataAluno;
	private String VetorCpfAluno;
	private String VetorTutorAluno;
	private String VetorDepartamentoAluno;
	private String VetorDisciplinaAluno;

	Aluno aluno1 = new Aluno(VetorIdAluno, VetorNomeAluno, VetorDataAluno, VetorCpfAluno, VetorTutorAluno,
			VetorDepartamentoAluno, VetorDisciplinaAluno);

	public Scanner teclado = new Scanner(System.in);

	public void Cadastrar() {
		try {
			System.out.print("\n");
			System.out.println("Cadastro de aluno");
			System.out.println("");

			System.out.println("Id do aluno");
			VetorIdAluno = teclado.nextLine();
			aluno1.addId(VetorIdAluno);

			System.out.println("Nome do aluno");
			VetorNomeAluno = teclado.nextLine();
			aluno1.addNome(VetorNomeAluno);

			System.out.println("Data de nascimento do aluno:");
			VetorDataAluno = teclado.nextLine();
			aluno1.addData(VetorDataAluno);

			System.out.println("CPF do aluno");
			VetorCpfAluno = teclado.nextLine();
			aluno1.addCpf(VetorCpfAluno);

			System.out.println("Tutor do aluno");
			VetorTutorAluno = teclado.nextLine();
			aluno1.addTutor(VetorTutorAluno);

			System.out.println("Departamento do aluno");
			VetorDepartamentoAluno = teclado.nextLine();
			aluno1.addDepartamneto(VetorDepartamentoAluno);

			System.out.println("Disciplina do aluno");
			VetorDisciplinaAluno = teclado.nextLine();
			aluno1.addDisciplina(VetorDisciplinaAluno);

		} catch (Exception e) {
			System.out.println("Lista Vazia");
		}
	}

	public void Listar() {

		System.out.print("\n");
		System.out.println("Alunos listados");
		System.out.println("Id:" + aluno1.IdAluno);
		System.out.println("Nome:" + aluno1.Nome);
		System.out.println("Data:" + aluno1.dataAluno);
		System.out.println("CPF:" + aluno1.cpfAluno);
		System.out.println("Tutor:" + aluno1.tutorAluno);
		System.out.println("Departamento:" + aluno1.departamentoAluno);
		System.out.println("Disciplina:" + aluno1.disciplinaAluno);
	}
	public void Pesquisar() {
		System.out.print("\n");
		System.out.println("Digite o nome do Aluno");
		String compara = teclado.nextLine();
		if (compara.equals(VetorNomeAluno)) {
			aluno1.printId(VetorIdAluno);
			aluno1.printStr(VetorNomeAluno);
			aluno1.printData(VetorDataAluno);
			aluno1.printCpf(VetorCpfAluno);
			aluno1.printTutor(VetorTutorAluno);
			aluno1.printDepartamento(VetorDepartamentoAluno);
			aluno1.printDisciplina(VetorDisciplinaAluno);
		} else {
			System.out.println("Digite um Nome Válido");
			Pesquisar();
		}
	}

	public void Atualizar() {
		try {
			System.out.print("\n");
			System.out.println("Digite o id do Aluno");
			String compara = teclado.nextLine();
			if (compara != VetorIdAluno) {
				System.out.println("Digite o nome do aluno");
				String novoNome = teclado.next();
				aluno1.UpdateStr(VetorNomeAluno, novoNome);
			} else {
				System.out.println("Digite um id Valido");
				Atualizar();
			}
			System.out.println("Digite a data de Nascimento do aluno");
			String novoData = teclado.next();
			aluno1.UpdateData(VetorDataAluno, novoData);

			System.out.println("Digite o CPF do aluno");
			String novoCpf = teclado.next();
			aluno1.UpdateCpf(VetorCpfAluno, novoCpf);

			System.out.println("Digite o Tutor do aluno");
			String novoTutor = teclado.next();
			aluno1.UpdateTutor(VetorTutorAluno, novoTutor);

			System.out.println("Digite o Departamento do aluno");
			String novoDepartamento = teclado.next();
			aluno1.UpdateDepartamento(VetorDepartamentoAluno, novoDepartamento);

			System.out.println("Digite a Disciplina do aluno");
			String novoDisciplina = teclado.next();
			aluno1.UpdateDisciplina(VetorDisciplinaAluno, novoDisciplina);
			System.out.println("Aluno atualizado com sucesso");
		} catch (Exception e) {
			System.out.println("Lista Vazia");
		}

	}

	public void Remover() {
		try {
			System.out.print("\n");
			System.out.println("Digite o id do Aluno");
			String compara = teclado.nextLine();

			if (compara.equals(VetorIdAluno)) {
				aluno1.RemoveId(VetorIdAluno);
				aluno1.RemoveStr(VetorNomeAluno);
				aluno1.RemoveData(VetorDataAluno);
				aluno1.RemoveCpf(VetorCpfAluno);
				aluno1.RemoveTutor(VetorTutorAluno);
				aluno1.RemoveDepartamento(VetorDepartamentoAluno);
				aluno1.RemoveDisciplina(VetorDisciplinaAluno);
				System.out.println("Aluno removido com sucesso");

			} else {
				System.out.println("Digite um ID valido");
				Remover();
			}
		} catch (Exception e) {
			System.out.println("Lista vazia");
		}
	}
}
