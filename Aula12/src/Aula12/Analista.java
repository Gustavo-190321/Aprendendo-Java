package Aula12;

public class Analista extends Funcionario {

	@Override
	public double calcularSalario() {
	
		return getSalario() * 1.2;
	}
	
}
