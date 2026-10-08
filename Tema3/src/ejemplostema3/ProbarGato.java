package ejemplostema3;

public class ProbarGato {

    public static void main(String[] args) {

        Gato primerGato=new Gato();
        Gato segundoGato=new Gato();

        primerGato.asignarValores("Koldo","Siamés",9);
        segundoGato.asignarValores("Mohammed IV","Naranja doméstico",7);

        primerGato.maullar();
        primerGato.mostrar();
        segundoGato.maullar();
        segundoGato.mostrar();

    }

}
