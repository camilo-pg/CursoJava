package teorico;


public class OrdenamientoBurbuja {
/* Algoritmo de ordenamiento burbuja (Bubble Sort)
 * Compara todos los elementos de un arreglo y los intercambia
 * si estan en orden incorrecto, repitiendo hasta que el arreglo
 * este ordenado. */
    public static void main(String[] args) {
        Integer [] numeros = {5, 3, 8, 4, 2};
        int total = numeros.length;
        Integer auxiliar;

        System.out.println("Arreglo sin ordenar:");
        for (Integer k: numeros){
            System.out.print("[" + k + "] ");
        }        
        System.out.println();


        for (int i = 0; i < total; i++){
            for (int j = 0; j < total; j++){
                if((numeros[i].compareTo(numeros[j])) < 0){
                    auxiliar = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = auxiliar;
                }
            }
        }
//FORMA MAS EFICIENTE DE HACERLO
/* 
        for (int i = 0; i < total -1; i++){
            for (int j = 0; j < total -1 -i; j++){
                if((numeros[j+1].compareTo(numeros[j])) < 0){
                    auxiliar = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = auxiliar;
                }
            }
        }
*/
        System.out.println("Arreglo ordenado:");
        for (Integer k: numeros){
            System.out.print("[" + k + "] ");
        }
        
    }
}
