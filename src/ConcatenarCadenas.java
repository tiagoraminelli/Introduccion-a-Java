public class ConcatenarCadenas {
    public static void main(String[] args) {
        //formas de concatenar
        var $cadena1 = "hola";
        var $cadena2 = "mundo";
        var $cadena3 = $cadena1 + " " + $cadena2;
        //metodo concat
        var $cadenaCon = $cadena1.concat(" ").concat("Mundo");
        System.out.println("$cadenaCon = " + $cadenaCon);
        
        //stringBuilder - mas eficiente
        var $constructorDeCadenas = new StringBuilder();
        // $constructorDeCadenas.append($cadena1);
        // $constructorDeCadenas.append(" ");
        // $constructorDeCadenas.append($cadena2);
        $constructorDeCadenas.append($cadena1).append(" ").append($cadena2);
        var resultado = $constructorDeCadenas.toString();
        System.out.println("resultado = " + resultado);

        //stringBuffer
        var stringBuffer = new StringBuffer();
        stringBuffer.append($cadena1).append(" ").append($cadena2);
        var resultadoBuffer = stringBuffer.toString();
        System.out.println("resultadoBuffer = " + resultadoBuffer);

        //join ..me gusta esta
        var adios = "adios <3";
        var resultadoJoin = String.join(" ",$cadena1,$cadena2,adios);
        System.out.println("resultadoJoin = " + resultadoJoin);


        
        
    }
}
