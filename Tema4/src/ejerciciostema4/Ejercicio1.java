package ejerciciostema4;
import java.util.Scanner;

public class Ejercicio1 {

    public static void sonIguales(int num1,int num2){
        if (num1==num2) {
            System.out.println("Los números son iguales");
        } else { System.out.println("No son iguales."); }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Introduce el primer número: ");
        int num1=sc.nextInt();
        System.out.println("Introduce el segundo número: ");
        int num2=sc.nextInt();

        Ejercicio1.sonIguales(num1,num2);
    }

}
