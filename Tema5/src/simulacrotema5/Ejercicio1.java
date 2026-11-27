package simulacrotema5;

public class Ejercicio1 {

    public static void main(String[] args) {

        int i;
        int sumaMultiplos3=0;
        int otrosNumeros=0;

        for(i=1;i<=30;i++){

            if (i%3==0&&i%5==0){
                System.out.println("Múltiplo de ambos.");
            } else if (i%3==0){
                sumaMultiplos3++;
            } else otrosNumeros++;

        }

        System.out.println(sumaMultiplos3+","+otrosNumeros);

    }

}
