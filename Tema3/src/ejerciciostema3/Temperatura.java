package ejerciciostema3;

public class Temperatura {

    public static void main(String[] args){

        Temperatura temp=new Temperatura();

        System.out.println(temp.farenheitToCelsius(100));
        System.out.println(temp.celsiusToFarenheit(100));

    }

    public double celsiusToFarenheit (double celsius) {
        return (celsius*1.8) + 32;
    }

    public double farenheitToCelsius (double farenheit) {
        return (farenheit - 32)/1.8;
    }


} //kaowaffdfxxxds
