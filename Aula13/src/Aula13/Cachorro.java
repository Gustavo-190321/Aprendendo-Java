package Aula13;

public class Cachorro extends Animal {
	
	// podem ser criados atributos e m�todos referentes � cachorro
	
	public Cachorro() {
		super();
	}

	// sobrescrita de m�todo
	public void imprimir() {
		System.out.println("*** Cachorro ***");
		super.imprimir();
	}
}
