package ejerciciostema3;

public class Coche {

    String modelo,color,matricula;
    enum Tipo {Mini,Utilitario,Familiar,Deportivo}
    boolean metalizado;

    public String imprimirCoche(){
        return modelo+","+color+","+metalizado+","+matricula+","+Tipo.Deportivo+".";
    }

    public String fichaCoche(){
        return "----------------------------\nMatrícula: "+matricula+"\t\tModelo: "+modelo+"\nColor: "+color+"\t\t\tMetalizado?: "+metalizado+"\nTipo de coche: "+Tipo.Deportivo+"\n----------------------------";
    }

    public void setCoche(String modelo,String color,String matricula,boolean metalizado,Tipo tipo){
        this.modelo=modelo;
        this.color=color;
        this.matricula=matricula;
        this.metalizado=metalizado;
    }

}
