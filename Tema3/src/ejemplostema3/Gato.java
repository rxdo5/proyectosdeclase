package ejemplostema3;

public class Gato {
    public String nombre,raza;
    public int vidas;

    public void asignarValores(String nombre, String raza, int vidas) {
        this.nombre=nombre;
        this.raza=raza;
        this.vidas=vidas;
    }

    public void maullar() {
        System.out.println("Miau, miau");
    }

    public void mostrar() {
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Raza: "+this.raza);
        System.out.println("Edad: "+this.vidas);
    }

}
