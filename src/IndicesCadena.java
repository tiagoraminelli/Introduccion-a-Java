public class IndicesCadena {
    public static void main(String[] args) {
        //Manejo de indices en una cadena
        var $cadena1 = "hola mundo";
        
        //recuperar el primer caracter de la cadena que hemos definido
        var $primerCaracter = $cadena1.charAt(0); //recupera el caracter de H
        System.out.println("$primerCaracter = " + $primerCaracter);
        var $ultimoCaracter = $cadena1.charAt(9);
        System.out.println("$ultimoCaracter = " + $ultimoCaracter);
        var $caracterRandon = $cadena1.charAt(5);
        System.out.println("$caracterRandon = " + $caracterRandon);
    }
}
