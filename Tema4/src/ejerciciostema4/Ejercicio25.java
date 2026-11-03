package ejerciciostema4;

import java.util.Scanner;

public class Ejercicio25 {

    public static void tablaMultiplicar() {

        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        System.out.println("=== Tabla de multiplicar del "+num+" ===");

        for (int i=0;i<11;i++){

            System.out.println(num+" * "+i+" = "+(num*i));

        }

    }

    public static void main(String[] args) {
        tablaMultiplicar();
    }

}
