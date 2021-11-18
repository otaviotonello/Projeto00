package ProjetoZoo;

public class Cavalo extends Animal {
	
	String comidaCavalo;
	
	@Override
	public void som() {
		System.out.println("Som de cavalo...");
	}
	
	public void alimentar() {
		System.out.println("Comendo grama...");
	}
	
	public String comer(String comidaCavalo) {
		String comendo = comidaCavalo;
		return comendo;
	}
}

