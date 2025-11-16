package Ejercicios.POO;

public class Cliente {

    private String Nombre;
    private String Apellido;

    public Cliente(String nombre, String apellido){
        this.Nombre = nombre;
        this.Apellido = apellido;
    }

    public String getNombre(){
        return this.Nombre;
    }

    public String getApellido(){
        return this.Apellido;
    }

    @Override
    public String toString() {
        return "Cliente: " + this.Nombre + " " + this.Apellido;
    }
}
