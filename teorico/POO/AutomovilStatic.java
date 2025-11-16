package teorico.POO;

import java.util.Arrays;

public class AutomovilStatic {

    public static void main(String[] args) {
        
        Automovil auto = new Automovil();

        auto.setFabricante("Toyota");
        auto.setModelo("Corolla");
        auto.setCilindrada(3.8);
        auto.setColor(Color.AZUL);
        auto.setTipo(TipoAutomovil.COUPE);

        System.out.println("Detalle auto");
        System.out.println(auto.detalle());

        Automovil.setColorPatente(Color.VERDE);
        System.out.println(Automovil.VELOCIDAD_MAXIMA);

        Automovil auto2 = new Automovil("Toyota", "Corolla", 2.5, Color.ROJO, TipoAutomovil.CONVERTIBLE);
        auto2.setTipo(TipoAutomovil.CONVERTIBLE);
        System.out.println("Detalle auto2");
        System.out.println(auto2.detalle());
        System.out.println("Color Patente: " + Automovil.getColorPatente().getColor());
        
        TipoAutomovil convertible = TipoAutomovil.CONVERTIBLE;
        System.out.println(convertible.getNombre());

        Automovil[] autos = new Automovil[5];
        autos[0] = auto;
        autos[1] = auto2;
        autos[2] = new Automovil("Honda", "Civic", 2.0, Color.GRIS, TipoAutomovil.SEDAN);
        autos[3] = new Automovil("Mazda", "3", 2.5, Color.AMARILLO, TipoAutomovil.FURGON);
        autos[4] = new Automovil("Ford", "Focus", 3.0, Color.ROJO, TipoAutomovil.FURGON);

        Arrays.sort(autos);
        for ( Automovil a : autos){
            System.out.println(a);
        }
    }    
}
