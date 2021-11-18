package ProjetoZoo;

public class Cascavel extends Reptil{
    private boolean veneno;

    @Override
    public void som() {
        System.out.println("SSSSSSSSSSSSSSSSSSS");
    }

    @Override
    protected void Caminhar(){
        System.out.println("Rastejando");
    }

    @Override
    public boolean isVeneno() {
        return veneno;
    }

    @Override
    public void setVeneno(boolean veneno) {
        this.veneno = veneno;
    }

    @Override
    public String toString() {
        return "Cascavel{" +
                "veneno=" + veneno+
                '}';
    }
}
