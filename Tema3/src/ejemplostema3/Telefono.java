package ejemplostema3;

public class Telefono {
    public String marca;
    public int bateria,minutos;

    public static void main(String[] args){
        Telefono miTelefono=new Telefono();
        miTelefono.asignarMarca("Nokia");
        miTelefono.asignarBateria(50);
        System.out.println(miTelefono.llamar());
        miTelefono.cargar(30);
        System.out.println(miTelefono.llamar());
    }

    public void asignarMarca(String marca){
        this.marca=marca;
    }

    public void asignarBateria(int bateria){
        this.bateria=bateria;
    }

    public String llamar(){
        return "LLamando... (batería al "+bateria+"%)";
    }

    public void cargar(int minutos){
        this.minutos=minutos;
        asignarBateria(this.bateria+this.minutos);
    }

}
