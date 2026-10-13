package ejerciciostema3;

public class Videojuego {
    String titulo;
    int horasJugadas;

    public static void main(String[] args) {
        Videojuego tetris=new Videojuego();

        tetris.asignarValores("Tetris",10);
        System.out.println(tetris.mostrar());

        tetris.jugar(5);
        System.out.println(tetris.mostrar());
    }

    public void asignarValores(String titulo,int horasJugadas){
        this.titulo=titulo;
        this.horasJugadas=horasJugadas;
    }

    public void jugar(int horas){
        this.horasJugadas+=horas;
    }

    public String mostrar(){
        return titulo+" - "+horasJugadas+" horas jugadas.";
    }
}
