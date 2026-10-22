package ejerciciosavanzados;
import java.util.Scanner;

public class avanzados {

    public static void ej1(Scanner sc){

        System.out.println("Introduce un número entre 0 y 1000: ");
        int n=sc.nextInt();

        if (n>=0&&n<=1000){

            for(int i=0;i<n;i++){
                System.out.println("Hello OIEx!");
            }

        } else {
            System.out.println("El valor debe estar entre 0 y 1000.");
        }

    } //---------------------------------------------------------------------------

    public static void ej2(Scanner sc){

        System.out.println("Introduce el tamaño de cada grupo (1-10000) y el de alumnos(0-1000000): ");
        int c=sc.nextInt();
        if (c<0||c>10000){
            System.out.println("El tamaño del grupo debe estar entre 0 y 10000."); //ERROR ANTES DE LEER ALUMNOS EN CASO DE QUE CORRESPONDA.
            System.exit(0);
        }
        int a=sc.nextInt();

        int outA=a%c;
        if (a>0&&a<=1000000&&outA==0){ // SI NO SOBRA NINGÚN ALUMNO SE COGE EL VALOR DE LA DIVISION.

            int resultC=a/c;
            System.out.println(resultC);

        } else if (a>=0&&a<=1000000&&outA>0){ // SI SOBRA ALGUNO; SE AÑADE UN GRUPO MAS PARA COMPLETAR.

            int resultC =a/c+1;
            System.out.println(resultC);

        } else {
            System.out.println("El número de alumnos debe estar entre 0 y 1000000."); // ERROR EN CASO DE QUE EL VALOR "STUDENTS" NO ESTE ENTRE LOS VALORES INDICADOS.
        }

    } //---------------------------------------------------------------------------

}
