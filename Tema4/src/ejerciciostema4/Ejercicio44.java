
package ejerciciostema4;

public class Ejercicio44 {

    public static void contador() {

        int miles = 0;
        int centenas = 0;
        int decenas = 0;
        int unidades = 0;

        do {

            System.out.println(miles + "·" + centenas + "·" + decenas + "·" + unidades);

            ++unidades;

            while (unidades > 9) {
                unidades = unidades - 10;
                ++decenas;
            }

            while (decenas > 9) {
                decenas = decenas - 10;
                ++centenas;
            }

            while (centenas > 9) {
                centenas = centenas - 10;
                ++miles;
            }

        } while (miles != 10);

    }

    public static void main(String[] args) {
        contador();
    }

}