package teorico;
//import java.sql.JDBCType;
import java.util.Scanner;

//import javax.swing.JOptionPane;

public class factura {
    public static void main(String[] args) {
        String nombreFactura;
        double precio = 0;
        double precio2 = 0;
        double totalBruto;
        double totalNeto;
        double imp;
        double IVA = 0.19;
        Scanner scanner = new Scanner(System.in);

        // 1 - Recibir el nombre de la factura.
        System.out.println("Ingrese el nombre de la factura ");
        nombreFactura = scanner.nextLine();

        // 2 - Recibir el precio del producto.
        System.out.println("Ingrese 2 precios del producto ");
        try {
            precio = scanner.nextDouble();
            precio2 = scanner.nextDouble();
        } catch (Exception e){
            System.out.println("Favor de ingresar los números con ',' no con ','");
            main(args);
            System.exit(0);
        }

        //3 - Calcular el total y mostrarlo por consola.
        totalBruto = precio + precio2;
        imp = totalBruto * IVA;
        totalNeto = totalBruto + imp;
        String detalle = "La factura " + nombreFactura + " tiene un importe bruto de " + totalBruto
        + " un impuesto de " + imp + " y un total neto de " + totalNeto;
        
        System.out.println(detalle);

        scanner.close();
    }
}
