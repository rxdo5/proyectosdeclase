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

    public static int getTotalOutput() {
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

}
