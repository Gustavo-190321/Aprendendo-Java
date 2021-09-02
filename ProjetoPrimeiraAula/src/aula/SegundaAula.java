package aula;
import java.util.Scanner;
public class SegundaAula {

	public static void main(String[] args) {
	float num1,num2, res;
	int op;
		
	Scanner teclado = new Scanner(System.in);
	System.out.println("Entre com dois numeros reais:");
	
	num1 = teclado.nextFloat();
	num2 = teclado.nextFloat();
	
	System.out.println("1 - Soma");
	System.out.println("2 - subtracao");
	System.out.println("3 - multiplicacao");
	System.out.println("4 - divisao");
	System.out.println("5 - media");
	op = teclado.nextInt();
	
	switch(op) {
	case 1:
	res = num1 + num2;
	System.out.println("Soma: " +res);
	break;
	case 2:
	res = num1 - num2;
	System.out.println("Subtracao: "+ res);
	break;
	case 3:
	res = num1 * num2;
	System.out.println("multiplicacao: " +res);
	break;
	case 4:
	res = num1 / num2;
	System.out.println("divisao:" +res);
	break;
	case 5:
	res = (num1 + num2)/2;
	System.out.println("Soma: " +res);
	break;
	default:
	System.out.println("opcao invalida");
	break;	
	}
	}
}
