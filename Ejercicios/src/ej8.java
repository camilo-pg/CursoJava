import java.util.Scanner;

public class ej8 {
/*Pedir 20 notas en una escla de 1 a 7, mostrar el promedio
de las notas mayores a 20, promedo de inferiores a 4 y la cantidad de 1
y mostrar el promedio total. 
 */
    public static void main(String[] args) {
        int[] notas = new int[20];
        int cantidadUnos,cantNotasInf4,cantNotasSup5,sumNotasSup5,sumNotasInf4,sumTotal, promInf, promSup, promedio;
        Scanner scanner = new Scanner(System.in);
        cantidadUnos = 0;
        cantNotasInf4 = 0;
        cantNotasSup5 = 0;
        sumNotasSup5 = 0;
        sumNotasInf4 = 0;
        sumTotal = 0;
        promInf = 0;
        promSup = 0;
        promedio = 0;

        for (int i = 0; i < 20; i++){
            System.out.println("Ingrese un número entre 1 y 7");
            notas[i] = scanner.nextInt();
            if (notas[i] == 0){
                System.out.println("Error, no se permiten ceros");
                System.exit(1);
            }
            if (notas[i] == 1) { cantidadUnos++; }
        }
        scanner.close();
        for (int j : notas){
            if ( j > 20){
                sumNotasSup5 += j;
                cantNotasSup5++;
            } else if (j < 4){
                sumNotasInf4 += j;
                cantNotasInf4++;
            }
            sumTotal += j;
        }
        promSup = sumNotasSup5 / cantNotasSup5;
        promInf = sumNotasInf4 / cantNotasInf4;
        promedio = sumTotal / 20;
        System.out.println("El promedio total es: " + promedio);

        if ( cantNotasInf4 == 0){
            System.out.println("No se ingresaron notas menores a 4");;
        } else {
            System.out.println("El promedio de notas menores a 4 es: " + promInf);
        }
        if (cantNotasSup5 == 0){
            System.out.println("No se ingresaron notas mayores a 20");
        } else {
            System.out.println("El promedio de notas mayores a 20 es: " + promSup);
        }
        if ( cantidadUnos == 0){
            System.out.println("Nadie se saco un 1!!");
        } else {
            System.out.println("La cantidad de notas 1 es: " + cantidadUnos);
        }
    }
}