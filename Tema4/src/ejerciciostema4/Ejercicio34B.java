package ejerciciostema4;

import java.util.Scanner;

public class Ejercicio34B {

    public static void leerNumeros() {

        int num=0;
        int count=0;

        Scanner sc=new Scanner(System.in);

        while (num>=0){
            System.out.println("Introduzca un número: ");
            num= sc.nextInt();

            if (num%10==2){
                ++count;
            }

        }

        System.out.println("Has introducido un número negativo. Fin de lectura.");
        System.out.println("Cantidad de números acabados en dos: "+count);

    }

    public static void main(String[] args) {
        leerNumeros();
    }

}
