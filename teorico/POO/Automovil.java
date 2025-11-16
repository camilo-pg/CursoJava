package teorico.POO;

public class Automovil implements Comparable {

    //Atributos de la clase
    private String fabricante;
    private String modelo;
    private double cilindrada;
    private Color color;
    private int capacidadTanque = 40;

    private TipoAutomovil tipo;

    //Atributo statico
    private static Color colorPatente = Color.GRIS;

    //Atributo CONSTANTE
    public static final Integer VELOCIDAD_MAXIMA = 120;
    public static final Integer VELICOCIDAD_CIUDAD = 60;

    //Metodos de la clase

    public Automovil(String fabricante, String modelo, double cilindrada, Color color, TipoAutomovil tipo){
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
        this.color = color;
        this.tipo = tipo;
    }

    public Automovil(){};

    public String getFabricante(){
        return fabricante;
    }

    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public Color getColor(){
        return color;
    }

    public void setColor(Color color){
        this.color = color;
    }

    public double getCilindrada(){
        return cilindrada;
    }

    public void setCilindrada(double cilindrada){
        this.cilindrada = cilindrada;
    }

    public int getCapacidadTanque(){
        return capacidadTanque;
    }

    public void serCacapacidadTanque(int capacidadTanque){
        this.capacidadTanque = capacidadTanque;
    }

    public static Color getColorPatente(){
        return colorPatente;
    }

    public static void setColorPatente(Color colorPatente){
        Automovil.colorPatente = colorPatente;
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo){
        this.tipo = tipo;
    }

    public String detalle(){
        StringBuilder sb = new StringBuilder();
        sb.append("Fabricante: " +this.fabricante);
        sb.append("\nModelo: " + this.modelo);
        sb.append("Tipo: " + this.getTipo().getDescripcion());
        sb.append("\nCilindrada: " + this.cilindrada);
        sb.append("\nColor:" + this.color);
        sb.append("\nCapacidad Tanque: " + capacidadTanque);
        sb.append("\nColor Patente: " + colorPatente);
        return sb.toString();
    }
    
    public float calcularConsumo(int km, float porcentajeCombustible){ 
        return km / (capacidadTanque * porcentajeCombustible);
    }

    @Override
    public boolean equals(Object obj) {

        if (!(obj instanceof Automovil)){
            return false;
        }
        Automovil a = (Automovil) obj;
        return  (this.fabricante != null 
            && this.modelo != null 
            && this.fabricante.equals(a.getFabricante()) 
            && this.modelo.equals(a.getModelo()));
    }

    @Override
    public String toString(){
        return "Automovil{ " +
                "Fabricante ='" + fabricante + '\'' +
                ", Modelo ='" + modelo + '\'' +
                ", Cilindrada ='" + cilindrada + '\'' +
                ", Capacidad Tanque =' " + capacidadTanque + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o){
        Automovil a = (Automovil) o;
        return fabricante.compareTo(a.fabricante);
    }
}
