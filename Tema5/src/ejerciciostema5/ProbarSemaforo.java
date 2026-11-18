package ejerciciostema5;

public class ProbarSemaforo {

    public static void toText(byte color){

        if(color==0){
            System.out.println("Rojo");
        } else if (color==1) {
            System.out.println("Verde");
        } else if (color==2) {
            System.out.println("Ámbar");
        }

    }

    public static void main(String[] args) {

        Semaforo semaforo=new Semaforo();

        semaforo.setColor((byte)0);

        toText(semaforo.getColor());
        semaforo.cambiar();

        toText(semaforo.getColor());
        semaforo.cambiar();

        toText(semaforo.getColor());
        semaforo.cambiar();

        toText(semaforo.getColor());
        semaforo.cambiar();

        toText(semaforo.getColor());
        semaforo.cambiar();

        toText(semaforo.getColor());
        semaforo.cambiar();

    }

}
