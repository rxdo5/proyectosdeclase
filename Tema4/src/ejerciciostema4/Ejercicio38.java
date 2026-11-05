package ejerciciostema4;

public class Ejercicio38 {

    public static void mostrarTodasTablas() {

        for (int i=1;i<=10;i++){

            System.out.println("=== TABLA DE MULTIPLICAR DEL "+i+" ===");

            for(int j=1;j<=10;j++){
                System.out.println(i+" x "+j+" = "+i*j);
            }

        }

    }

    public static void main(String[] args) {
        mostrarTodasTablas();
    }

}