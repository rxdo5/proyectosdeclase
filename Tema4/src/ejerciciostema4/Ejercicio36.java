package ejerciciostema4;

import java.util.Scanner;

public class Ejercicio36 {

    public static void repeat(int input){

        Scanner sc=new Scanner(System.in);

        while (input<=0){
            System.out.println("Introduzca un valor válido:");
            input=sc.nextInt();
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int suma=0;

        System.out.println("Introduce un número inicial:");
        int inicial=sc.nextInt();
        repeat(inicial);

        System.out.println("Introduce un valor incremental:");
        int incremental= sc.nextInt();
        repeat(incremental);

        for (int i=0;i<5;i++){
            System.out.print(inicial);
            suma=suma+inicial;
            inicial=inicial+incremental;
        }

        System.out.println("\nSuma = "+suma);

    }

}
