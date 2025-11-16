package teorico.POO;

public class EjemploClase {
    public static void main(String[] args) {
        Automovil auto = new Automovil();

        auto.setFabricante("Toyota");
        auto.setModelo("Corolla");
        auto.setCilindrada(3.8);
        auto.setColor(Color.AZUL);

        System.out.println(auto.detalle());

        System.out.println("Consumo: " + auto.calcularConsumo(300, 0.5f) + " km/l");

        System.out.println();
        System.out.println("----------------------------------------------");
        System.out.println();

        Automovil auto2 = new Automovil("Toyota", "Corolla", 2.5, Color.ROJO, TipoAutomovil.CONVERTIBLE);
        System.out.println(auto2.detalle());

        System.out.println();
        System.out.println("----------------------------------------------");
        System.out.println();

        //metodo equals
        System.out.println("¿Son iguales? " + (auto == auto2));
        System.out.println("¿Son iguales? " + auto.equals(auto2));

        //Metodo toSting
        System.out.println(auto2);

    }
    
}
