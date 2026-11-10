package ejerciciostema4;

import java.util.Scanner;

public class Ejercicio43 {

    public static void calcularNotas() {

        Scanner sc=new Scanner(System.in);

        double media=0.0;
        int aprobados=0;
        int suspensos=0;

        System.out.println("INGRESO DE NOTAS");

        for (int i=1;i<=10;i++){
            System.out.println("Ingrese la nota del alumno "+i+" (0 a 10):");
            double nota= sc.nextDouble();

            if (nota>=5.0){
                ++aprobados;
            } else {
                ++suspensos;
            }

            media=media+nota;


        }

        System.out.println("MEDIA: "+media/10);
        System.out.println("APROBADOS: "+aprobados);
        System.out.println("SUSPENSOS: "+suspensos);

    }

    public static void main(String[] args) {
        calcularNotas();
    }

}
