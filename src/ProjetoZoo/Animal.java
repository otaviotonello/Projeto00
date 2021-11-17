
package ProjetoZoo;

public abstract class Animal {

	//ATRIBUTOS
	
	private double tamanhoMax, expcVida, pesoMax;
	private boolean extincao;
	private String habitat, nome, comida;
	
	//METODOS
	
	public abstract void som();

	public void alimentar() {
		System.out.println("Comendo...");
	}
	
	public String comer(String comida) {
		String comendo = comida;
		return comendo;
	}
	
	//GETTERS E SETTERs
	
	public String getComida() {
		return comida;
	}

	public void setComida(String comida) {
		this.comida = comida;
	}

	public double getTamanhoMax() {
		return tamanhoMax;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setTamanhoMax(double tamanhoMax) {
		this.tamanhoMax = tamanhoMax;
	}

	public double getExpcVida() {
		return expcVida;
	}

	public void setExpcVida(double expcVida) {
		this.expcVida = expcVida;
	}

	public double getPesoMax() {
		return pesoMax;
	}

	public void setPesoMax(double pesoMax) {
		this.pesoMax = pesoMax;
	}

	public boolean isExtincao() {
		return extincao;
	}

	public void setExtincao(boolean extincao) {
		this.extincao = extincao;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	
}
