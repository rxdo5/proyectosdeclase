package ejerciciostema4;

import java.util.Scanner;

public class Ejercicio34 {

    public static void leerNumeros() {

        int num=0;
        int div=0;
        double media=0.0;

        Scanner sc=new Scanner(System.in);

        while (num>=0){
            System.out.println("Introduzca un número: ");
            num= sc.nextInt();

            if (num>=0){
                ++div;
                media=media+num;
            }

        }

        System.out.println("Has introducido un número negativo. Fin de lectura.");
        System.out.printf("La media de los 4 números ingresados es: ");
        System.out.print(media/div);

    }

    public static void main(String[] args) {
        leerNumeros();
    }

}
