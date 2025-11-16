package teorico.POO;

public enum TipoAutomovil {
    SEDAN("Sedan", 4, "Auto de 4 puertas"),
    FURGON("Furgon", 4, "Auto de carga"),
    COUPE("Coupe", 2, "Auto deportivo de 2 puertas"),
    CONVERTIBLE("Convertible", 2, "Auto deportivo descapotable");

    private final String nombre;
    private final int numeroPuertas;
    private final String descripcion;

    TipoAutomovil(String nombre, int numeroPuertas, String descripcion){
        this.nombre = nombre;
        this.numeroPuertas = numeroPuertas;
        this.descripcion = descripcion;
    }

    public String getNombre(){
        return nombre;
    }
    public int getNumeroPuertas(){
        return numeroPuertas;
    }
    public String getDescripcion(){
        return descripcion;
    }

}
