package ejerciciostema5;

public class Punto {

    private byte cordX;
    private byte cordY;

    public Punto(){
        cordX=0;
        cordY=0;
    }

    public Punto(byte cordX, byte cordY){
        setCordX(cordX);
        setCordY(cordY);
    }

    public byte getCordX() {
        return cordX;
    }

    public byte getCordY() {
        return cordY;
    }

    public void setCordX(byte cordX) {
        this.cordX = cordX;
    }

    public void setCordY(byte cordY) {
        this.cordY = cordY;
    }

    public void setPosicion(byte cordX,byte cordY){
        setCordX(cordX);
        setCordY(cordY);
    }

    public void mover(byte cordX,byte cordY){
        this.cordX=(byte)(this.cordX+cordX);
        this.cordY=(byte)(this.cordY+cordY);
    }

    public void copiar(Punto copia){

        copia.setCordX(cordX);
        copia.setCordY(cordY);

    }

    @Override
    public String toString() {
        return "Punto{" +
                "cordX=" + cordX +
                ", cordY=" + cordY +
                '}';
    }

}
