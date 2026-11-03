package ejerciciosextra;

import java.util.Scanner;

public class Cifras {

    public static void cifras(){

        int i;
        int incrementado;

        Scanner sc = new Scanner(System.in);

        do {
            i = sc.nextInt();

            if(i!=0) {

                incrementado = i + 1;

                while (incrementado > 0 && incrementado % 10 == 0) {
                    incrementado = incrementado / 10;
                }

                if (incrementado == 1) {
                    System.out.println("MENSAJE");
                } else {
                    System.out.println(i + 1);
                }

            }

        } while (i != 0);


        // ESTO HACE QUE MUESTRE MENSAJE CON CADA ÚLTIMO NÚMERO DE LA DECENA (09, 19, 29, etc.)
        /* do {
            i=sc.nextInt();

            if ((i+1)%10<1&&i!=0){
                System.out.println("MENSAJE");
            } else {
                System.out.println(i+1);
            }

        } while (i!=0); */

    }

    public static void main(String[] args) {
        cifras();
    }

}
