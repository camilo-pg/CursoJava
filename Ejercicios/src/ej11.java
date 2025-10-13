/*Ingresar una fecha de nacimiento en formato String, convertirla en Date
 * y calcular la edad de la persona de acuerdo a la fecha actual.
 */

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class ej11 {

    public static void main(String[] args) {
        Date fechaActual = new Date();
        int edad;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String fechaDeNacimientoStr;
        Date fechaDeNacimiento = new Date();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la fecha de nacimiento en formato dd-mm-yyyy");

        try {
            fechaDeNacimientoStr = scanner.nextLine();
            fechaDeNacimiento = dateFormat.parse(fechaDeNacimientoStr);
            System.out.println("Si naciste el " + dateFormat.format(fechaDeNacimiento));
            System.out.println("y la fecha actual es " + dateFormat.format(fechaActual));
        } catch(Exception e) {
            e.printStackTrace();
        }
        scanner.close();
        edad = fechaActual.getYear() - fechaDeNacimiento.getYear();
        System.out.println("Entonces tu edad es " + edad);

    }    
}

/* EL PROFE LO HIZO
 * 
 * public class ProgramaCalculoEdad {

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un fecha de nacimiento con formato yyyy-MM-dd:");
        String fechaStr = scanner.next();

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaNacimiento = df.parse(fechaStr);
        Date actual = new Date();

        // creamos un patron de fecha numérico con el año mes y día
        df = new SimpleDateFormat("yyyyMMdd");

        // luego convertimos ambas fechas la actual y la fecha de nacimiento
        // en enteros que contiene el año mes y día
        int desde = Integer.parseInt(df.format(fechaNacimiento));
        int hasta = Integer.parseInt(df.format(actual));
        
        // luego restamos ambas fechas y dividimos en 10000 para quitar decimales y 
        // dejar la fecha en decenas o centenas
        int edad = (hasta - desde) / 10000;
        System.out.println("La edad es: " + edad);
    }
}
 */