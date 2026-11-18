package ejerciciostema5;

public class ProbarTemperatura {

    public static void main(String[] args) {

        Termometro term=new Termometro();

        System.out.println(term);

        term.setTemperatura(-500);

        System.out.println(term);

        term.setTemperatura(36.5);

        System.out.println(term);

    }

}
