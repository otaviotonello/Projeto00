package ProjetoZoo;

public class Repetilianos extends Reptil{
    private boolean disfarcado;

    public boolean isDisfarcado() {
        return disfarcado;
    }

    public void setDisfarcado(boolean disfarcado) {
        this.disfarcado = disfarcado;
    }

    @Override
    protected void Caminhar() {
        System.out.println("caminhando como um humano");
    }

    @Override
    public void som() {
        System.out.println("caminhando como um humano");
    }

    @Override
    public String comer(String comida) {
        return "comendo como humano";
    }


}
