package ejerciciostema4;

public class Ejercicio42 {

    public static void dibujarTriangulo(int numero) {

        if (numero<=15&&numero>=3){

            for (int i=0;i<numero;i++){

                int rep=i;

                while(rep>0){
                    System.out.print("*");
                    rep--;
                }

                System.out.println();

            }

        }

    }

    public static void main(String[] args) {
        dibujarTriangulo(4);
    }

}
