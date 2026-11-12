package ejerciciostema4;

import java.util.Scanner;

public class Ejercicio54 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        Coche coche = new Coche();

        boolean salir=false;
        int option;

        while(!salir) {
            System.out.println("#===== MENÚ DE OPERACIONES =====#");
            System.out.println("*");
            System.out.println("*\t\t1. CREAR COCHE");
            System.out.println("*\t\t2. CAMBIAR COLOR");
            System.out.println("*\t\t3. MOSTRAR DATOS");
            System.out.println("*\t\t4. SALIR");
            System.out.println("*");
            System.out.println("*********************************");

            option=sc.nextInt();

            switch(option) {
                case 1:

                    System.out.println("Introduzca el modelo del coche: ");
                    sc.nextLine();
                    String modelo = sc.next();
                    System.out.println("Introduzca el color del coche: ");
                    String color = sc.next();
                    System.out.println("Introduzca si es metalizado (true/false):");
                    boolean metalizado = sc.nextBoolean();
                    sc.nextLine(); // LIMPIAR BUFFER
                    System.out.println("Introduzca matricula: ");
                    String matricula = sc.next();
                    System.out.println("Introduzca el tipo (MINI, UTILITARIO, FAMILIAR o DEPORTIVO):");
                    String tipoCoche = sc.next();
                    Coche.Tipo tipo = Coche.Tipo.valueOf(tipoCoche);

                    coche.setCoche(modelo, color, matricula, metalizado, tipo);
                    break;

                case 2:
                    System.out.println("Introduzca el nuevo color: ");
                    coche.color=sc.nextLine();
                    break;

                case 3:
                    System.out.println(coche.fichaCoche());
                    break;

                case 4:
                    salir=true;
                    break;

                default:
                    System.out.println("DEBE INTRODUCIR UNA OPCIÓN VALIDA");
            }

        }

    }

}
