public class CaracteresEspeciales {
    public static void main(String[] args) {
        //caracteres especiales \m
        var cadena1 = "Hola \n Mundo";
        System.out.println("cadena1 = " + cadena1);
        //caracteres especiales \t tabulacion
        var cadena2 = "\thola\tmundo";
        System.out.println("cadena2 = " + cadena2);

        //caracteres especiales \' comilla simple
        var cadena3 = "\'hola\' mundo";
        System.out.println("cadena3 = " + cadena3);

        //caracteres especiales \" comilla doble
        var cadena4 = "\"hola\" mundo";
        System.out.println("cadena4 = " + cadena4);
    }
}
