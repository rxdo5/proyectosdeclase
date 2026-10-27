package ejerciciostema4;

import java.util.Scanner;

public class Ejercicio11 {

    public static String mostarDecenas(int num){

        String output="null";
        int resto=num%10;
        num=num-resto;

        switch(num){
            case 0:
                output="cero decenas";
                break;
            case 10:
                output="diez";
                break;
            case 20:
                output="veinte";
                break;
            case 30:
                output="treinta";
                break;
            case 40:
                output="cuarenta";
                break;
            case 50:
                output="cincuenta";
                break;
            case 60:
                output="sesenta";
                break;
            case 70:
                output="setenta";
                break;
            case 80:
                output="ochenta";
                break;
            case 90:
                output="noventa";
                break;
        }

        return output;

    }

    public static String mostrarUnidades(int num){

        String output="null";
        int resto=num%10;

        switch(resto){
            case 0:
                output="cero unidades";
                break;
            case 1:
                output="uno";
                break;
            case 2:
                output="dos";
                break;
            case 3:
                output="tres";
                break;
            case 4:
                output="cuatro";
                break;
            case 5:
                output="cinco";
                break;
            case 6:
                output="seis";
                break;
            case 7:
                output="siete";
                break;
            case 8:
                output="ocho";
                break;
            case 9:
                output="nueve";
                break;
        }

        return output;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Introduce el número:");
        int num= sc.nextInt();

        if (num<100&&num>=0) {
            System.out.println(mostarDecenas(num) + " y " + mostrarUnidades(num));
        } else {
            System.out.println("Introduce un numero válido.");
        }

    }

}
