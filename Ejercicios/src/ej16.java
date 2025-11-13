import java.util.Scanner;


public class ej16 {
    /* Para la tarea se debe crear un arreglo con 10 elementos (enteros en el rango de 1 a 9).
    * Escriba un programa que imprima el número que tiene más ocurrencias en el arreglo y también
    * imprimir la cantidad de veces que aparece en el arreglo.
    * EJ: para el arreglo {1, 2, 3, 3, 4, 5, 5, 5, 6, 7}
    * el resultado debe ser: La mayor ocurrencias es: 3 y el elemento que mas se repite es: 5
    */
    public static void main(String[] args) {
        int[] numeros = new int [10];
        int ocurrencias, maxOcurrencias, maxRepetido, aux;
        int tamaño = numeros.length;
        Scanner scanner = new Scanner(System.in);

        //Cargar el arreglo
        for (int i = 0; i < tamaño; i++){
            System.out.println("Ingrese un número");
            numeros[i] = scanner.nextInt();
        }

        //Busco el número con más ocurrencias
        maxOcurrencias = 0;
        maxRepetido = 0;
        for (int i = 0; i < tamaño; i++){
            ocurrencias = 0;
            aux = numeros[i];
            if ( aux == maxRepetido){
                continue;
            }
            for (int j = 0; j < tamaño; j++){
                if (aux == numeros[j]){
                    ocurrencias++;
                }
            }
            if (ocurrencias > maxOcurrencias){
                maxOcurrencias = ocurrencias;
                maxRepetido = aux;
            }
        }
        //Muestro el resultado
        System.out.println("La mayor ocurrencias es: " + maxOcurrencias);
        System.out.println("El elemento que más se repite es: " + maxRepetido);
        scanner.close();
    }
}

