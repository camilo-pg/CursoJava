import java.util.Scanner;

public class ej19 {
    /*  Escribir un programa para una matriz de n x n e imprima en ella una silla
    *(o letra h minúscula) construida a base del numero 1 y utilizar el numero
    *0 como espacio. El tamaño de la silla se basa en una variable n que indicará
    *el tamaño de la figura a imprimir en una matriz de n x n.
    */
    
    public static void main(String[] args) {
        int n;
        int[][] matriz;
        Scanner scanner = new Scanner(System.in);
        //Creo la matriz
        System.out.println("Ingrese el tamaño de la matriz:");
        n = scanner.nextInt();
        if (n == 0){
            System.out.println("Error");
            System.exit(0);
        }
        matriz = new int[n][n];

        //Lleno la matriz con la figura de la silla
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if ( (j == 0) || (i == n / 2 && j != 0 && j != n - 1) || (j == n - 1 && i >= n / 2) ){
                    
                    matriz[i][j] = 1;
                }else{
                    matriz[i][j] = 0;
                }
            }
        }
        //Muestro la matriz
        for( int i = 0; i < n; i++){
            for (int j = 0 ; j < n; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        scanner.close();
    }    
}