package teorico;

public class ConversionDeTipos {
    public static void main(String[] args) {
        // Conversión de String a primitivos
        String numero = "50";
        
        int numeroInt = Integer.parseInt(numero);
        System.out.println("El numero entero es:" + numeroInt);

        String strLogico = "true";
        boolean logico = Boolean.parseBoolean(strLogico);
        System.out.println(logico);

        //Conversion de primitivo a String
        int numero2 = 100;
        String cadena = Integer.toString(numero2);
        System.out.println("El numero convertido a cadena es: " + cadena);

        String otraCadena = String.valueOf(numero2);
        System.out.println(otraCadena);
    }   

}
