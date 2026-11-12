package ejerciciostema4;

import java.util.Scanner;

public class Ejercicio53 {

    public static void fibonacci(int iteraciones) { // EL ANTERIOR AL ANTERIOR MAS EL SIGUIENTE, SIENDO EL PRIMERO 0;

        // https://es.wikihow.com/calcular-la-secuencia-de-Fibonacci

        long actual =0;
        long siguiente =1;
        long despues;

        // Con Long, el máximo son 93 iteraciones, más desborda.

        for (int i=1;i<=iteraciones;i++){

            System.out.println("ITERACIÓN "+i+" | "+ actual);

            despues = actual + siguiente; // Se calcula el que va después de siguiente; auxiliar, guarda el valor para no perderlo.

            actual = siguiente; // Se desplaza "siguiente" a "actual" para mostrar en siguiente iteracion

            siguiente = despues; // Se desplaza "después" hacia actual (pasa por siguiente)

        }

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Cuantas iteraciones de fibonacci quieres mostrar?:");
        fibonacci(sc.nextInt());
    }

}
