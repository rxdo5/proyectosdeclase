package ejerciciostema4;
import java.util.Scanner;

public class Ejercicio8 {

    public static String mostrarMensajeEdad(int edad){

        String ret;

        if (edad>0&&edad<13) {
            ret="Es un niño.";
        } else if (edad<16) {
            ret="Es un adolescente.";
        } else if (edad<65) {
            ret="Es un adulto.";
        } else {
            ret="Es un anciano.";
        }

        return ret;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Introduce la edad: ");
        int edad=sc.nextInt();

        System.out.println(Ejercicio8.mostrarMensajeEdad(edad));
    }

}
