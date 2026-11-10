package ejerciciostema4;

public class Ejercicio44 {

    public static void contador() {

        int miles=0;
        int centenas=0;
        int decenas=0;
        int unidades=9999;

        while (unidades>9){
            unidades=unidades-10;
            ++decenas;
        }

        while (decenas>9){
            decenas=decenas-10;
            ++centenas;
        }

        while (centenas>9){
            centenas=centenas-10;
            ++miles;
        }

        System.out.print(miles+"·"+centenas+"·"+decenas+"·"+unidades);

    }

    public static void main(String[] args) {
        contador();
    }

}
