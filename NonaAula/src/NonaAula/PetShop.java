package NonaAula;

import java.util.ArrayList;

public class PetShop {
	private ArrayList<Gato> listaGatos;
	private ArrayList<Cachorro> listaCachorros;
	private ArrayList<Passaro> listaPassaros;

	public PetShop() {
		listaGatos = new ArrayList<Gato>();
		listaCachorros = new ArrayList<Cachorro>();
		listaPassaros = new ArrayList<Passaro>();
	}

	public void cadastrarGato(Gato gato) {
		listaGatos.add(gato);
	}

	public void cadastrarCachorro(Cachorro cachorro) {
		listaCachorros.add(cachorro);
	}

	public void cadastrarPassaro(Passaro passaro) {
		listaPassaros.add(passaro);
	}

	public void listarAnimais() {
		for (Gato gatoAtual : listaGatos)
			gatoAtual.exibeDados();
		for (Cachorro cachorroAtual : listaCachorros)
			cachorroAtual.exibeDados();
		for (Passaro passaroAtual : listaPassaros) {
			passaroAtual.exibeDados();

		}
	}
}