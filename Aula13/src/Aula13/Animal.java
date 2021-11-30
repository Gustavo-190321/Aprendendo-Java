package Aula13;

public abstract class Animal {
	
	private int id;
	private String nome;
	private String raca;
	private int idade;
	private String nomeDono;
	private String telefone;
	
	public Animal() {
		id = 0;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNomeDono() {
		return nomeDono;
	}

	public void setNomeDono(String nomeDono) {
		this.nomeDono = nomeDono;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void imprimir() {
		System.out.println("id: " + this.id);
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		System.out.println("Raça: " + this.raca);
		System.out.println("Nome dono: " + this.nomeDono);
		System.out.println("Telefone: " + this.telefone);
	}
}
