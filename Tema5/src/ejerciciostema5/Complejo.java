package ejerciciostema5;

public class Complejo {

    private double real;
    private double imaginaria;

    public Complejo(){
    }

    public Complejo(double real, double imaginaria){
        this.real=real;
        this.imaginaria=imaginaria;
    }

    public double getReal() {
        return real;
    }

    public double getImaginaria() {
        return imaginaria;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImaginaria(double imaginaria) {
        this.imaginaria = imaginaria;
    }

    public void sumar(Complejo otroComplejo){
        real=real+otroComplejo.getReal();
        imaginaria=imaginaria+otroComplejo.getImaginaria();
    }

    @Override
    public String toString() {
        return "Complejo{" +
                "real=" + real +
                ", imaginaria=" + imaginaria +
                '}';
    }
}
