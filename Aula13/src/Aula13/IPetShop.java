package Aula13;

public interface IPetShop {
	
	public void cadastrar(Animal animal);
	public void remover(int id);
	public void listar();
	public void pesquisar(String nome);
}
