package ejerciciostema4;

import java.util.Scanner;

public class Ejercicio41 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int valor=sc.nextInt();

        if (valor<15&&valor>0){

            for (int i=valor;i>0;i--){

                int rep=i;

                while(rep>0){
                    System.out.print("*");
                    rep--;
                }

                System.out.println();

            }

        }

    }

}
