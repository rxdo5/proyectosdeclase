
package simulacrotema5;

public class PuertaAcceso {

    // EJERCICIO 3

    private String nombre;
    private boolean abierta;
    private int balancePersonas;

    public PuertaAcceso() {
        this("Puerta Principal");
    }

    public PuertaAcceso(String nombre) {
        this.nombre = nombre;
        this.abierta = false;
        this.balancePersonas = 0;
    }

    public boolean isAbierta() {
        return abierta;
    }

    public void setAbierta(boolean abierta) {
        this.abierta = abierta;
    }

    public void abrir() {
        if (!isAbierta()) {
            setAbierta(true);
        }
    }

    public void cerrar() {
        if (isAbierta()) {
            setAbierta(false);
        }
    }

    public boolean entrar(int personas, int aforoActual, int aforoMaximo) {

        if (isAbierta()&&personas>0&&aforoActual+personas<=aforoMaximo) {
            balancePersonas += personas;
            return true;
        } else {
            return false;
        }

    }

    public boolean salir(int personas, int aforoActual) {

        if (isAbierta()&&personas>0&&aforoActual-personas>=0) {
            balancePersonas -= personas;
            return true;
        } else {
            return false;
        }

    }

    @Override
    public String toString() {
        return "PuertaAcceso [nombre=" + nombre +
                ", abierta=" + abierta +
                ", balancePersonas=" + balancePersonas + "]";
    }

    public static void main(String[] args) {

        PuertaAcceso p1 = new PuertaAcceso();
        PuertaAcceso p2 = new PuertaAcceso("Puerta Trasera");

        System.out.println(p1);
        System.out.println(p2);

        p1.abrir();
        System.out.println(p1.entrar(10, 0, 100));
        System.out.println(p1.entrar(5, 10, 100));
        System.out.println(p1.salir(8, 15));
        System.out.println(p1);

        p1.cerrar();
        System.out.println(p1.salir(2, 7));
    }

}