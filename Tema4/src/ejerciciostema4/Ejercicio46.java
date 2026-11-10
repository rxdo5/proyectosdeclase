package ejerciciostema4;

import java.util.Scanner;

public class Ejercicio46 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Introduce un numero con un decimal: (X,x)");
        double num= sc.nextDouble();

        double resto=num-(int)num;

        switch ((int)num){
            case 1 -> System.out.print("Uno con ");
            case 2 -> System.out.print("Dos con ");
            case 3 -> System.out.print("Tres con ");
            case 4 -> System.out.print("Cuatro con ");
            case 5 -> System.out.print("Cinco con ");
            case 6 -> System.out.print("Seis con ");
            case 7 -> System.out.print("Siete con ");
            case 8 -> System.out.print("Ocho con ");
            case 9 -> System.out.print("Nueve con ");
        }

        switch ((int)(resto*10)){
            case 1 -> System.out.println("uno.");
            case 2 -> System.out.println("dos.");
            case 3 -> System.out.println("tres.");
            case 4 -> System.out.println("cuatro.");
            case 5 -> System.out.println("cinco.");
            case 6 -> System.out.println("seis.");
            case 7 -> System.out.println("siete.");
            case 8 -> System.out.println("ocho.");
            case 9 -> System.out.println("nueve.");
        }



    }

}
