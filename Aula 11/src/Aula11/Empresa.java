package Aula11;

import java.util.ArrayList;

public class Empresa {
	private double salarioBaseAnalista;
	private double salarioBaseTecnico;
	
	private ArrayList<Analista> listaAnalistas;
	private ArrayList<Tecnico> listaTecnicos;
	
	public Empresa() {
		listaAnalistas = new ArrayList<Analista>();
		listaTecnicos = new ArrayList<Tecnico>();
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
	
	public void cadastrarAnalista(Analista analista) {
		listaAnalistas.add(analista);
	}
	
	public void cadastrarTecnico(Tecnico tecnico) {
		listaTecnicos.add(tecnico);
	}
	
	public void imprimirFolhaPagamento() {
		double total = 0.0;
		int num = 0;
		
		for (Analista analistaAtual: listaAnalistas) {
			total = total + analistaAtual.calcularSalario();
			num++;
		}
		for(Tecnico tecnicoAtual : listaTecnicos) {
			total = total + tecnicoAtual.calcularSalario();
			num++;
		}
		System.out.println("Folha de Pagamento");
		System.out.println("Numero de Funcionarios: "+num);
		System.out.println("Total salarios:"+total);
		
	}
}
