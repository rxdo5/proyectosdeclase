package ejerciciostema4;

public class Ejercicio45 {

    public static void mostrarNumeros(){

        for (int i=1;i<=100;i++){
            System.out.print(i%5==0 ? i+"\n" : i+" ");
        }
    }

    public static void main(String[] args) {
        mostrarNumeros();
    }

}
