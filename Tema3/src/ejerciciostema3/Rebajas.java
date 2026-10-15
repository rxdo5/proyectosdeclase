package ejerciciostema3;
import java.util.Scanner;

public class Rebajas {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Rebajas rebaja=new Rebajas();

        System.out.println("Introduce el valor original del producto:");
        double originalPrice=sc.nextDouble();
        sc.nextLine();


        System.out.println("Introduce el valor original del producto:");
        double discountedPrice=sc.nextDouble();
        sc.nextLine();

        rebaja.calcularPorcentaje(originalPrice,discountedPrice);

    }

    public void calcularPorcentaje(double originalPrice, double discountedPrice){
        double resultado=(originalPrice-discountedPrice)*100/originalPrice;
        System.out.printf("El porcentaje es %1.2f",resultado);
        System.out.print("%");
    }

}
