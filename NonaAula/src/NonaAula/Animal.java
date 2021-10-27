package NonaAula;

public class Animal {
	private int id;
	private String nome;
	private int idade;
	private String dono;
	private String telefone;

	public Animal() {

	}

	public void exibeDados() {
		System.out.println("Id:" + id);
		System.out.println("nome:" + nome);
		System.out.println("Idade:" + idade);
		System.out.println("dono:" + dono);
		System.out.println("telefone:" + telefone);

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

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
