
package ejerciciostema4;

import java.math.BigInteger;
import java.util.Scanner;

public class Ejercicio50 {

    public static void apocaliptico(int num) {

        // HE TENIDO QUE COMENTAR ESTO Y REHACERLO CON BigInteger
        // CON AYUDA DE IA YA QUE EL PRIMER NÚMERO QUE CUMPLE
        // LOS REQUISITOS NO CABE EN UN LONG.
        // TODA LA DEMAS LÓGICA DEL PROGRAMA ESTA HECHA POR MI.

        long dosN = 1;
        int si = 0;
        boolean flag = false;

        for (int i = 0; i < num; i++) {
            dosN = 2 * dosN;
        }

        do {

            int last = (int)(dosN % 10);
            dosN = dosN / 10;

            if (last == 6) {
                ++si;
            } else {
                si = 0;
            }

            if (si == 3) {
                System.out.println(num + " es un número apocalíptico.");
                flag = true;
            }

        } while (si < 3 && dosN > 0);

        if (!flag) {
            System.out.println(num + " no es un número apocalíptico.");
        }
    }

    public static void probarApocaliptico(int num) {

        BigInteger dosN = BigInteger.ONE;
        int si = 0;
        boolean flag = false;

        for (int i = 0; i < num; i++) {
            dosN = dosN.multiply(BigInteger.TWO);
        }

        do {

            int last = dosN.remainder(BigInteger.TEN).intValue();
            dosN = dosN.divide(BigInteger.TEN);

            if (last == 6) {
                ++si;
            } else {
                si = 0;
            }

            if (si == 3) {
                System.out.println(num + " es un número apocalíptico.");
                flag = true;
            }

        } while (si < 3 && dosN.compareTo(BigInteger.ZERO) > 0);

        if (!flag) {
            System.out.println(num + " no es un número apocalíptico.");
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el número a comprobar (Long):");
        apocaliptico(sc.nextInt());

        //System.out.println("Introduzca el número a comprobar (BigInt):");
        //probarApocaliptico(sc.nextInt());

    }

}