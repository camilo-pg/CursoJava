package Ejercicios.POO;

import java.util.Date;

public class OrdenCompra {
    private Integer identificador;
    private String descripción;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos;
    private int indiceProductos;

    private static int ultimoIdentificador;

    public OrdenCompra(String descripción){
        this.descripción = descripción;
        this.productos = new Producto[4];
        this.identificador = ++ultimoIdentificador;
    }

    public Integer getIdentificador(){
        return identificador;
    }

    public String getDescripción() {
        return descripción;
    }

    public Date getFecha(){
        return fecha;
    }

    public void setFecha(Date fecha){
        this.fecha = fecha;
    }

    public Cliente getCliente(){
        return cliente;
    }

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public Producto[] getProductos(){
        return productos;
    }

    public void addProducto(Producto producto){
        if (indiceProductos < this.productos.length){
            this.productos[indiceProductos++] = producto;
        }
    }

    public Double totalCompra(Producto[] producto){
        Double total = 0.0;
        for ( Producto p : producto){
            if (p != null){
                total += p.getPrecio();
                
            }   
        }
        return total;
    }

    
    

}
