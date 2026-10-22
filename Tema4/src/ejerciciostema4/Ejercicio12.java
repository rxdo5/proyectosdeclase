package ejerciciostema4;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("1.CUADRADO\n2.RECTÁNGULO\n3.TRIÁNGULO\n4.CÍRCULO");
        System.out.println("\nIntroduzca su opción: ");
        int option= sc.nextInt();


        if(option>0&&option<5) {

            switch (option) {
                case 1:
                    System.out.println("CUADRADO.");
                    break;
                case 2:
                    System.out.println("RECTÁNGULO.");
                    break;
                case 3:
                    System.out.println("TRIÁNGULO.");
                    break;
                case 4:
                    System.out.println("CÍRCULO.");
                    break;
            }

        } else {
            System.out.println("Introduzca una opción válida.");
        }


    }

}
