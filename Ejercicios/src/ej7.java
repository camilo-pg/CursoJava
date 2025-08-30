import java.util.Scanner;

public class ej7 {
    /* Buscar el número menor de por lo menos 10 valores distintos
     * introducidos por teclado e imprimirlo por pantalla.
     */
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int min;
        String msj;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) { //Cargo los números
            System.out.println("Ingrese un número:");
            numeros[i] = scanner.nextInt();
        }
        min = numeros[0];
        for (int j : numeros) {
            //System.out.print(numeros[j] + " , ");
            if (j < min){
                min = j;
            }   
        }
        scanner.close();
        System.out.println("El número menor es: " + min);
        msj = (min < 10) ? "El número menor es menor que 10!": "El número mnor es igual o mayor que 10!";
        System.out.println(msj);
    }
}
