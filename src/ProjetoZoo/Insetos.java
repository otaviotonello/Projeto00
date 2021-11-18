package ProjetoZoo;

public class Insetos extends Animal{
	private Boolean venenoso;
	
	@Override
	public void som() {
		System.out.println("Emitir Som...");
	}
	
	@Override
	public void alimentar() {
		System.out.println("comendo...");
	}
	
	public void dieta(String comida1) {
		System.out.println("Dieta única");
	}
	public void dieta(String comida1, String comida2) {
		System.out.println("Dieta multipla");
	}

	public Boolean getVenenoso() {
		return venenoso;
	}

	public void setVenenoso(Boolean venenoso) {
		this.venenoso = venenoso;
	}
	
	
}
