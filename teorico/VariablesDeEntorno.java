package teorico;

import java.util.Map;

public class VariablesDeEntorno {
    public static void main(String[] args) {
        Map<String, String> varEntorno = System.getenv();
        //System.out.println("Variables del Entorno" + varEntorno);

        String username = System.getenv("USERNAME");
        System.out.println("Username: " + username);

        String JAVA_HOME = System.getenv("JAVA_HOME");
        System.out.println("JAVA HOME: " + JAVA_HOME);
    }
    
}
