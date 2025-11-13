import java.util.Scanner;

public class ej17 {
    /*Un programa que recorra un arreglo y genere un histograma en base
     * a los valores. El arreglo debe contener 12 elementos con valores
     * entre el 1 y el 6. Usamos el * para la representación grafica.
     * EJ: el arreglo {4, 3, 4, 6, 6, 4, 1, 4, 5, 4, 1, 1} el histograma debería ser:
     * 1: ***
     * 2: 
     * 3: *
     * 4: *****
     * 5: *
     * 6: ** 
     */
    
     public static void main(String[] args) {
        int[] arreglo = new int[12];
        String[] histograma = {"","","","","",""};
        int tamaño = arreglo.length;
        Scanner scanner = new Scanner(System.in);
        

        //Cargo el arreglo
        for (int i = 0; i < tamaño; i++){
            System.out.println("Ingrese un valor entre el 1 y el 6");
            do{
                arreglo[i] = scanner.nextInt();
            } while ( arreglo[i] > 6 || arreglo[i] < 1);
            
        }

        //Recorro el arreglo y busco los valores
        for (int j = 0 ; j < tamaño; j++){
            switch (arreglo[j]) {
                case 1:
                    histograma[0] +=  "*";
                    break;
                case 2:
                    histograma[1] +=  "*";
                    break;
                case 3:
                    histograma[2] +=  "*";
                    break;
                case 4:
                    histograma[3] +=  "*";
                    break;
                case 5:
                    histograma[4] +=  "*";
                    break;
                case 6:
                    histograma[5] +=  "*";
                    break;
            }
        }
        //Muestro el histograma
        for (int k = 0; k < histograma.length; k++) {
            System.out.println( (k+1) + ": " + histograma[k]);
        }
        scanner.close();

     }
}


