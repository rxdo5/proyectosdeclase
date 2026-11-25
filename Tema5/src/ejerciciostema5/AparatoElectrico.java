package ejerciciostema5;

public class AparatoElectrico {

    private String nombre;
    private int potencia;
    private boolean estado;

    private static int totalOutput;

    public AparatoElectrico(){
    }

    public AparatoElectrico(String nombre,int potencia){ // SIEMPRE ESTAN APAGADOS AL CREARSE
        this.nombre=nombre;
        this.potencia=potencia;
        this.estado=false;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPotencia() {
        return potencia;
    }

    public boolean isEstado() {
        return estado;
    }

    public int getTotalOutput() {
        return AparatoElectrico.totalOutput;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void setEstado(boolean estado) {

        if (estado){
            this.estado = estado;
            setTotalOutput(totalOutput+potencia);
        } else {
            this.estado = estado;
            setTotalOutput(totalOutput-potencia);
        }

    }

    public void setTotalOutput(int totalOutput) {
        AparatoElectrico.totalOutput = totalOutput;
    }

    public void encender(){
        setEstado(true);
    }

    public void apagar(){
        setEstado(false);
    }

    @Override
    public String toString() {
        return "AparatoElectrico{" +
                "nombre='" + nombre + '\'' +
                ", potencia=" + potencia +
                ", estado=" + estado +
                ", totalOutput=" + totalOutput +
                '}';
    }

    public static void main(String[] args) {

        AparatoElectrico Bombilla=new AparatoElectrico("Bombilla",100);
        AparatoElectrico Radiador=new AparatoElectrico("Radiador",2000);
        AparatoElectrico Plancha=new AparatoElectrico("Plancha",1200);

        System.out.println(totalOutput);

        Bombilla.setEstado(true);
        Plancha.setEstado(true);

        System.out.println(totalOutput);

        Plancha.setEstado(false);
        Radiador.setEstado(true);

        System.out.println(totalOutput);

        System.out.println(Bombilla.toString());

        System.out.println(totalOutput);

    }

}
