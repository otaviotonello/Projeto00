package ProjetoZoo;

public class Herbivoros extends Animal {
	
	@Override
	public void som() {
		System.out.println("Emitindo som...");
	}
	
	public void alimentar() {
		System.out.println("Comendo grama...");
	}
	
}

