public class Inmutabilidad {
    public static void main(String[] args) {
        //inmutabilidad de cadenas
        var $cadena1 = "hola";
        System.out.println("$cadena1 = " + $cadena1);
        var $cadena2 = $cadena1;
        System.out.println("$cadena2 = " + $cadena2);
        $cadena1 = "adios";
        System.out.println("$cadena1 = " + $cadena1);
        
        
    }
}
