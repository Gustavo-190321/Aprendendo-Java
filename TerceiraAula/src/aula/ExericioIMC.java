package aula;
import java.util.Scanner;
public class ExericioIMC {
	
	public static float calculaIMC(float peso, float altura) {
		float imc;
		imc = peso / (altura*altura);
		return imc;
	}
	
	public static void main(String[] args) {
		float peso = 0,altura=0,imc=0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite seu peso");
		peso = teclado.nextFloat();
		System.out.println("Digite sua altura");
		altura = teclado.nextFloat();
		imc = calculaIMC(peso,altura);
		//System.out.println(+imc);
		if(imc <= 18.3f) {    
			System.out.println("Abaixo do Peso");
		}
		else if(imc >= 18.5f) {
			System.out.println("Peso Ideal");
		}
		else if (imc >= 25) {
			System.out.println("Sobrepeso");
		}
		else if(imc >= 30) {
			System.out.println("Obesidade");
		}
		teclado.close();
	}
}
