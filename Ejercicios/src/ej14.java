import java.util.Scanner;

public class ej14 {
    /* Escribar un programa que imprima el número más alto de un arreglo de 7 elementos
     * si se repite un valor considedar uno solo.
     */
    public static void main(String[] args) {
        int[] números = new int[7];
        int max;
        int tamaño = números.length;
        Scanner scanner = new Scanner(System.in);

        //Cargar el arreglo
        for ( int i = 0 ; i < tamaño; i++){
            System.out.println("Ingrese un número");
            números[i] = scanner.nextInt();
        }
        //Buscar el número más alto
        max = 0;
        for ( int k : números){
            max = (k > max) ? k : max;
        }
        //Muestro el resultado
        System.out.println("El número mas alto es: " + max);
        scanner.close();
    }
}
