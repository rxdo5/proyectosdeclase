package ejerciciostema4;

import java.util.Scanner;

public class Ejercicio35 {

    public static void mostrarCuadrados(int num) {

        System.out.println("Para n = "+num+":");
        System.out.println("NÚMERO\tCUADRADO\tCÚBO");

        int i=1;

        while(i<num) {
            System.out.println(i + "\t\t" + num * num + "\t\t\t" + num * num * num);
            i++;
        }

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int num=sc.nextInt();

        mostrarCuadrados(num);

    }

}
