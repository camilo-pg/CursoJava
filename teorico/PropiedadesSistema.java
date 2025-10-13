package teorico;

import java.util.Properties;

public class PropiedadesSistema {
    public static void main(String[] args) {
        String username = System.getProperty("user.name");
        System.out.println("username: " + username);

        String home = System.getProperty("user.home");
        System.out.println(home);

        String workspace = System.getProperty("user.dir");
        System.out.println(workspace);
        
        Properties p = System.getProperties();
        p.list(System.out);

        System.out.println("========================");

    //Asignar una propiedad
        p.setProperty("mi.propiedad.prueba", "Propiedad de prueba creada");
        p.list(System.out);
    }
}
