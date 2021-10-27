package escola;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Escola {

	Scanner teclado = new Scanner(System.in);
	public AlunoDAO alunoDAO;

	public Escola() {
		alunoDAO = new AlunoDAO();
	}

	public void cadastrarAluno(Aluno aluno) {
		alunoDAO.inserir(aluno);
	}

	public void listarAlunos() {

		System.out.println("\nAlunos cadastrados:");

		List<Aluno> lista = alunoDAO.listar();

		Iterator<Aluno> iterator = lista.iterator();

		while (iterator.hasNext()) {
			Aluno aluno = iterator.next();

			System.out.println(aluno.getIdAluno() + " | " + aluno.getNome() + " | " + aluno.getCpf() + " | "
					+ aluno.getDataNascimento());
			System.out.println();
		}
	}

	public void PesquisarAluno() {
		System.out.println("\nDigite o nome do aluno:");
		String nome = teclado.next();
		System.out.println("\nAlunos cadastrados:");
		List<Aluno> lista = alunoDAO.pesquisar(nome);
		Iterator<Aluno> iterator = lista.iterator();
		while (iterator.hasNext()) {
			Aluno aluno = iterator.next();

			System.out.println(aluno.getIdAluno() + " | " + aluno.getNome() + " | " + aluno.getCpf() + " | "
					+ aluno.getDataNascimento());
			System.out.println();
		}
	}

	public void atualizarAluno(Aluno aluno) {
		System.out.println("\nDigite o id do aluno:");
		int id = Integer.parseInt(teclado.nextLine());
		alunoDAO.atualizar(id,aluno);
	}

	public void removeAluno() {
		System.out.println("\nDigite o id do aluno:");
		int id = Integer.parseInt(teclado.nextLine());
		alunoDAO.remover(id);
	}
}
