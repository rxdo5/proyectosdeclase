package probarpunto;

import ejerciciostema5.Punto;

public class ProbarPunto {

    public static void main(String[] args) {

        Punto miPunto=new Punto((byte)5,(byte)5);
        Punto segundoPunto=new Punto();

        miPunto.copiar(segundoPunto);

        miPunto.mover((byte)5,(byte)5);

        System.out.println(miPunto);
        System.out.println(segundoPunto);

    }

}
