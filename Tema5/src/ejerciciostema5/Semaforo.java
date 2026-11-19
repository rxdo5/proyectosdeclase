package ejerciciostema5;

public class Semaforo {

    private byte color;

    //0=rojo, 1=verde, 2=amarillo

    public Semaforo(){
        color=1;
    }

    public Semaforo(byte color){
        setColor(color);
    }

    public void setColor(byte color) {
        if(color>=0&&color<=2){
            this.color = color;
        }
    }

    public byte getColor() {
        return color;
    }

    public boolean esRojo(){
        return color==0;
    }

    public boolean esVerde(){
        return color==1;
    }

    public boolean esAmarillo(){
        return color==2;
    }

    public void cambiar(){
        if(color==2){
            color=0;
        } else ++color;
    }

    @Override
    public String toString() {
        return "Semaforo{" +
                "color=" + color +
                '}';
    }
}
