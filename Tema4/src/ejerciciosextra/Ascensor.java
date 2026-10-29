package ejerciciosextra;

import java.util.Scanner;

public class Ascensor {

    public static int ascensor(){

        int piso;
        int destino=0;
        int distancia=0;
        Scanner sc=new Scanner(System.in);

        //int numPisos=sc.nextInt();

        for (int i=sc.nextInt();i>0;i--){ // i = numPisos, termina cuando se acaban
            piso=sc.nextInt();
            destino=(Math.abs(destino-piso)); // destino=0 = |0-5|; destino=5 = destino |5-1|; destino=1 = destino |1-10|; destino=10 = destino |10-4|; destino=4 = destino |4-2|.
            distancia=distancia+destino; // +5 +4 +9 +6 +2;
            destino=piso; // LLEGA AL DESTINO
        }

        return distancia;

        // FORMA ANTIGUA, MAL, PUES SABEMOS EL NÚMERO DE REPETICIONES, ERA PARA ENTENDER LA LÓGICA
        /*while (numPisos!=0){ // 5; 5 1 10 4 2 = 26 // 2; 1 10 = 10
            piso=sc.nextInt();
            destino=(Math.abs(destino-piso)); // destino=0 = |0-5|; destino=5 = destino |5-1|; destino=1 = destino |1-10|; etc.
            distancia=distancia+destino; // +5 +4
            destino=piso; // LLEGA AL DESTINO
            numPisos--;
        }*/

    }

    public static void main(String[] args) {
        System.out.println(ascensor());
    }

}
