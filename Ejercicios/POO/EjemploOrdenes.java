package Ejercicios.POO;

import java.util.Date;

public class EjemploOrdenes {

    public static void main(String[] args) {
        // Crear 3 Ordenes
        OrdenCompra orden1 = new OrdenCompra("Compra de Almacen");
        OrdenCompra orden2 = new OrdenCompra("Compra de Farmacia");
        OrdenCompra orden3 = new OrdenCompra("Compra de Ferreteria");

        orden1.setCliente(new Cliente("Juan","Moral"));
        orden1.setFecha(new Date());
        orden1.addProducto(new Producto("Playadito","Yerba", 8.500));
        orden1.addProducto(new Producto("Fargo","Azucar", 3.200));
        orden1.addProducto(new Producto("Luketti","Fideos", 4.100));
        orden1.addProducto(new Producto("Molinos","Arroz",2.500));

        orden2.setCliente(new Cliente("Ana","Gonzalez"));
        orden2.setFecha(new Date());
        orden2.addProducto(new Producto("Bayer","Aspirina", 5.500));
        orden2.addProducto(new Producto("GSK","Paracetamol", 4.200));
        orden2.addProducto(new Producto("Roemmers","Ibuprofeno", 6.100));

        orden3.setCliente(new Cliente("Luis","Ramirez"));
        orden3.setFecha(new Date());
        orden3.addProducto(new Producto("Ferrari","Taladro", 55.500));
        orden3.addProducto(new Producto("Black & Decker","Lijadora", 45.200));
        orden3.addProducto(new Producto("Dewalt","Sierra Circular", 60.100));
        orden3.addProducto(new Producto("Bosch","Aspiradora", 75.500));

        
        
        // Imprimir los detalles de las Ordenes
        OrdenCompra[] ordenesCompras = {orden1, orden2, orden3};
        for (OrdenCompra od : ordenesCompras) {
            System.out.println("Orden N°: " + od.getIdentificador() + " - " + od.getDescripción());
        System.out.println(od.getCliente().toString());
        System.out.println("Fecha: " + od.getFecha());
        System.out.println("PRODUCTOS DE LA ORDEN:");
        for (Producto p : od.getProductos()){
            if (p != null){
                System.out.println( "Producto: " + p.getNombre() +
                    ", Precio: " + p.getPrecio() +
                    ", Fabricante: " + p.getFabricante());

            }
            
        }
        System.out.println("Total de la compra: $" + od.totalCompra(od.getProductos()));
        System.out.println("--------------------------------------------------");
        }

    }
}
