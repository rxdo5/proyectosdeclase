package ejerciciostema5;

public class Coche {

    private String marca;
    private double velocidad;

    public Coche(){
        marca="Sin marca";
        velocidad=0.0;
    }

    public Coche(String marca,double velocidad){
        this.marca=marca;
        setVelocidad(velocidad);
    }

    public double getVelocidad() {
        return velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setVelocidad(double velocidad) {

        if (velocidad<0.0||velocidad>200.0){
            System.out.println("Velocidad inválida.");
        } else this.velocidad = velocidad;

    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Coche[" +
                "marca=" + marca +
                ", velocidad=" + velocidad +
                " km/h]";
    }

    public static void main(String[] args) {

        Coche defecto=new Coche();
        Coche setters=new Coche();
        Coche parametrizado=new Coche("Golfito",200);

        System.out.println(defecto);

        setters.setMarca("Seat");
        System.out.println(setters);

        setters.setVelocidad(-50.0);
        setters.setVelocidad(120.0);
        System.out.println(setters);

        System.out.println(parametrizado);

    }

}
