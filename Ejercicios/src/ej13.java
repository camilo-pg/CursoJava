import java.util.Scanner;

public class ej13 {
    /* Ordenar el arreglo de 10 números de la forma ultimo-primero
    * anteultimo-segundo, etc.    
     * 
     */
    public static void main(String[] args) {
        int[] numeros = new int [10];
        int[] numerosOrdenado = new int [10];
        int tamaño = numeros.length;
        int aux;
        Scanner scanner;

        //Cargar el arreglo
        scanner = new Scanner(System.in);

        for (int i = 0; i < tamaño; i++){
            System.out.println("Ingrese un número");
            numeros[i] = scanner.nextInt();
        }
        
        //Ordenar el arreglo
        aux = 0;
        for (int j = 0; j < tamaño / 2; j++){
            numerosOrdenado[aux++] = numeros[tamaño -1 -j];
            numerosOrdenado[aux++] = numeros[j];
        }

        //Mostrar el arreglo
        for (int k : numerosOrdenado){
            System.out.println("[ " + k + " ]");
        }
        scanner.close();
    }
}
