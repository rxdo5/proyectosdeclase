package ejerciciostema4;

import java.util.Scanner;

public class Ejercicio19 {

    public static void mostrarHolaAdios(){
        Scanner sc=new Scanner(System.in);

        System.out.println("Introduzca un número:");
        int num=sc.nextInt();

        while (num>0) {

            if (num % 2 != 0) {
                System.out.println("Hola");
            } else {
                System.out.println("Adiós");
            }

            num--;

        }

    }

    public static void main(String[] args) {
        mostrarHolaAdios();
    }

}
