import java.util.Scanner;

public class ej9 {
    /* multiplicar 2 numeros sin usar el operador multiplicador */
    public static void main(String[] args) {
        int num1, num2, resultado, abs2;
        boolean positivo1, positivo2;
        resultado = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número:");
        num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo número:");
        num2 = scanner.nextInt();
        scanner.close();
        positivo1 = num1 > -1;
        positivo2 = num2 > -1;

        abs2 = positivo2 ? num2 : -num2;

        for (int i = 0; i < abs2; i++){
            resultado += num1;
        }

        if (!positivo1 && !positivo2 || !positivo2){
            resultado = -resultado;
        }
        System.out.println("El resultado de la multiplicación es: " + resultado);
    }
}