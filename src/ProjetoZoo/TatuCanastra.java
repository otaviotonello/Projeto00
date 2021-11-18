package ProjetoZoo;

public class TatuCanastra extends Mamiferos {
	String comidaTatu;
	
	@Override
	public void som() {
		System.out.println("Não faz som...");
	}
	
	public void alimentar() {
		System.out.println("Comendo Aranhas...");
	}
	
	public String comer(String comidaTatu) {
		String comendo = comidaTatu;
		return comendo;
	}
}
