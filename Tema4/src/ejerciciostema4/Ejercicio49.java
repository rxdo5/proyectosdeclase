package ejerciciostema4;

import java.util.Scanner;

public class Ejercicio49 {

    public static void numerosAmigos(int num) {

        int suma=0;
        int segundaSuma=0;

        for (int i=1;i<num;i++){

            if (num%i==0){
                suma=suma+i;
            }

        }

        for (int i=1;i<suma;i++){

            if (suma%i==0){
                segundaSuma=segundaSuma+i;
            }

        }


        if (num==segundaSuma){
            System.out.println(num+" y "+suma+" son hermanos.");
        } else {
            System.out.println(num+" y "+suma+" no son hermanos.");
        }

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);


        System.out.println("Introduzca un número: ");
        numerosAmigos(sc.nextInt());
    }

}
