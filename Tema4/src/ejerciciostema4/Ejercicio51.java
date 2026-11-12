package ejerciciostema4;

import java.util.Scanner;

public class Ejercicio51 {

    public static void factoresPrimos(int num) {

        int divisor=2;

        while(num>1) {

            if (num % divisor == 0) {
                num = num / divisor;
                System.out.print(divisor+" ");
            } else {
                ++divisor;
            }

        }

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Introduce el número a mostrar:");
        int num=sc.nextInt();

        if (num<=1){
            System.out.println("Introduce un número válido.");
        } else {
            factoresPrimos(num);
        }

    }

}
