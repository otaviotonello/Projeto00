package ProjetoZoo;

public class TamanduaBandeira extends Mamiferos {
	
	String comidaTamandua;
	
	@Override
	public void som() {
		System.out.println("Grunindo...");
	}
	
	public void alimentar() {
		System.out.println("Comendo formigas...");
	}
	
	public String comer(String comidaTamandua) {
		String comendo = comidaTamandua;
		return comendo;
	}
}
