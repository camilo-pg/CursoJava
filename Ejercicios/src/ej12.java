/*Pedir el radio de un circulo y calcular su área-
 * utilizar la formula area = pi*r'2
 */

import java.util.Scanner;

public class ej12 {
    public static void main(String[] args) {
        double pi = Math.PI;
        double radio;
        double area;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo");
        radio = scanner.nextDouble();
        area = pi * Math.pow(radio, 2);
        System.out.println("El area del circulo es: " + area);
        
        scanner.close();
    }
    
}
