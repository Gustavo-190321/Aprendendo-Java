package aula;
import java.util.Scanner;
public class SegundaAulaExer {

	public static void main(String[] args) {
		int produtos,cont;
		float preco;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Selecione um produto:");
		
		System.out.println("1-Bolo do chocolate: R$8,00");
		System.out.println("2-Torta de banana: R$6,00");
		System.out.println("3-Brigadeiro: R$3,00");
		System.out.println("4-Quindim: R$4.00");
		System.out.println("5-Verificar Carrinho");
		System.out.println("6-finalizar Compra");
		preco = 0;
		produtos = 0;
		
		do{
		cont = teclado.nextInt();
		if(cont == 1) {
		preco += 8.00;
		produtos++;
		}
		else if (cont == 2) {
		preco += 6.00;
		produtos++;
		}
		else if(cont == 3) {
		preco += 3.00;
		produtos++;
		}
		else if(cont == 4) {
		preco += 4.00;
		produtos++;
		}
		else if(cont == 5){		
		System.out.printf("Produtos: %d  e total: R$%.2f %n",produtos,preco);
		}
		else if(cont == 6){		
		System.out.printf("Sua compra deu no total R$%.2f com %d produtos\n",preco,produtos);
		System.out.println("Tenha um bom dia!!");
		}
		else {
			System.out.println("Opção Inválida");
		}
		}while(cont != 6 );
}
}
