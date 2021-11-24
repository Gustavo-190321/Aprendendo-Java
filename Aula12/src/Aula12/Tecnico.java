package Aula12;

public class Tecnico extends Funcionario {

	@Override
	public double calcularSalario() {
		
		return getSalario() * 1.1;
	}

}
