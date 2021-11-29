package ProjetoZoo;

public class Leao extends Carnivoros {

	String comidaLeao;
	
	@Override
	public void som() {
		System.out.println("Rugindo...");
	}
	
	public void alimentar() {
		System.out.println("Comendo zebras...");
	}
	
	public String comer(String comidaLeao) {
		String comendo = comidaLeao;
		return comendo;
	}

}
