
import java.util.Scanner;

public class ej5 {
    
    public static void main(String[] args) {
    // Recibir la medida actual en litros e imprimir  la capacidad
      int CAPACIDAD = 70;
      int medidaActual;
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("Ingrese la medida actual del tanque");
      medidaActual = scanner.nextInt();
      
      if ( medidaActual >= 1 && medidaActual < 20){
        System.out.println("Insuficiente");
      } else if ( medidaActual >= 20 && medidaActual < 35){
        System.out.println("Suficiente");
      } else if ( medidaActual >= 35 && medidaActual < 50){
        System.out.println("Tanque a la mitad");
      } else if ( medidaActual >= 50 && medidaActual < 60){
        System.out.println("3/4 del tanque");
      } else if (medidaActual >= 60 && medidaActual < CAPACIDAD){
        System.out.println("Tanque casi lleno");
      } else if (medidaActual == CAPACIDAD){
        System.out.println("Tanque lleno");
      } else {
        System.out.println("Medida no valida");
      }
      scanner.close();
    }
}
