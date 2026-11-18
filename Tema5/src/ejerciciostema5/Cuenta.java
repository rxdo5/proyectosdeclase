package ejerciciostema5;

public class Cuenta {

    private String titular;
    private double cantidad;

    public Cuenta(String titular){
        this.titular=titular;
    }

    public String getTitular() {
        return titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void ingresar(double cantidad){
        if (cantidad>0.0){
            this.cantidad=this.cantidad+cantidad;
            System.out.println("Usted a ingresado "+cantidad+"€; sumando un total de "+this.cantidad+"€ en esta cuenta.");
        }
    }

    public void retirar(double cantidad){

        if ((this.cantidad-cantidad)>0.0){
            this.cantidad=this.cantidad-cantidad;
            System.out.println("Usted a retirado "+cantidad+"€; quedando un total de "+this.cantidad+"€ en esta cuenta.");
        }

    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "titular='" + titular + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }

}
