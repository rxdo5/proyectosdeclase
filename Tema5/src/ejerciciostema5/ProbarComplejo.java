package ejerciciostema5;

public class ProbarComplejo {

    public static void main(String[] args) {

        Complejo miComplejo=new Complejo(5,5);
        Complejo otroComplejo=new Complejo(10,10);

        System.out.println(miComplejo);

        miComplejo.sumar(otroComplejo);
        System.out.println(miComplejo);

    }

}
