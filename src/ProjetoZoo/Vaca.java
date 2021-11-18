package ProjetoZoo;

public class Vaca extends Animal{
	
	String comidaVaca;
	
	@Override
	public void som() {
		System.out.println("MUUUUUUUU...");
	}
	
	public void alimentar() {
		System.out.println("Comendo grama...");
	}
	
	public String comer(String comidaVaca) {
		String comendo = comidaVaca;
		return comendo;
	}
}
