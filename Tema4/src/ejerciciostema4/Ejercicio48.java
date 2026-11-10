package ejerciciostema4;

import java.util.Scanner;

public class Ejercicio48 {

    public static void factorial(int num) {

        int factorial=1;

        for (int i=1;i<=num;i++){
            factorial=factorial*i;
        }

        System.out.println(factorial);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Introduce el número factorial:");
        factorial(sc.nextInt());
    }

}
