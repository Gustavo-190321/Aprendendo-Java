package Exercicios_2;

import java.util.Scanner;

public class Subtração {

	public static void main(String[] args) {
		int num,num2,total;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o primeiro numero para subtração ");
		num = teclado.nextInt();
		System.out.println("Digite o segundo numero para subtração ");
		num2 = teclado.nextInt();
		total = num - num2;
		System.out.printf("A subtração dos numeros %d e %d resulta em %d ",num,num2,total);

	}

}
