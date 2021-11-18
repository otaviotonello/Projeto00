package ProjetoZoo;

public class Leao extends Carnivoros {

	String comidaLeão;
	
	@Override
	public void som() {
		System.out.println("Rugindo...");
	}
	
	public void alimentar() {
		System.out.println("Comendo zebras...");
	}
	
	public String comer(String comidaLeão) {
		String comendo = comidaLeão;
		return comendo;
	}

}
