package teorico;

import java.util.Arrays;

public class Arreglos {
/*Son tipos de datos de rederencia que contienen varios elementos ordenados
 * de una colección del mismo tipo.
 */
    public static void main(String[] args) {
        //Declaración de arreglos
        int[] numeros = new int[5]; //arreglo de enteros con 5 elementos
        String[] nombres = {"Juan", "Luis", "Carlos", "Melina", "Axel"}; //arreglo de cadenas con 3 elementos

        //Asignación de valores a un arreglo
        numeros[0] = 10;

        //recorrer un arreglo
        for (int i = 0; i < numeros.length; i++){
            System.out.println(nombres[i]);
        }

        System.out.println("-------------------");
        
        //Ordenar un arreglo
        Arrays.sort(nombres);
        for (String k : nombres) {
            System.out.println(k);
        }
    }
    
}
