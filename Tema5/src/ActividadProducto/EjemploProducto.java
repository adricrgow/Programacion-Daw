package ActividadProducto;

public class EjemploProducto {
    public static void main(String[] args) {
        ProductoFisico producto1 = new ProductoFisico(5.0, 3.0, "PF001", "Libro", 20.0);
        ProductoDigital producto2 = new ProductoDigital("http://nosequeponer.com/productoD", 500.0, "PD001", "Ebook", 15.0);

        producto1.imprimeProducto();
        producto2.imprimeProducto();
    }
}
