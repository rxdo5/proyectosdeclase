package ejerciciostema3;

public class ProbarGato {

    public static void main(String[] args) {

        Gato primerGato=new Gato();
        Gato segundoGato=new Gato();

        primerGato.asignarValores("Koldo","Siamés",9);
        segundoGato.asignarValores("Mohammed IV","Naranja doméstico",7);

        primerGato.maullar();
        System.out.println(primerGato.mostrar());
        System.out.println("---------------------------");

        segundoGato.maullar();
        System.out.println(segundoGato.mostrar());
        System.out.println("---------------------------");

        primerGato.vidas=8;
        System.out.println(primerGato.mostrar());
        System.out.println("---------------------------");

        //EJECICIO 7
        System.out.println("EJERCICIO 7:\n--------------");
        System.out.println(primerGato.mostrar());
        primerGato.restarVidas();
        System.out.println("--------------");
        System.out.println(primerGato.mostrar());


    }

}
