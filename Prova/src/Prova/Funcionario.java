package Prova;

public class Funcionario {
	private String nome;
	private Double salario;

	public String getNome() {
		return nome;
	}

	public void setNome(String valor) {
		this.nome = valor;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double valor) {
		this.salario = valor;
	}

	public double calcularDecimoTerceiro(int meses) {
		double total = (this.salario / 12) * meses;
		return total;
	}

	public void preencher(String valor1, Double valor2) {
		this.nome = valor1;
		this.salario = valor2;
	}
}
