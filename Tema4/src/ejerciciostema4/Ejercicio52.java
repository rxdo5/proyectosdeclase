package ejerciciostema4;

import java.util.Scanner;

public class Ejercicio52 {

    public static void digitos(int num) {

        int suma=0;

        do{

            int last=num%10;
            num=num/10;
            suma=suma+last;

            System.out.print("DÍGITO "+last+" · ");

        }while(num>0);

        System.out.print("RESULTADO "+suma);

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Introduzca el numero:");
        digitos(sc.nextInt());

    }

}
