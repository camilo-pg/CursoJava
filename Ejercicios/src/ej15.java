import java.util.Scanner;

public class ej15 {

    /*Leer 7 números por teclado para llenar un arreglo y a continuación calcular 
    * el promedio de los números positivos, el promedio de los negativos y contar el número de ceros.
    */
    public static void main(String[] args) {
        Integer[] numeros = new Integer[7];
        int tamaño = numeros.length;
        int sumaPos, sumaNeg;
        int cantCeros,cantPos, cantNeg;
        Scanner scanner = new Scanner(System.in);

        //Cargo el arreglo
        for (int i = 0; i < tamaño; i++){
            System.out.println("Ingrese un número");
            numeros[i] = scanner.nextInt();
        }

        //Calculo la suma de positivos, negativos y cantidad de ceros
        sumaPos = 0;
        sumaNeg = 0;
        cantCeros = 0;
        cantPos = 0;
        cantNeg = 0;
        for (int k : numeros){
            if (k > 0){
                sumaPos += k;
                cantPos++;
            } else if ( k < 0){
                sumaNeg += k;
                cantNeg++;
            } else {
                cantCeros++;
            }
        }
        //Muestro los resultados
        System.out.println("El promedio de los números positivos es: " + (sumaPos / cantPos));
        System.out.println("El promedio de los números negativos es: " + (sumaNeg / cantNeg));
        System.out.println("La cantidad de ceros es: " + cantCeros);       
        scanner.close();
    }
}
