package ProjetoInt;

import java.util.ArrayList;
import java.util.Scanner;

public class Opcoes {
	private Integer VetorIdAluno;
	
	private  ArrayList<Integer> IdAluno = new ArrayList<Integer>();
	private ArrayList<String> nomeAluno = new ArrayList<String>();
	private ArrayList<Integer> dataAluno = new ArrayList<Integer>();
	private ArrayList<Integer> cpfAluno = new ArrayList<Integer>();
	
	
//	public ArrayList<Integer> getIdAluno() {
//		if(IdAluno.size() < 5) {
//		System.out.println("Digite um com 5 numerais");
//		}
//		return IdAluno;
//	}
//
//	public void setIdAluno(ArrayList<Integer> idAluno) {
//		if(IdAluno.size() < 5) {
//		System.out.println("Digite um com 5 numerais");
//		}
//		IdAluno = idAluno;
//	}
//
//	public ArrayList<String> getNomeAluno() {
//		return nomeAluno;
//	}
//
//	public void setNomeAluno(ArrayList<String> nomeAluno) {
//		System.out.println("Digite um nome válido");
//		this.nomeAluno = nomeAluno;
//	}
//
//	public ArrayList<Integer> getDataAluno() {
//		return dataAluno;
//	}
//
//	public void setDataAluno(ArrayList<Integer> dataAluno) {
//		System.out.println("Digite uma data com 6 digitos");
//		this.dataAluno = dataAluno;
//	}
//
//	public ArrayList<Integer> getCpfAluno() {
//		return cpfAluno;
//	}
//
//	public void setCpfAluno(ArrayList<Integer> cpfAluno) {
//		System.out.println("Digite um numero com 11 digitos");
//		this.cpfAluno = cpfAluno;
//	}



	public Scanner teclado = new Scanner(System.in);

	public void Cadastrar() {

		System.out.println("Cadastro de aluno");
		System.out.println("");

		System.out.println("Id do aluno");
		VetorIdAluno = Integer.parseInt(teclado.nextLine());
		IdAluno.add(VetorIdAluno);

		System.out.println("Nome do aluno");
		String VetornomeAluno = teclado.nextLine();
		nomeAluno.add(VetornomeAluno);

		System.out.println("Data de nascimento do aluno");
		Integer VetordataAluno = Integer.parseInt(teclado.nextLine());
		dataAluno.add(VetordataAluno);

		System.out.println("CPF do aluno");
		Integer VetorcpfAluno = Integer.parseInt(teclado.nextLine());
		cpfAluno.add(VetorcpfAluno);
	}

	public void Listar() {
		int i;
		System.out.println("Alunos listados");

		for (i = 0; i < IdAluno.size(); i++) {
			System.out.println("Id Aluno:" + IdAluno.get(i));
			System.out.println("Nome Aluno:" + nomeAluno.get(i));
			System.out.println("Data de Nascimento:" + dataAluno.get(i));
			System.out.println("CPF do aluno:" + cpfAluno.get(i));
		}
	}

	public void Pesquisar() {
		//System.out.println("Digite o nome do aluno");
		//IdAluno = IdAluno.replace("péssimo","ruim");
	}


	public void Atualizar() {
		int opc = 0;
	
		do {
			System.out.println("1-Id Aluno:");
			System.out.println("2-Nome Aluno:");
			System.out.println("3-Data de Nascimento:");
			System.out.println("4-CPF do aluno:");
			System.out.println("5-Sair");
			opc = teclado.nextInt();
			if (opc == 1) {
			IdAluno.remove(VetorIdAluno);
			VetorIdAluno = Integer.parseInt(teclado.nextLine());
			}
			//else if (opc == 2) {
				
			//}
			//else if (opc == 3) {
				
			//} 
			//else if (opc == 4) {
				
			//}
			System.out.println("5-Sair");
		}while(opc != 5);
	}
	
	public void Remover() {
		int i;
		System.out.println("Cuidado voce esta preste a excluir um aluno cadastrado");
		do {
			System.out.print("Digite 0 para apagar o cadastro ou Digite 1 pra sair");
			i = teclado.nextInt();
			if(i == 0) {
			IdAluno.clear();
			//nomeAluno.clear();
			//dataAluno.clear();
			//cpfAluno.clear();
			}
		}while(i != 1);
}}