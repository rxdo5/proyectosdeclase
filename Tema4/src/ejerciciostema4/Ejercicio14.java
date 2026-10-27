package ejerciciostema4;

public class Ejercicio14 {

    public static void mostrarWhile(){
        int i=-1;

        while(i<100){
            i++;
            System.out.println(i);
        }
    }

    public static void mostrarDoWhile(){
        int i=-1;

        do{
            i++;
            System.out.println(i);
        }while (i<100);
    }

    public static void mostrarFor(){

        for (int i=0;i<=100;i++){
            System.out.println(i);
        }

    }

    public static void main(String[] args) {
        mostrarWhile();
        mostrarDoWhile();
        mostrarFor();
    }

}
