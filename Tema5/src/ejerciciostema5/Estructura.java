package ejerciciostema5;

public class Estructura {

    private int n;

    public Estructura(){
        n=1; //??
    }

    public Estructura(int n){
        this.n=n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n=n;
    }

    @Override
    public String toString() {
        return "Estructura{" +
                "n=" + n +
                '}';
    }

    public static void main(String[] args) {
        Estructura miEstructura=new Estructura(2);
        System.out.println(miEstructura);
    }

}
