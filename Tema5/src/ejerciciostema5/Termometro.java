package ejerciciostema5;

public class Termometro {

    private double temperatura;

    public Termometro(){
        temperatura=20.0;
    }

    public Termometro(double temperatura){
        setTemperatura(temperatura);
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        if (temperatura>-273.15&&temperatura<100.0){
            this.temperatura=temperatura;
        } else System.out.println("Temperatura fuera de rango.");
    }

    @Override
    public String toString() {
        return "Termometro " +
                "[temperatura=" + temperatura +
                " Cº]";
    }

}
