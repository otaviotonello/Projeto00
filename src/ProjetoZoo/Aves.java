package ProjetoZoo;

public class Aves extends Animal {
	
	@Override
	public void som() {
		System.out.println("Emitindo som...");
	}
	
	public void alimentar() {
		System.out.println("Comendo insetos...");
	}
	
	
	public void voando() {
		System.out.println("Batendo asas...");
	}
	
}
