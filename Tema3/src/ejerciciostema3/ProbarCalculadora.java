package ejerciciostema3;

import java.util.Scanner;

public class ProbarCalculadora {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        Calculadora calc=new Calculadora();

        System.out.println("Primer número (debe ser mayor al siguiente):");
        int a= sc.nextInt();

        System.out.println("Segundo número:");
        int b= sc.nextInt();

        System.out.println(calc.sumar(a,b));
        System.out.println(calc.restar(a,b));
        System.out.println(calc.multiplicar(a,b));
        System.out.println(calc.dividir(a,b));

    }

}
