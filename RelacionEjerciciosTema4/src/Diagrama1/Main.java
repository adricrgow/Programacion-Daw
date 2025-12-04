package Diagrama1;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Almería", "1", "12345678A", "14/06/2007", "Adrian");
        Tarjeta tarjeta = new Tarjeta("1111-2222", "2026-12", "adr", "34", cliente);

        Sucursal sucursal = new Sucursal("S001", "Calle Mayor 10", "Almería");
        Empleado empleado = new Empleado("pio 12","Albox","14","29387412N","Albox","14/12/2025","1","Adrián","2",sucursal,"43243235");

        
        Fabrica fabrica = new Fabrica(2,"4","Pepe","Ruina","Pais");
        Producto producto = new Producto("P001","Verde",120.0, "Monitor 24" , fabrica);

        System.out.println("Cliente: " + cliente.nombre + " usa tarjeta " + tarjeta.nombre);
        System.out.println("Empleado: " + empleado.nombre + " trabaja en sucursal " + sucursal.ciudad);
        System.out.println("Producto: " + producto.descripcion + " fabricado por " + fabrica.nombre);
    
    }
}
