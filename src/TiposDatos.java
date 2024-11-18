public class TiposDatos {
    public static void main(String[] args) {
        //Tipos de datos
        //Enteros (su valor inicial es 0)
        byte tipoByte = 127; //valor maximo
        //Enteros
        byte tipoByteConvertido = (byte)128;
        System.out.println("tipoByte = " + tipoByte);
        System.out.println("tipoByteConvertido = " + tipoByteConvertido);
        //SHOT
        Short TipoShort = 32000;
        System.out.println("TipoShort = " + TipoShort);
        Short TipoShortConvertido = (short)33000;
        System.out.println("TipoShortConvertido = " + TipoShortConvertido);
        //INT
        int tipoInt = 12122;
        System.out.println("tipoInt = " + tipoInt);
        //LONG
        long TipoLong = 1231231231122L; //usar la L para generar valores mas grandes
        System.out.println("TipoLong = " + TipoLong);
        //FLOAT
        float tipoFloat = 3.14F; //usar el sufijo F para indicar q es un tipo Float
        System.out.println("tipoFloat = " + tipoFloat); 
        //DOUBLE
        double tipoDouble = 3.12312D; //D al final para indicar el tipo Double
        System.out.println("tipoDouble = " + tipoDouble);
        
        //char (su valor inicial es '/u0000')
        char tipoCaracter = 'A'; //juego de caracteres del juego UNICODE
        System.out.println("tipoCaracter = " + tipoCaracter);
        tipoCaracter = 65;
        System.out.println("tipoCaracter = " + tipoCaracter);
        
        //bolean (valor iniciar es falso)
        boolean TipoBolean = true;
        System.out.println("TipoBolean = " + TipoBolean);
        
        //cadena
        String nombre = null; //NULL
        System.out.println("nombre = " + nombre);
        nombre = "Juan Perez"; //NULL
        System.out.println("nombre = " + nombre);
    }
}
