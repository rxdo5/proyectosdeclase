
package ejerciciostema4;

import java.util.Scanner;

public class Ejercicio40 {

    public static void dibujarCuadrado(int base, int altura) {

        for (int i = altura; i > 0; i--) {

            for (int j = base; j > 0; j--) {
                System.out.print("*");
            }

            System.out.print("\n");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer número:");
        int num1 = sc.nextInt();

        System.out.println("Introduce el segundo número:");
        int num2 = sc.nextInt();

        int base = (num1 > num2) ? num1 : num2;
        int altura = (num1 < num2) ? num1 : num2;

        dibujarCuadrado(base, altura);
    }
}
