package ProjetoZoo;

public class Leao extends Carnivoros {

	String comidaLe�o;
	
	@Override
	public void som() {
		System.out.println("Rugindo...");
	}
	
	public void alimentar() {
		System.out.println("Comendo zebras...");
	}
	
	public String comer(String comidaLe�o) {
		String comendo = comidaLe�o;
		return comendo;
	}

}
