package ejerciciostema4;
import java.util.Scanner;

public class Ejercicio3 {

    public static void esMultiplo(int num1, int num2){
        if (num1%num2==0) {
            System.out.println("Los números son multiplos.");
        } else { System.out.println("Los números no son multiplos."); }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Introduce el primer número: ");
        int num1=sc.nextInt();
        System.out.println("Introduce el segundo número: ");
        int num2=sc.nextInt();

        Ejercicio3.esMultiplo(num1,num2);
    }

}
