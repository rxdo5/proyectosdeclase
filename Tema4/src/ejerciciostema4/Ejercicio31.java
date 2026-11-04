package ejerciciostema4;

import java.util.Scanner;

public class Ejercicio31 {

    public static void mostrarResultados() {

        Scanner sc=new Scanner(System.in);

        int aprobados=0;
        int condicionados=0;
        int suspensos=0;

        for (int i=1;i<=6;i++){
            System.out.println("Ingrese la nota del alumno "+i+":");
            int j= sc.nextInt();

            if (j>=5&&j<10){
                ++aprobados;
            } else if (j==4) {
                ++condicionados;
            } else if (j>=0&&j<4){
                ++suspensos;
            } else {
                System.out.println("Esta nota no es válida");
            }

        }

        System.out.println("-- RESUMEN DE LOS RESULTADOS --");
        System.out.println("Alumnos aprobados (>= 5): "+aprobados);
        System.out.println("Alumnos condicionados (= 4): "+condicionados);
        System.out.println("Alumnos suspensos (< 4): "+suspensos);

    }

    public static void main(String[] args) {
        mostrarResultados();
    }

}
