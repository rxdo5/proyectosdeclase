package ejerciciostema4;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Introduce el primer número: ");
        int num1=sc.nextInt();
        System.out.println("Introduce el segundo número: ");
        int num2=sc.nextInt();

        Ejercicio4.esMayor(num1,num2);


    }

    public static void esMayor(int num1, int num2){
        if (num1>num2) {
            System.out.println("El primer número es mayor que el segundo.");
        } else { System.out.println("El segundo número es mayor que el primero."); }

    }

}
