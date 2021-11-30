package Aula13;

import java.util.ArrayList;
import java.util.Iterator;

public class PetShop implements IPetShop {
	
	private ArrayList<Animal> listaAnimal;
	private int id;
	
	public PetShop() {
		listaAnimal = new ArrayList<Animal>();
		id = 0;
	}
	
	@Override
	public void cadastrar(Animal animal) {
		animal.setId(id);
		listaAnimal.add(animal);
		System.out.println("Operação realizada com sucesso\n");
		id++;
	}
	
	@Override
	public void remover(int id) {
		
		boolean encontrou = false;

		// percorre a lista
		Iterator<Animal> iterator = listaAnimal.iterator();
		
		while (iterator.hasNext()) {
			
			Animal animalAtual = iterator.next();
			
			if (animalAtual.getId() == id) {
				iterator.remove();
				encontrou = true;
				break;
			}
		}
		
		if (encontrou) {
			System.out.println("Operação realizada com sucesso");
		}
		else {
			System.out.println("Animal não encontrado");
		}
		
		System.out.println();
	}
	
	@Override
	public void listar() {

		// percorre a lista
		for (Animal animalAtual: listaAnimal) {
			animalAtual.imprimir();
		}
		
		System.out.println();
	}
	
	@Override
	public void pesquisar(String nome) {
		
		boolean encontrou = false;

		// pesquisa na lista
		for (Animal animalAtual: listaAnimal) {
			if (animalAtual.getNome().equals(nome)) {
				animalAtual.imprimir();
				encontrou = true;
				break;
			}
		}
		
		if (!encontrou) {
			System.out.println("Animal não encontrado");
		}
		
		System.out.println();
	}
}
