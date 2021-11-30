package Aula13;

public class Cachorro extends Animal {
	
	// podem ser criados atributos e métodos referentes à cachorro
	
	public Cachorro() {
		super();
	}

	// sobrescrita de método
	public void imprimir() {
		System.out.println("*** Cachorro ***");
		super.imprimir();
	}
}
