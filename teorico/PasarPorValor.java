package teorico;

public class PasarPorValor {
    /*Al pasar los parametros por valor el valor de la variable
     * no se modifica fuera del metodo.
    */
    public static void main(String[] args) {
        int i = 10;

        System.out.println("Iniciamos el programa con i = " + i);
        test(i);
        System.out.println("Finaliza el programa con  i = " + i);
    }

    public static void test(int i) {
        System.out.println("Iniciamos el metodo test con i = " + i);
        i = 35;
        System.out.println("Finaliza el metodo test con i = " + i);
    }
    
}