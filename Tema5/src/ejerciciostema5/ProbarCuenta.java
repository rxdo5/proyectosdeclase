package ejerciciostema5;

public class ProbarCuenta {

    public static void main(String[] args) {

        Cuenta cuenta=new Cuenta("Enrique Pastor");

        System.out.println(cuenta);
        cuenta.ingresar(100);
        System.out.println(cuenta);
        cuenta.retirar(50.50);
        System.out.println(cuenta);

    }

}
