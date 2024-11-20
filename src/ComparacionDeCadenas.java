public class ComparacionDeCadenas {
    public static void main(String[] args) {
        //comparar cadenas
        var $cadena1 = "java";
        var $cadena2 = "java";
        var $cadena3 = new String("java");
        System.out.println("$cadena1 = " + $cadena1);
        System.out.println("$cadena2 = " + $cadena2);
        //comparar cadenas == comparar si apuntan al mismo objeto
        System.out.print("la cadena 1 es igual en referencia a cadena 2: ");
        System.out.println($cadena1 == $cadena2);
        System.out.print("la cadena 1 es igual en referencia a cadena 3: ");
        System.out.println($cadena1 == $cadena3);

        //comparar el contenido usaremos el metodo equals
        System.out.print("cadena1 es igual en contenido a cadena3?: ");
        System.out.println($cadena1.equals($cadena3));

    }
}
