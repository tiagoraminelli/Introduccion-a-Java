public class tiendaEnLinea {
    public static void main(String[] args) {
        System.out.println("**tienda en linea**");
        String $nombreProducto = "Azucar Light Arcor";
        double $precioProducto = 1050.50;
        int $cantidadDisponible = 60;
        boolean $esComprable = true;
        System.out.println("$nombreProducto = " + $nombreProducto);
        System.out.println("$precioProducto = " + $precioProducto);
        System.out.println("$cantidadDisponible = " + $cantidadDisponible);
        System.out.println("$esComprable = " + $esComprable + "\n");
        //modificados;
        $nombreProducto = "Arroz Trimacer 1KG";
        $precioProducto = 1400.60;
        $cantidadDisponible = 36;
        $esComprable = false;
        System.out.println("$nombreProducto = " + $nombreProducto);
        System.out.println("$precioProducto = " + $precioProducto);
        System.out.println("$cantidadDisponible = " + $cantidadDisponible);
        System.out.println("$esComprable = " + $esComprable);
    }
}
