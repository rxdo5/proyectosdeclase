package ejerciciostema4;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Introduce el primer número: ");
        int num1=sc.nextInt();

        Ejercicio2.esPositivo(num1);


    }

    public static void esPositivo(int num1){
        if (num1>=0) {
            System.out.println("El número es positivo.");
        } else { System.out.println("El número es negativo."); }
        
    }

}
