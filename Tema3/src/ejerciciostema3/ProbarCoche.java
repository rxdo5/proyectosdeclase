package ejerciciostema3;
import java.util.Scanner;

public class ProbarCoche {

    public static void main(String[] args) {

        String modelo,color,matricula;
        boolean metalizado;

        Scanner sc=new Scanner(System.in);
        Coche miCoche = new Coche();

        System.out.println("Introduzca el modelo:");
        modelo=sc.nextLine();
        System.out.println("Introduzca el color:");
        color=sc.nextLine();
        System.out.println("Introduzca si es metalizado (true/false):");
        metalizado=sc.nextBoolean();
        sc.nextLine(); // LIMPIAR BUFFER
        System.out.println("Introduzca la matricula (En mayúscula):");
        matricula=sc.nextLine();
        System.out.println("Introduzca el tipo (MINI, UTILITARIO, FAMILIAR o DEPORTIVO):");
        System.out.println(Coche.tipo.DEPORTIVO);

        miCoche.setCoche(modelo,color,matricula,metalizado,Coche.tipo.DEPORTIVO);
        System.out.println(miCoche.fichaCoche());

        sc.close();

    }
}
