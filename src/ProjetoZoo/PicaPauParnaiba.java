package ProjetoZoo;

public class PicaPauParnaiba extends Animal {
	
	String comidaPicaPauParnaiba;

	@Override
	public void som() {
		System.out.println("Estrindular..");
	}
	
	public void alimentar() {
		System.out.println("Comendo Insetos...");
	}
	public void voando() {
		System.out.println("Batendo asas...");
	}
	
	public String comer(String comidaPicaPauParnaiba) {
		String comendo = comidaPicaPauParnaiba;
		return comendo;
	}
	
}
