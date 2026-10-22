package ejerciciostema4;
import java.util.Scanner;

public class Ejercicio10 {

    public static void mostrarNotaIf(int nota){

        if(nota>0&&nota<10) {

            if (nota<5){
                System.out.println("Suspenso.");
            } else if (nota<6){
                System.out.println("Suficiente.");
            } else if(nota<7) {
                System.out.println("Bien.");
            } else if(nota<9) {
                System.out.println("Notable");
            } else {
                System.out.println("Sobresaliente.");
            }

        } else {
            System.out.println("Nota no válida.");
        }

    }

    public static void mostrarNotaSwitch(int nota){

        switch (nota){
            case 1,2,3,4:
                System.out.println("Suspenso.");
                break;
            case 5:
                System.out.println("Suficiente.");
                break;
            case 6:
                System.out.println("Bien.");
                break;
            case 7,8:
                System.out.println("Notable.");
                break;
            case 9,10:
                System.out.println("Sobresaliente");
                break;
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Probar if");
        int notaIf= sc.nextInt();
        mostrarNotaIf(notaIf);


        System.out.println("Probar switch");
        int notaSwitch= sc.nextInt();
        mostrarNotaSwitch(notaSwitch);

    }

}
