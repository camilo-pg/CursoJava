package teorico;

public class Cadenas {
    public static void main(String[] args) {
        String cadena = "Texto";
        String cadena2 = new String("Texto");
        boolean igual;
        //comparo las referencias de memoria
        igual = cadena == cadena2;
        System.out.println(igual);

        //comparo el texto de las cadenas
        igual = cadena.equals(cadena2);
        System.out.println(igual);



    }

}
