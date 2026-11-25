package ejerciciostema5;

public class InstalacionElectrica {

    public static void main(String[] args) {

        AparatoElectrico Bombilla=new AparatoElectrico("Bombilla",100);
        AparatoElectrico Radiador=new AparatoElectrico("Radiador",2000);
        AparatoElectrico Plancha=new AparatoElectrico("Plancha",1200);

        System.out.println(AparatoElectrico.getTotalOutput());

        Bombilla.setEstado(true);
        Plancha.setEstado(true);

        System.out.println(AparatoElectrico.getTotalOutput());

        Plancha.setEstado(false);
        Radiador.setEstado(true);

        System.out.println(AparatoElectrico.getTotalOutput());

    }

}
