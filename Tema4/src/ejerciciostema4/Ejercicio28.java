package ejerciciostema4;

import java.util.Scanner;

public class Ejercicio28 {

    public static void sumaDe15() {

        Scanner sc=new Scanner(System.in);

        System.out.println("Introduzca todos los 15 números a sumar:");

        int i=1;
        int suma=0;

        while(i!=16){
            System.out.println("Ingrese el número "+i+" de 15: ");
            int input=sc.nextInt();
            suma=suma+input;
            i++;
        }

        System.out.println("La suma total de los 15 números es: "+suma);

    }

    public static void main(String[] args) {
        sumaDe15();
    }

}
