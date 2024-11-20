import java.util.Locale;

public class MetodosDeCadena {
    public static void main(String[] args) {
        //Metodos de cadenas
        var $cadena1 = "hola mundo";
        System.out.println("$cadena1 = " + $cadena1);
        //obtener el largo de una cadena
        var $longitud = $cadena1.length();
        System.out.println("$longitud = " + $longitud);
        
        //reemplazar caracteres
        var $nuevaCadena = $cadena1.replace('o','a');
        System.out.println("$nuevaCadena = " + $nuevaCadena);
        
        //convertir a Mayusculas
        var $mayusculas = $cadena1.toUpperCase();
        System.out.println("$mayusculas = " + $mayusculas);

        //convertir a Minusculas
        System.out.println("Minusculas = " + $cadena1.toLowerCase());

        //eliminar espacios al inicio y final de una cadena
        var $cadena2 = " hola mundo ";
        System.out.println("$cadena2 = " + $cadena2);
        System.out.println("cadena sin espacios: " + $cadena2.trim());


    }
}
