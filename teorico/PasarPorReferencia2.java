package teorico;

class Persona{
        private String nombre;

        public void modificarNombre (String nuevoNombre){
            this.nombre = nuevoNombre;
        }

        public String mostrarNombre(){
            return this.nombre;
        }
}

public class PasarPorReferencia2 {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.modificarNombre("Camilo");

        System.out.println("Iniciamos main");
        System.out.println(persona.mostrarNombre());
        System.out.println("Antes de llamar al metodo test");
        test(persona);  
        System.out.println(persona.mostrarNombre());
        System.out.println("Finaliza el programa");

    }

    public static void test(Persona persona) {
        System.out.println("Iniciamos el metodo test");
        persona.modificarNombre("Pepe");
        System.out.println("Finaliza el metodo test");
    }
    
}
