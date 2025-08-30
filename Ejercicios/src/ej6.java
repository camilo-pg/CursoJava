import javax.swing.JOptionPane;

public class ej6 {
    public static void main(String[] args) {
    //Obtener el nombre mas largo de 3 personas
        String nombreyapellido1, nombreyapellido2, nombreyapellido3;
        String nombre1, nombre2, nombre3, nombreMasLargo;

        nombreyapellido1 = JOptionPane.showInputDialog(null,"Ingrese el primer nombre");
        nombreyapellido2 = JOptionPane.showInputDialog(null,"Ingrese el segundo nombre");
        nombreyapellido3 = JOptionPane.showInputDialog(null,"Ingrese el tercer nombre");

        nombre1 = nombreyapellido1.split(" ")[0];
        nombre2 = nombreyapellido2.split(" ")[0];
        nombre3 = nombreyapellido3.split(" ")[0];
        
        nombreMasLargo =(nombre1.length() > nombre2.length()) ? nombreyapellido1 : nombreyapellido2;
        nombreMasLargo = (nombreMasLargo.length() > nombre3.length()) ? nombreMasLargo : nombreyapellido3;
        System.out.println("El nombre mas largo es el de " + nombreMasLargo);

    }
}