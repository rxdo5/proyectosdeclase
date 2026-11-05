package ejerciciostema4;

import java.util.Scanner;

public class Ejercicio37 {

    public static void mostrarEdades() {

        Scanner sc=new Scanner(System.in);

        double suma=0.0;
        int mayor=0;
        int menor=200;

        System.out.println("Cuantas edades vas a introducir: ");
        int cantidad=sc.nextInt();

        for (int i=cantidad;i>0;i--){
            System.out.println("Introduce la edad número "+i+":");
            int edad= sc.nextInt();
            suma=suma+edad;

            if (edad>mayor){
                mayor=edad;
            }

            if (edad<menor){
                menor=edad;
            }

        }

        System.out.println("La media es: "+suma/cantidad);
        System.out.println("El mayor es: "+mayor);
        System.out.println("El menor es: "+menor);

    }

    public static void main(String[] args) {
        mostrarEdades();
    }

}
