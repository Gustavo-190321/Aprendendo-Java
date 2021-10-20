package empresa;

import java.util.Iterator;
import java.util.List;

public class Empresa {
	
	public FuncionarioDAO funcionarioDAO;
	
	public Empresa() {
		funcionarioDAO = new FuncionarioDAO();
	}
	
	
	public void cadastrarFuncionario(Funcionario funcionario) {
		funcionarioDAO.inserir(funcionario);
	}
	
	public void listarFuncionarios() {
		
		System.out.println("\nFuncionários cadastrados:");
		
		List<Funcionario> lista = funcionarioDAO.listar();
		
		Iterator<Funcionario> iterator = lista.iterator();
				
		while (iterator.hasNext()) {
			Funcionario funcionario = iterator.next();
					
			System.out.println(funcionario.getId() + " | " +
							   funcionario.getNome()  + " | " +
							   funcionario.getSalario()  + " | " +
							   funcionario.getCargo());
			System.out.println();
		}
	}
}
