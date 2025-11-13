package teorico;

public class Matrices {
/*  Matrices: Son arreglos vidimensionales, donde cada uno de sus elementos es a su vez un arreglo
 * en su segunda dimensión. Permite que no todos los elementos tengan el mismo tamaño.
 * La declaración de una matriz tiene 2 partes: el tipo de datos del arreglo seguido de dobles corchetes
 * y el nombre de la variable. Cuando se crea utilizamos el operador new mas el tipo de elementos de filas y columnas
 * 
 *
 * 
 */
    public static void main(String[] args) {
        int [][] matriz = new int [2][4];

        //LLenar la matriz
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = (i+1) * (j+1);
            }
        }

        System.out.println("Número de filas " + matriz.length);
        System.out.println("Número de columnas " + matriz[0].length);

        System.out.println("Primer elemento de la matriz: " + matriz[0][0]);
        System.out.println("Último elemento de la matriz: " + matriz[matriz.length -1][ matriz[0].length -1]);

        //mostrar la matriz
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + "\t");
    }   
            System.out.println();
        }

        //Ejemplo matriz de columnas variables
        int [][] matriz2 = new int[3][];
        matriz2[0] = new int[2];
        matriz2[1] = new int[3];
        matriz2[2] = new int[4];
        //muestro la matriz2
        System.out.println("Matriz de columnas variables");
        for (int i = 0; i < matriz2.length; i++){
            for (int j = 0; j < matriz2[i].length; j++){
                System.out.print(matriz2[i][j] + "\t");
            }
            System.out.println();
        }

        //Ejemplo de buscar en una matriz
        int numeroBuscado = 6;
        boolean encontrado = false;
        int i;
        int j = 0;
        buscar: for( i = 0; i < matriz.length; i++){
            for( j = 0; j < matriz[i].length; j++){
                if (matriz[i][j] == numeroBuscado){
                    encontrado = true;
                    break buscar;
                }
            }
        }
        if (encontrado){
            System.out.println("El número esta en la matriz en ["+ i + "," + j + "]");
        }

        //ejemplo de matriz simetrica = la parte superior es igual a la inferior
        int [][] matrizSimetrica = {
            {1, 2, 3},
            {2, 4, 5},
            {3, 5, 6}
        };
        boolean simetrica = true;
        buscarSimetrica: for ( i = 0; i < matrizSimetrica.length; i++){
            for ( j = 0; j < matrizSimetrica[i].length; j++){
                if (matrizSimetrica[i][j] != matrizSimetrica[j][i]){
                    simetrica = false;
                    break buscarSimetrica;
                }
            }
        }
        System.out.println("La matriz es simetrica? R: " + simetrica);
    }
}


