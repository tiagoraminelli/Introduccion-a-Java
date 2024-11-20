public class GeneradorEmail {
    public static void main(String[] args) {
        //crear un programa que genere un email a partir de los siguientes datos:
        //nombre: Ubaldo Acosta Soto
        //empresa: Global Mentoring
        //dominio: com.mx
        //resultado final:
        //email: ubaldo.acosta.soto@globalmentoring.com.mx
        var nombre = " Ubaldo Acosta Soto ";
        var empresa = "Global Mentoring";
        var dominio = "com.mx";

        var nombreSinEspacio = nombre.trim();
        var nombreConPuntos = nombreSinEspacio.replace(" ",".");
        var emailParte1 = nombreConPuntos.toLowerCase();
        System.out.println("emailParte1 = " + emailParte1);

        var email = empresa.toLowerCase();
        var empresaLent = empresa.substring(0,6).toLowerCase();
        var empresaLent2 = empresa.substring(7).toLowerCase();
        var emailParte2 = new StringBuffer();
        emailParte2.append('@').append(empresaLent).append(empresaLent2).append('.').append(dominio);
        System.out.println("emailParte2 = " + emailParte2);
        
        var emailGenerado = new StringBuffer();
        emailGenerado.append(emailParte1).append(emailParte2);
        System.out.println("emailGenerado = " + emailGenerado);

        
    }
}
