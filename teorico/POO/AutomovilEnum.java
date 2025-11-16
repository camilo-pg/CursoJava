package teorico.POO;

public class AutomovilEnum {

    public static void main(String[] args) {

        Automovil auto = new Automovil();

        auto.setFabricante("Toyota");
        auto.setModelo("Corolla");
        auto.setCilindrada(3.8);
        auto.setColor(Color.AZUL);
        auto.setTipo(TipoAutomovil.COUPE);

        Automovil auto2 = new Automovil("Toyota", "Corolla", 2.5, Color.ROJO, TipoAutomovil.COUPE);
        auto2.setTipo(TipoAutomovil.CONVERTIBLE);

        TipoAutomovil convertible = TipoAutomovil.CONVERTIBLE;

        switch (convertible) {
            case CONVERTIBLE:
                System.out.println("Es un automovil tipo convertible");
                break;

            case COUPE:
                System.out.println("Es un automovil tipo coupe");
                break;

            case SEDAN:
                System.out.println("Es un automovil tipo sedan");
                break;
        
            default:
                break;
        }

        TipoAutomovil[] tipos = TipoAutomovil.values();
        for (TipoAutomovil tipo : tipos){
            System.out.print( tipo + " => " + tipo.name() + ", " +
             tipo.getNombre() + ", " +
             tipo.getDescripcion() + ", " +
             tipo.getNumeroPuertas() );
             System.out.println();
        }
        
    }
}    
