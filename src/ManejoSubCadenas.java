public class ManejoSubCadenas {
    public static void main(String[] args) {
        //tema de subcadenas
        var $cadena = "hola mundo";
        System.out.println("$cadena = " + $cadena);
        //subcadena
        var $subcadena1 = $cadena.substring(0,4); //el ultimo no se incluyem importante
        System.out.println("$subcadena1 = " + $subcadena1);
        var $subcadena2 = $cadena.substring(5,10);
        System.out.println("$subcadena2 = " + $subcadena2);
        // Busqueda de subcadenas
        // indexOf - devuelve el indice de la primera aparicion de la sub cadena
        var $indice = $cadena.indexOf("hola");
        System.out.println("$indice = " + $indice);
        //lastIndexOf - devuelve el indice de la ultima aparicion de la sub cadena
        var $indice2 = $cadena.lastIndexOf("mundo");
        System.out.println("$indice2 = " + $indice2);
        //subcadena no encontrada: -1
        var $cadena3 = $cadena.lastIndexOf("Java");
        System.out.println("$cadena3 = " + $cadena3);
        
        //reemplazar subcadenas en java
        //reemplazar "mundo" por "a todos"
        var $nuevaCadena = $cadena.replace("mundo","a todos");
        System.out.println("$nuevaCadena = " + $nuevaCadena);
        $nuevaCadena = $cadena.replace("hola","Saludos");
        System.out.println("$nuevaCadena = " + $nuevaCadena);

    }
}
