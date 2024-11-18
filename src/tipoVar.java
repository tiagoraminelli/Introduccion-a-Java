public class tipoVar {
    public static void main(String[] args) {
        System.out.println("Vamos a trabajar con el uso de VAR en JAVA");
        //sin var
        String $nombre = "juan";
        System.out.println("$nombre = " + $nombre);
        var nombre = "carlos";
        System.out.println("nombre = " + nombre);
        //Definir otras variables usando VAR
        var $edad = 23;
        System.out.println("$edad = " + $edad);
        var $sueldo = 2334.623F;
        System.out.println("$sueldo = " + $sueldo);
        var $esCasado = false;
        $esCasado = true;
        // $esCasado = "no"; tiene q tener el mismo valor y tipo de dato
        System.out.println("$esCasado = " + $esCasado);
    }
} //fin de la clase
