

import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        // recibir 2 numeros y mostrarlos de mayor a menor.
        Integer num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo número");
        num2 = scanner.nextInt();
        String resultado = (num1 >= num2) ? (num1 + " , " + num2) : (num2 + " , " + num1);
        System.out.println(resultado);
        scanner.close();

    }
}