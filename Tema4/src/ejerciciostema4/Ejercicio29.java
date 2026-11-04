package ejerciciostema4;

public class Ejercicio29 {

    public static void productoImpares() {

        int multiplicacion =1;

        for (int i=1;i<=10;i++){
            if (i%2!=0){
                System.out.print(i+" * ");
                multiplicacion = multiplicacion*i;
            }
        }

        System.out.println("\nTOTAL: "+multiplicacion);

    }

    public static void main(String[] args) {
        productoImpares();
    }

}
