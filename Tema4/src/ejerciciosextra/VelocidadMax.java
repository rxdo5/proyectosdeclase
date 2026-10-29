package ejerciciosextra;

import java.util.Scanner;

public class VelocidadMax {

    public static int velocidadMax(){

        int velocidadMax=0;

        Scanner sc=new Scanner(System.in);

        for (int i=sc.nextInt();i>0;i--){ // i = numero de inputs
            int velocidad=sc.nextInt();

            if (velocidad>velocidadMax){
                velocidadMax=velocidad;
            }

        }

        return velocidadMax;

    }

    public static void main(String[] args) {
        System.out.println(velocidadMax());
    }

}
