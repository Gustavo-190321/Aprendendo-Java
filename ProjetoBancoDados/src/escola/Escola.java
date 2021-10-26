package escola;

import java.util.Iterator;
import java.util.List;

public class Escola {
	
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
					
			System.out.println(aluno.getIdAluno() + " | " +
							   aluno.getNome()  + " | " +
							   aluno.getCpf()  + " | " +
							   aluno.getDataNascimento());
			System.out.println();
		}
	}
}
