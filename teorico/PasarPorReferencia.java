package teorico;

public class PasarPorReferencia {
    /*Al pasar los parametros por referencia el valor de la variable
     * si se modifica fuera del metodo.
    */
    public static void main(String[] args) {

        int[] edad = {10, 11, 12};

        System.out.println("Iniciamos main");
        for (int i : edad){
            System.out.println(i);
        }
        test(edad);
        System.out.println("Finaliza el programa");
        for (int i : edad){
            System.out.println(i);
        }
    }

    public static void test(int[] i) {
        System.out.println("Iniciamos el metodo test");
            for (int j = 0; j< i.length; j++){
                i[j] = i[j] + 20;
            }
        System.out.println("Finaliza el metodo test");
    }
    
}
