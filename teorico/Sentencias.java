public class Sentencias {
    public static void main(String[] args) {
        int aux, aux2;
        aux = 1;
        aux2 = 2;

        //if - else
        if (aux != aux2){
            System.out.println("Los números son distintos");
        } else {
            System.out.println("Los números son iguales");
        }
        
        //swith case
        switch (aux) {
            case 0:
                System.out.println("El número es 0");
                break;
            case 1:
                System.out.println("El número es 1");
                break;
            default:
                System.out.println("El número es 2 o mas");
                break;
        }

        //for
        for (int i = 0; i<5;i++) {
            if (i % 2 == 0){
                continue;
                
            }
            System.out.println("El valor de i es: " + i);
        }

        //while y do while
        boolean prueba = true;
        int i = 0;
        while (prueba) {

          System.out.println("Dentro del while");
          i++;
          if (i > 3){
          prueba = false; // Para evitar un bucle infinito
          }

        }

        //foreach
        String[] nombres = {"Ana", "Luis", "Pepe", "Maria"};
        for (String nombre : nombres){
          System.out.println("Nombre: " + nombre);
        }

        //etiquetas
        bucle1:
        for (int k = 0; k < 5; k++) {
            for (int j = 0; j < 5; j++) {
                if (k == 2) {
                    continue bucle1; // continua el bucle1
                }
                System.out.println("k: " + k + ", j: " + j);
            }
        }
    } 
    
}
