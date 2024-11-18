public class Cadenas {
    public static void main(String[] args) {
        System.out.println("Manejo de Cadenas en Java");
        var $cadena1 = "hola";
        System.out.println("$cadena1 = " + $cadena1);
        var $cadena2 = new String("mundo");
        System.out.println("$cadena2 = " + $cadena2);
        var $cadena3 = $cadena1 + " " + $cadena2;
        System.out.println("$cadena3 = " + $cadena3);
        //cadena multi linea
        var $cadena4 = """
                Esta es una cadena
                multilinea que 
                deberas ver en consola
                """;
        //LOS INDICES DE LA CADENA
        //empiezan desde el indice 0 y termina en el n-1, siendo N el largo de la cadena

    }

} //fin de la clase
