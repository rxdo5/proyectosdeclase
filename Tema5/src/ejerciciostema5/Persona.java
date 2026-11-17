package ejerciciostema5;

public class Persona {

    private String nombre;
    private int edad;

    public Persona(){
    }

    public Persona(String nombre,int edad){
        this.nombre=nombre;
        this.edad=edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

    public static void main(String[] args) {

        //Persona ana=new Persona("Ana",25);
        //System.out.println(ana);

        Persona ana=new Persona();

        ana.setNombre("Ana");
        ana.setEdad(25);

        System.out.println("\nGETTERS:\n"+ana.getNombre()+", "+ana.getEdad()+" años");
        System.out.println("\nTO STRING:\n"+ana);

    }

}
