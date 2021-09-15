package ProjetoInt;
import java.util.Scanner;
import java.util.ArrayList;

public class Projeto {
	
    static ArrayList<String> nomeAluno = new ArrayList<String>();
    static ArrayList<String> dataAluno = new ArrayList<String>();
    static ArrayList<String> cpfAluno = new ArrayList<String>();	
    
    public static void Cadastrar() {
    	try (Scanner cadastro = new Scanner(System.in)) {
		    System.out.println("Cadastro");
		    System.out.println("Id do aluno");
		        var Id = cadastro.nextLine();

		    System.out.println("Nome do aluno");
		        //nomeAluno = teclado.nextString();

		    System.out.println("Data de nascimento do aluno");
		        //dataAluno = teclado.nextInt();

		    System.out.println("CPF do aluno");
		        //cpfAluno = teclado.nextInt();
		      }
    	}
    
	public static void main(String[] args) { 
			  int i=0, opc = 0;
			  
			    Scanner teclado = new Scanner(System.in);

			    //ArrayList<String> nomeAluno = new ArrayList<String>();
			    //ArrayList<Integer> dataAluno = new ArrayList<Integer>();
			    //ArrayList<Integer> cpfAluno = new ArrayList<integer>();			    
			do{
			    System.out.println("Cadastro de Estudantes");
			    System.out.println("1 – Cadastrar");
			    System.out.println("2 – Listar");
			    System.out.println("3 – Pesquisar");
			    System.out.println("4 – Atualizar");
			    System.out.println("5 – Remover");
			    System.out.println("6 – Sair");
			    opc = teclado.nextInt();

			    if(opc == 1){
			    System.out.println("Cadastro");
			    	Cadastrar();
			    }

			    else if(opc == 2){
			    	System.out.println("Alunos cadastrados");
			      }

			    else if(opc == 3){
			    	System.out.println("Digite o nome do aluno");
			      }
			    else if(opc == 4){
			    	System.out.println("Digite o Id do aluno");
			      }
			    else if(opc == 5){
			    	System.out.println("Cuidado voce esta preste a excluir um aluno cadastrado");
			    	System.out.println("Digite o Id do aluno");
			      }
			
			}while(opc != 6);   		
}}