package Prova;

public class Principal {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		funcionario.preencher("Gustavo", 5.321);
		String FuncionarioNome = funcionario.getNome();
        double RecebeDecimoTerceiro = funcionario.calcularDecimoTerceiro(11);
		System.out.printf("O valor que sera recibido para o funcionario %s sera de %.3f reais",FuncionarioNome,RecebeDecimoTerceiro);
	}

}
