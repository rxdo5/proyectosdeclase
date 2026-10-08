package ejemplostema3;

public class ProbarPerro {

    public static void main(String[] args) {

        Perro primerPerro=new Perro();

        primerPerro.asignarValores("Toby","Dálmata","Blanco y negro",5);

        primerPerro.mostrar();
        primerPerro.ladrar();
        primerPerro.comer();
        primerPerro.dormir();
        primerPerro.nombre="Ábalos";
        primerPerro.mostrar();

    }

}
