package ejerciciostema4;

import java.util.Scanner;

public class Ejercicio26 {

    public static void mostrarHastaN() {

        Scanner sc=new Scanner(System.in);

        System.out.println("Hasta que número quieres contar?");
        int n= sc.nextInt();

        for (int i=0;i<(n+1);i++){
            System.out.print(i+" ");
        }

    }

    public static void main(String[] args) {
        mostrarHastaN();
    }

}
