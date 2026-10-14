package ejerciciostema3;
import java.util.Scanner;

public class Coche {

    String modelo,color,matricula;
    enum tipo{MINI,UTILITARIO,FAMILIAR,DEPORTIVO};
    boolean metalizado;

    public String imprimirCoche(){
        return modelo+","+color+","+metalizado+","+matricula+","+tipo.DEPORTIVO+".";
    }

    public String fichaCoche(){
        return "----------------------------\nMatrícula: "+matricula+"\t\tModelo: "+modelo+"\nColor: "+color+"\t\t\tMetalizado?: "+metalizado+"\nTipo de coche: "+tipo.DEPORTIVO+"\n----------------------------";
    }

    public void setCoche(String modelo,String color,String matricula,boolean metalizado,Enum tipo){
        this.modelo=modelo;
        this.color=color;
        this.matricula=matricula;
        this.metalizado=metalizado;
    }

}
