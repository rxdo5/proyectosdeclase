package ejerciciostema4;

import java.util.Scanner;

public class Ejercicio30 {

    public static void mostrarNegativos() {

        Scanner sc=new Scanner(System.in);

        int output=0;

        for (int i=1;i<=10;i++){
            System.out.println("Ingrese número "+i+" de 10:");
            int j= sc.nextInt();

            if (j<0){
                ++output;
            }

        }

        System.out.println("-------------------------------------------------------");
        System.out.println("Cantidad de números negativos introducidos: "+output);

    }

    public static void main(String[] args) {
        mostrarNegativos();
    }

}
