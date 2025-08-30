package teorico;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Entradas {
    public static void main(String[] args) {
        //ejemplo de entrada con ventanas
        String numeroStr = JOptionPane.showInputDialog(null,"Ingrese un númeroentero");
        int numero = Integer.parseInt(numeroStr);
        JOptionPane.showMessageDialog(null, "El número que indico es " + numero);

        //ejemplo de entrada por consola
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero");
        numero = scanner.nextInt();
        System.out.println("El número que indico es " + numero);
        scanner.close();
    }

}
