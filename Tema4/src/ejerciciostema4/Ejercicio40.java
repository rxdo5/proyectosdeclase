package ejerciciostema4;

public class Ejercicio40 {

    public static void dibujarCuadrado(int base, int altura){

        for (int i=altura; i>0; i--){

        for (int j=base;j>0;j--){
            System.out.print("*");
        }

            System.out.print("\n");

        }

    }

    public static void main(String[] args) {
        dibujarCuadrado(6,4);
    }

    // UTILIZAR OPERADOR ?

}
