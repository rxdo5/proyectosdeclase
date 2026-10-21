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
        int group=sc.nextInt();
        if (group<0||group>10000){
            System.out.println("El tamaño del grupo debe estar entre 0 y 10000."); //ERROR ANTES DE LEER ALUMNOS EN CASO DE QUE CORESPONDA
            System.exit(0);
        }
        int students=sc.nextInt();

        int groupRest=students%group;
        if (students>0&&students<=1000000&&groupRest==0){ // SI NO SOBRA NINGUN ALUMNO SE COGE EL VALOR DE LA DIVISION

            int groupNumber=students/group;
            System.out.println(groupNumber);

        } else if (students>=0&&students<=1000000&&groupRest>0){ // SI SOBRA ALGUNO; SE AÑADE UN GRUPO MAS PARA COMPLETAR.

            int groupNumber=students/group+1;
            System.out.println(groupNumber);

        } else {
            System.out.println("El número de alumnos debe estar entre 0 y 1000000."); // ERROR EN CASO DE QUE EL VALOR "STUDENTS" NO ESTE ENTRE LOS VALORES INDICADOS.
        }

    } //---------------------------------------------------------------------------

    public static void ej3(Scanner sc){



    } //---------------------------------------------------------------------------

}
