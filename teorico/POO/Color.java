package teorico.POO;

public enum Color {
    ROJO("Rojo"),
    AZUL("Azul"),
    VERDE("Verde"),
    AMARILLO("Amarillo"),
    GRIS("Gris"),;

    private final String color;

    Color(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

}
