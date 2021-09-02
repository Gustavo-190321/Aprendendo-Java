package Exercicios_2;
import java.util.Scanner;
public class Soma {


public static void main(String[] args) {
	float num,num2,total;
	Scanner teclado = new Scanner(System.in);
	System.out.println("Digite o primeiro numero para soma ");
	num = teclado.nextFloat();
	System.out.println("Digite o segundo numero para soma ");
	num2 = teclado.nextFloat();
	total = num + num2;
	System.out.printf("A soma dos numeros %f e %f resulta em %f ",+num,+num2,+total);
	teclado.close();
	}
}

	
