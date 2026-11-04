package ejerciciostema4;

import java.util.Scanner;

public class Ejercicio33 {

    public static void leerNumeros() {

        Scanner sc=new Scanner(System.in);

        int num=-1;

        System.out.println("Ingrese números, introduzca 0 para salir.");

        while(num!=0) {

            num=sc.nextInt();

            if (num%2==0&&num!=0){
                System.out.println("El número "+num+" es par.");
            } else if  (num%2!=0){
                System.out.println("El número "+num+" es impar.");
            }

        }

    }

    public static void main(String[] args) {
        leerNumeros();
    }

}
