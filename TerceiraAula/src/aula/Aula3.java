package aula;
import java.util.Scanner;
public class Aula3 {

	public static void main(String[] args) {
	int voto = 0, votoA = 0 , votoB = 0 ,nulo = 0, numvotos = 0 ;
	int vetor [], i = 0;
	
	Scanner teclado = new Scanner(System.in);
	
	vetor = new int[100];
	
	do {
		System.out.println("1 - candidato A");
		System.out.println("2 - candidato B");	
		System.out.println("Par nulo - outro numero positivo");	
		
		voto = teclado.nextInt();
		if(voto >= 0 )
		vetor[i] = voto;
		i++;
		numvotos ++;
		
	}while(voto >= 0);

	for(i=0; i <numvotos; i++) {
		if(vetor[i] == 1) {
			votoA++;
		}
		else if(vetor[i] == 2) {
			votoB++;
		}
		else {
			nulo++;
		}}
		System.out.println("Quantidade de votos do candidato A "+votoA);
		System.out.println("Quantidade de votos do candidato B "+votoB);
		System.out.println("Quantidade de votos nulo "+nulo);
		
		if(votoA > votoB) {
			System.out.println("Vencedor candidato A");
		}
		if(votoB > votoA) {
			System.out.println("Vencedor candidato B");
		}
		else {
			System.out.println("empate");
		}
	
	}
}
