import java.util.Scanner;

public class ej10 {
    /* Realizar un menu para administrar productos con opciones:
     * actualizar, eliminar, crear, listar y salir.
     * Vamos a contar con un menu para poder seleccionar la opción
     * Dentro de cada sentencia o switch imprimir un texto relacionado a la opción
     * Usar un do while para iterar hasta que la opción sea salir, cada vez que se 
     * selecciona una operación distinta a salir, al finalizar con dicha operación 
     * debe volver al menú para continuar con otra, al finalizar con la opción salir (5)
     *  se debe mostrar el mensaje "Haz salido con exito!" y finalizar el programa.
     */
    public static void main(String[] args) {
        int opcion;
        Scanner scanner = new Scanner(System.in);
        boolean condicion = true;

        do {
            System.out.println("Selecione una opción:");
            System.out.println("1. Actualizar");
            System.out.println("2. Eliminar");
            System.out.println("3. Crear");
            System.out.println("4. Listar");
            System.out.println("5. Salir");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println(" Usuario actualizado con exito!");
                    break;
                case 2:
                    System.out.println(" Usuario eliminado con exito!");
                    break;
                case 3:
                    System.out.println(" Usuario creado con exito!");
                    break;
                case 4:
                    System.out.println(" Listado de usuarios:");
                    break;
                case 5:
                    System.out.println("Haz salido con exito!");
                    condicion = false;
                    break;
                default:
                    System.out.println("Opción no valida");
                    break;
            }

            
        } while (condicion);
        scanner.close();
        System.out.println("Programa finalizado");
    }   
}

/* EJEPLO DEL PROFESOR
 * import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class ProgramaMenuOpcionesIterativo {

    public static void main(String[] args) {
        int opcionIndice = 0;
        do {

            // los Map (o mapas) los veremos mas adelante en el curso en profundidad
            // pero son como un arreglo asociativo, asocia un nombre (o indice) a un valor
            // también se les conoce como diccionarios para almacenar datos en base a un nombre.
            Map<String, Integer> opciones = new HashMap<>();
            opciones.put("Actualizar", 1);
            opciones.put("Eliminar", 2);
            opciones.put("Agregar", 3);
            opciones.put("Listar", 4);
            opciones.put("Salir", 5);

            Object[] opArreglo = opciones.keySet().toArray();
            Object opcion = JOptionPane.showInputDialog(null,
                    "Seleccione un Operación", "Mantenedor de Usuario", JOptionPane.INFORMATION_MESSAGE, null, opArreglo, opArreglo[0]);

            if (opcion == null) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar una operación");
            } else {
                opcionIndice = opciones.get(opcion.toString());

                String mensaje = null;

                switch (opcionIndice) {
                    case 1 -> {
                        mensaje = "Usuario actualizado correctamente";
                        JOptionPane.showMessageDialog(null, mensaje);
                        System.out.println(mensaje);
                    }
                    case 2 -> {
                        mensaje = "Usuario eliminado correctamente";
                        JOptionPane.showMessageDialog(null, mensaje);
                        System.out.println(mensaje);
                    }
                    case 3 -> {
                        mensaje = "Usuario agregado correctamente";
                        JOptionPane.showMessageDialog(null, mensaje);
                        System.out.println(mensaje);
                    }
                    case 4 -> {
                        mensaje = "Listando a los usuarios";
                        JOptionPane.showMessageDialog(null, mensaje);
                        System.out.println(mensaje);
                    }
                }
            }

        } while (opcionIndice != 5);

        JOptionPane.showMessageDialog(null, "Haz salido con exito!");
    }
}* 
 */