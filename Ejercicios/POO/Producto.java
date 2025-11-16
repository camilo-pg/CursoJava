package Ejercicios.POO;

public class Producto {

    private String Fabricante;
    private String Nombre;
    private Double Precio;

    public Producto(String fabricante, String nombre, Double precio){
        this.Fabricante = fabricante;
        this.Nombre = nombre;
        this.Precio = precio;
    }

    public String getFabricante(){
        return this.Fabricante;
    }

    public String getNombre(){
        return this.Nombre;
    }

    public Double getPrecio(){
        return this.Precio;
    }

}
