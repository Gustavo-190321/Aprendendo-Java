package Aula13;

import java.util.Scanner;

public class Principal {
	
	public static void cadastrar(Scanner teclado, PetShop petshop) {
		
		String aux;
		int op;
		
		System.out.println("1 - Gato");
		System.out.println("2 - Cachorro");
		System.out.println("3 - Passaro");
		aux = teclado.nextLine();
		op = Integer.parseInt(aux);
		
		if (op < 1 || op > 3 ) {
			System.out.println("Opção inválida\n");
			return;
		}
		
		System.out.print("Entre com o nome: ");
		String nome = teclado.nextLine();
		
		System.out.print("Entre com a raça: ");
		String raca = teclado.nextLine();
		
		System.out.print("Entre com a idade: ");
		int idade = Integer.parseInt(teclado.nextLine());
		
		System.out.print("Entre com o nome do dono: ");
		String nomeDono = teclado.nextLine();
		
		System.out.print("Entre com o telefone: ");
		String telefone = teclado.nextLine();
		
		if (op == 1) {
			Animal gato = new Gato(); // polimorfismo
			
			gato.setNome(nome);
			gato.setIdade(idade);
			gato.setRaca(raca);
			gato.setNomeDono(nomeDono);
			gato.setTelefone(telefone);
			
			petshop.cadastrar(gato);
		}
		else if (op == 2) {
			Animal cachorro = new Cachorro(); // polimorfismo
			
			cachorro.setNome(nome);
			cachorro.setIdade(idade);
			cachorro.setRaca(raca);
			cachorro.setNomeDono(nomeDono);
			cachorro.setTelefone(telefone);
			
			petshop.cadastrar(cachorro);
		}
		else if (op == 3) {
			Animal passaro = new Passaro(); // polimorfismo
			
			passaro.setNome(nome);
			passaro.setIdade(idade);
			passaro.setRaca(raca);
			passaro.setNomeDono(nomeDono);
			passaro.setTelefone(telefone);
			
			petshop.cadastrar(passaro);
		}
		
	}
	
	public static void remover(Scanner teclado, PetShop petshop) {
		String aux;
		int id;
		
		System.out.print("Entre com o id: ");
		aux = teclado.nextLine();
		id = Integer.parseInt(aux);
		
		petshop.remover(id);
	}
	
	public static void pesquisar(Scanner teclado, PetShop petshop) {
		String nome;
		
		System.out.print("Entre com o nome: ");
		nome = teclado.nextLine();
		
		petshop.pesquisar(nome);
	}
	
	public static void menu() {
		System.out.println("Escolha a opção: ");
		System.out.println("1 - Cadastrar");
		System.out.println("2 - Remover");
		System.out.println("3 - Listar");
		System.out.println("4 - Pesquisar");
		System.out.println("5 - Sair");
	}

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		PetShop petshop = new PetShop();
		String aux;
		int op;
		
		do {
			menu();
			aux = teclado.nextLine();
			op = Integer.parseInt(aux);
			
			switch (op) {
				case 1: 
					cadastrar(teclado, petshop);
					break;
				case 2:
					remover(teclado, petshop);
					break;
				case 3:
					petshop.listar();
					break;
				case 4:
					pesquisar(teclado, petshop);
					break;
				case 5:
					break;
			}
			
		} while (op != 5);
		
		teclado.close();
	}
}
