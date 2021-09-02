package QuintaAula;
import java.util.Scanner;
import java.util.ArrayList;
public class QuintaAula {

	public static void main(String[] args) {
		int cont,i;
		float preco;
		
		try (Scanner teclado = new Scanner(System.in)) {
			ArrayList<String> listaProdutos = new ArrayList<String>();
			ArrayList<Float> listaPrecos = new ArrayList<Float>();
			int quantidade[] = new int [5];
			
			listaProdutos.add(""); // pos 0 não utilizada
			listaProdutos.add("Bolo de chocolate");
			listaProdutos.add("Torta de banana");
			listaProdutos.add("Brigadeiro");
			listaProdutos.add("Quindim");
					
			listaPrecos.add(0.0f); // pos 0 não utilizada
			listaPrecos.add(8.0f);
			listaPrecos.add(6.0f);
			listaPrecos.add(3.0f);
			listaPrecos.add(4.0f);
			
			for(i=0;i<5;i++) {
				quantidade[i] = 0;
			}
			
			System.out.println("Selecione um produto:");
			System.out.println("1-Bolo do chocolate: R$8,00");
			System.out.println("2-Torta de banana: R$6,00");
			System.out.println("3-Brigadeiro: R$3,00");
			System.out.println("4-Quindim: R$4.00");
			System.out.println("5-finalizar Compra");
			preco = 0;
			do{
			cont = teclado.nextInt();
			if(cont >= 1 && cont <= 4) {
			preco = preco + listaPrecos.get(cont);
			quantidade[cont]++;
			}
			}while(cont != 5 );
			teclado.close();
			for(i=1;i<5;i++) {
				System.out.println(listaProdutos.get(i)+":"+quantidade[i]);
			}
		}
	}
}
