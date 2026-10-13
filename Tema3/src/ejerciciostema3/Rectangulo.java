package ejerciciostema3;

public class Rectangulo {
    double ancho,alto;

    public static void main(String[] args) {
        Rectangulo uno=new Rectangulo();
        Rectangulo dos=new Rectangulo();

        uno.asignarValores(4,4);
        dos.asignarValores(5,8);

        System.out.println(uno.calcularArea());
        System.out.println(uno.calcularPerimetro());
        System.out.println(uno.esCuadrado());

        System.out.println("-------------------------");

        System.out.println(dos.calcularArea());
        System.out.println(dos.calcularPerimetro());
        System.out.println(dos.esCuadrado());

    }

    public void asignarValores(double ancho, double alto){
        this.ancho=ancho;
        this.alto=alto;
    }

    public double calcularArea(){
        return this.ancho*this.alto;
    }

    public double calcularPerimetro(){
        return 2*(ancho+alto);
    }

    public boolean esCuadrado(){
        return this.ancho==this.alto;
    }


}
