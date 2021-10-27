package NonaAula;

public class Principal {

	public static void main(String[] args) {
		PetShop petshop = new PetShop();
		//cadastro do ggato
		Gato gato = new Gato();
		gato.setId(1);
		gato.setNome("miau");
		gato.setIdade(2);
		gato.setDono("Maria");
		gato.setTelefone("99999999");
		
		petshop.cadastrarGato(gato);
		//cadastro do cachorro
		Cachorro cachorro = new Cachorro();
		cachorro.setId(2);
		cachorro.setNome("auau");
		cachorro.setIdade(1);
		cachorro.setDono("Mario");
		cachorro.setTelefone("987654321");
		
		petshop.cadastrarCachorro(cachorro);
		//cadastro do passaro
		Passaro passaro = new Passaro();
		passaro.setId(3);
		passaro.setNome("fiu");
		passaro.setIdade(5);
		passaro.setDono("Ana");
		passaro.setTelefone("123456789");
		
		petshop.cadastrarPassaro(passaro);
		//listar animais
		petshop.listarAnimais();
		
	}

}
