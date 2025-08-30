package teorico;
//import java.util.Scanner;

import javax.swing.JOptionPane;

public class Familia {
    public static void main(String[] args) {
        // recibir el nombre de 3 personas.
        String nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre de un familiar");
        String nombre2 = JOptionPane.showInputDialog(null,"Ingrese el nombre de un amigo");
        String nombre3 = JOptionPane.showInputDialog(null,"Ingrese el nombre de una mascota");
/* 
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de un familiar");
        nombre = scanner.nextLine();

        System.out.println("Ingrese el nombre de un amigo");
        nombre2 = scanner.nextLine();

        System.out.println("Ingrese el nombre de una mascota");
        nombre3 = scanner.nextLine();
        scanner.close();
*/

        //crear nueva variable con los nombres dados.
        StringBuilder user = new StringBuilder();
        user.append(nombre.toUpperCase().charAt(1)).append(".").append(nombre.substring(nombre.length()-2));

        StringBuilder user2 = new StringBuilder();
        user2.append(nombre2.toUpperCase().charAt(1)).append(".").append(nombre2.substring(nombre2.length()-2));

        StringBuilder user3 = new StringBuilder();
        user3.append(nombre3.toUpperCase().charAt(1)).append(".").append(nombre3.substring(nombre3.length()-2));

/*
        String usr = nombre.toUpperCase().charAt(1)+"."+(nombre.substring(nombre.length()-2));
        String usr2 = nombre2.toUpperCase().charAt(1)+"."+(nombre2.substring(nombre2.length()-2));
        String usr3 = nombre3.toUpperCase().charAt(1)+"."+(nombre3.substring(nombre3.length()-2)); 
*/

        //mostrar los nombres separado con gion bajo

        StringBuilder detalle = new StringBuilder();
        detalle.append(user).append("_").append(user2).append("_").append(user3);
        System.out.println(detalle);

    }

}
