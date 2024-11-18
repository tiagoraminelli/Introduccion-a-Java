public class ReservaHotel {
    public static void main(String[] args) {
        //datos de entrada
        final var $nombreHotel = "HAZBIN HOTEL";
        var $nombreCliente = "Pedro Pascal";
        var $diasEstancia = 4;
        var TARIFA_DIARIA = 22;
        final var VISTA_AL_MAR = true;
        var $costoTotal = $diasEstancia * TARIFA_DIARIA;
        //imprimimos los datos en pantalla;
        System.out.println($nombreHotel+ "\n");
        System.out.println("$nombreCliente : " + $nombreCliente);
        System.out.println("$diasEstancia : " + $diasEstancia);
        System.out.println("TARIFA_DIARIA : " + TARIFA_DIARIA);
        System.out.println("VISTA_AL_MAR : " + VISTA_AL_MAR);
        System.out.println("COSTO_TOTAL = " + $costoTotal);
        System.out.println("datos modificados: \n");
        $nombreCliente = "Pedro Moreno";
        $diasEstancia = 8;
        TARIFA_DIARIA = 12;
        $costoTotal = $diasEstancia * TARIFA_DIARIA;
        System.out.println("$nombreCliente : " + $nombreCliente);
        System.out.println("$diasEstancia : " + $diasEstancia);
        System.out.println("TARIFA_DIARIA : " + TARIFA_DIARIA);
        System.out.println("VISTA_AL_MAR : " + VISTA_AL_MAR);
        System.out.println("COSTO_TOTAL = " + $costoTotal);





    }
}
