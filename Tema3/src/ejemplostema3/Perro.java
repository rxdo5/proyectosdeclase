package ejemplostema3;

public class Perro {
    public String nombre,raza,color;
    public int edad;

    public void asignarValores(String nombre, String raza, String color, int edad) {
        this.nombre=nombre;
        this.raza=raza;
        this.color=color;
        this.edad=edad;
    }

    public void ladrar() {
        System.out.println("Guau, guau");
    }

    public void comer() {
        System.out.println("Ñam, ñam");
    }

    public void dormir() {
        System.out.println("Zzzzzzzzzzzzz...");
    }

    public void mostrar() {
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Raza: "+this.raza);
        System.out.println("Color: "+this.color);
        System.out.println("Edad: "+this.edad);
    }

}
