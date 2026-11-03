
package ejerciciostema4;

import java.util.Scanner;

public class Ejercicio23 {

    public static void sumaSiguientes100() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un número:");
        int num = sc.nextInt();

        int suma = 0;

        for (int i = num + 1; i <= num + 100; i++) {
            suma = suma + i;
        }

        System.out.println(suma);
    }

    public static void main(String[] args) {
        sumaSiguientes100();
    }
}
