package ejerciciostema4;
import java.util.Scanner;

public class Ejercicio13 {

    public static String esMayor(int num1, int num2){

        /*if (num1>num2) {
            System.out.println("El primer número es mayor que el segundo.");
        } else { System.out.println("El segundo número es mayor que el primero."); }*/

        return num1>num2 ? "El primer número es mayor que el segundo." : "El segundo número es mayor que el primero.";

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Introduce el primer número: ");
        int num1=sc.nextInt();
        System.out.println("Introduce el segundo número: ");
        int num2=sc.nextInt();

        System.out.println(Ejercicio13.esMayor(num1,num2));
    }

}
