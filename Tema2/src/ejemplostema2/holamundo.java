package ejemplostema2;

public class holamundo {

    public static void main(String[] args) {

        System.out.println("Hola mundo");

        // a continuación una explicación de todos los tipos
        byte b = 10;                 // 1 byte, números pequeños
        short s = 2000;              // 2 bytes, números pequeños/medianos
        int entero = 42;             // 4 bytes, entero estándar
        long largo = 123456789L;     // 8 bytes, enteros grandes
        float decimalPequeno = 3.5f; // 4 bytes, decimales con menos precisión
        double decimal = 3.14159;    // 8 bytes, decimales estándar
        char caracter = 'A';         // 2 bytes, un solo carácter
        boolean verdadero = true;    // 1 bit lógico, true/false
        String texto = "Java";      // cadena de texto

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + entero);
        System.out.println("long: " + largo);
        System.out.println("float: " + decimalPequeno);
        System.out.println("double: " + decimal);
        System.out.println("char: " + caracter);
        System.out.println("boolean: " + verdadero);
        System.out.println("String: " + texto);

    }

}
