package ProjetoZoo;

public class Reptil extends Animal {
    protected String cor;
    protected int idade;
    protected float tamanho;
    protected boolean veneno;


    protected void Caminhar(){}

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }

    public boolean isVeneno() {
        return veneno;
    }

    public void setVeneno(boolean veneno) {
        this.veneno = veneno;
    }


    @Override
    public void som() {

    }


}
