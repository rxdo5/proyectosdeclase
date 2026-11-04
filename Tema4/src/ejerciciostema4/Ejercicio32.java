package ejerciciostema4;

public class Ejercicio32 {

    public static void mostrarNPares(int num) {

        int j=1;
        int suma=0;

        while(num!=0){

            if ((j%2)==0){
                suma=suma+j;
                num--;
            }

            j++;

        }

        System.out.println(suma);

    }

    public static void main(String[] args) {
        mostrarNPares(5);
    }

}
