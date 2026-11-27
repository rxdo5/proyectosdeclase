package simulacrotema5;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        int num=0;
        int contadorPares=0;
        int sumaPares=0;
        Scanner sc=new Scanner(System.in);

        while(num!=-1){
            System.out.println("Introduzca número:");
            num=sc.nextInt();

            if (num%2==0&&num>10){
                contadorPares++;
                sumaPares=sumaPares+num;
            }

        }

        System.out.println(contadorPares+","+sumaPares);

    }

}
