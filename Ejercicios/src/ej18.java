import java.util.Scanner;

public class ej18 {
    /*  Un programa que imprima una X contruida en las diagonales 
    * matriz y utilizar el _ como relleno. El tamaño de la X se basa
    * en una ariable n que indica el tamaño de la letra para imprimir una matriz de nxn.
    */
    public static void main(String[] args) {
        int n;
        char[][] matriz;
        Scanner scanner = new Scanner(System.in);

        //Pido el tamaño de la matriz
        System.out.println("Ingrese el tamaño de la matriz:");
        n = scanner.nextInt();
        matriz = new char[n][n];

        //Creo la X
        for( int i = 0; i < n; i++){
            for (int j = 0 ; j < n; j++){
                if (i == j || (i + j == n-1)){
                    matriz[i][j] = 'X';
                }else{
                    matriz[i][j] = '_';
                }
            }
        }

        // Muestro la matriz
        for( int i = 0; i < n; i++){
            for (int j = 0 ; j < n; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}