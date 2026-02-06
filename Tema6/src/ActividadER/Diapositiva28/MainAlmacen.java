package ActividadER.Diapositiva28;

public class MainAlmacen {
    public static void main(String[] args) {
        // Prueba de ProvinciaDAO
        System.out.println("Insertando provincias...");
        ProvinciaDAO.insertar(1, "Madrid");
        ProvinciaDAO.insertar(2, "Barcelona");
        ProvinciaDAO.insertar(3, "Valencia");

        System.out.println("Listando provincias:");
        ProvinciaDAO.listar();

        System.out.println("Actualizando provincia con id=2...");
        ProvinciaDAO.actualizar(2, "Barcelona Actualizada");

        System.out.println("Listando provincias después de actualización:");
        ProvinciaDAO.listar();

        System.out.println("Borrando provincia con id=3...");
        ProvinciaDAO.borrar(3);

        System.out.println("Listando provincias después de borrado:");
        ProvinciaDAO.listar();
    }
}
