package ejerciciostema4;
import java.util.Scanner;

public class Ejercicio7 {

    public static int contarCifras(int num1) {
        
    int cifras = 0;
        
    if (num1<999&&num1>=0){

        if(num1<10){
            cifras=1;
        } else if (num1<100){
            cifras=2;
        } else {
            cifras=3;
        }
    } else {
        System.out.println("El número no es válido.");
        System.exit(0);
    }
    
    return cifras;
    
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Introduce el primer número (1-999): ");
        int num1=sc.nextInt();

        System.out.println(Ejercicio7.contarCifras(num1));
    }

}
