package ejerciciostema4;
import java.util.Scanner;

public class Ejercicio9 {

    public static String mostrarNota(int nota){

    String output="null";

        /*switch(nota) {
            case 0 -> output="cero";
            case 1 -> output="uno";
            case 2 -> output="dos";
            case 3 -> output="tres";
            case 4 -> output="cuatro";
            case 5 -> output="cinco";
            case 6 -> output="seis";
            case 7 -> output="siete";
            case 8 -> output="ocho";
            case 9 -> output="nueve";
            case 10 -> output="diez";
        }*/

        switch (nota) {
            case 0:
                output = "cero";
                break;
            case 1:
                output = "uno";
                break;
            case 2:
                output = "dos";
                break;
            case 3:
                output = "tres";
                break;
            case 4:
                output = "cuatro";
                break;
            case 5:
                output = "cinco";
                break;
            case 6:
                output = "seis";
                break;
            case 7:
                output = "siete";
                break;
            case 8:
                output = "ocho";
                break;
            case 9:
                output = "nueve";
                break;
            case 10:
                output = "diez";
                break;
        }

    return output;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Introduce la nota: ");
        int nota =sc.nextInt();

        System.out.println(Ejercicio9.mostrarNota(nota));
    }

}
