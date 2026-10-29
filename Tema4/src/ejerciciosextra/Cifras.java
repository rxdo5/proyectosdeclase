package ejerciciosextra;

import java.util.Scanner;

public class Cifras {

    public static void cifras(){

        int i=0;

        Scanner sc=new Scanner(System.in);

        do {
            i=sc.nextInt();

            if ((i+1)%10>1){
                System.out.println("MENSAJE");
            } else {
                System.out.println(i+1);
            }

        } while (i!=0);

    }

}
