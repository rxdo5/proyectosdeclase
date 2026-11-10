package ejerciciostema4;

import java.util.Scanner;

public class Ejercicio47 {

    public static boolean esPrimo(){

        Scanner sc=new Scanner(System.in);

        System.out.println("Introduce número entero:");
        int num=sc.nextInt();

        for (int i=2;i<num;i++){

            if (num%i==0){
                return false;
            }

        }

        return true;

    }

    public static void main(String[] args) {
        System.out.println("Es primo: "+esPrimo());
    }

}
