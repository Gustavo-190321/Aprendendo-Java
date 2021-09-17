package ProjetoInt;

import java.util.Scanner;


public class PrincipalPI {

	public static void main(String[] args) {
		int opc = 0;
		Opcoes altOp = new Opcoes();
		Scanner teclado = new Scanner(System.in);

		do {
			System.out.println("Cadastro de Estudantes");
			System.out.println("1 – Cadastrar");
			System.out.println("2 – Listar");
			System.out.println("3 – Pesquisar");
			System.out.println("4 – Atualizar");
			System.out.println("5 – Remover");
			System.out.println("6 – Sair");
			opc = teclado.nextInt();

			if (opc == 1) {
				altOp.Cadastrar();
			}

			else if (opc == 2) {
				altOp.Listar();
			}

			else if (opc == 3) {
				altOp.Pesquisar();
			} 
			else if (opc == 4) {
				altOp.Atualizar();
			} 
			else if (opc == 5) {
				altOp.Remover();
			}
			
		} while (opc != 6);

		System.out.print("Voce Saiu");
		teclado.close();
	}
}