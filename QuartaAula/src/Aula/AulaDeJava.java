package Aula;
import java.util.Scanner;
public class AulaDeJava {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Entre com dois nomes");
		String nome1 = teclado.nextLine();
		String nome2 = teclado.nextLine();
		
		int res = nome1.compareTo(nome2);
		
		if(res< 0) {
			System.out.println(nome1);
			System.out.println(nome2);	
		}
		else if(res> 0) {
			System.out.println(nome2);
			System.out.println(nome1);	
		}
		else{
			System.out.println(nome1);
			System.out.println(nome2);
			
		}
		teclado.close();
	}
}

