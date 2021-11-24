package Aula12;

import java.util.ArrayList;

public class Empresa {
	private double salarioBaseAnalista;
	private double salarioBaseTecnico;
	
	private ArrayList<Funcionario> listaFuncionarios;
	
	public Empresa() {
		listaFuncionarios = new ArrayList<Funcionario>();
	}
	
	public double getSalarioBaseAnalista() {
		return salarioBaseAnalista;
	}
	public void setSalarioBaseAnalista(double salarioBaseAnalista) {
		this.salarioBaseAnalista = salarioBaseAnalista;
	}
	public double getSalarioBaseTecnico() {
		return salarioBaseTecnico;
	}
	public void setSalarioBaseTecnico(double salarioBaseTecnico) {
		this.salarioBaseTecnico = salarioBaseTecnico;
	}
	
	public void cadastrarFuncionario(Funcionario funcionario) {
		listaFuncionarios.add(funcionario);
	}
	
	public void imprimirFolhaPagamento() {
		double total = 0.0;
		int num = 0;
		
		for (Funcionario funcionarioAtual: listaFuncionarios) {
			total = total + funcionarioAtual.calcularSalario();
			num++;
		}
		System.out.println("Folha de Pagamento");
		System.out.println("Numero de Funcionarios: "+num);
		System.out.println("Total salarios:"+total);
		
	}
}
