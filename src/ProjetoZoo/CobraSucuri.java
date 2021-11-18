package ProjetoZoo;

public class CobraSucuri extends Animal {
	
	String comidaCobraSucuri;
	
	@Override
	public void som() {
		System.out.println("Tsssshhh Tssshhh tssshhh..");
	}
	
	public void alimentar() {
		System.out.println("Comendo Coelhos...");
	}
	
	public String comer(String comidaCobraSucuri) {
		String comendo = comidaCobraSucuri;
		return comendo;
	}
}
