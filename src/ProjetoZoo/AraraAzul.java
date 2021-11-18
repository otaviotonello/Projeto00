package ProjetoZoo;

public class AraraAzul extends Aves {
	
	String comidaAraraAzul;
	
	@Override
	public void som() {
		System.out.println("Palrar..");
	}
	
	public void alimentar() {
		System.out.println("Comendo Sementes...");
	}
	public void voando() {
		System.out.println("Batendo asas...");
	}
	
	public String comer(String comidaAraraAzul) {
		String comendo = comidaAraraAzul;
		return comendo;
	}
	

}

