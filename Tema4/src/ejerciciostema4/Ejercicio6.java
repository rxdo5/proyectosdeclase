package ejerciciostema4;
import java.util.Scanner;

public class Ejercicio6 {

    public static void ordenarMayor(int num1, int num2) {
        if (num1>num2) {
            System.out.println(num1+", "+num2);
        } else if (num2>num1) {
            System.out.println(num2+", "+num1);
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Introduce el primer número: ");
        int num1=sc.nextInt();
        System.out.println("Introduce el segundo número: ");
        int num2=sc.nextInt();

        Ejercicio6.ordenarMayor(num1,num2);
    }

}
