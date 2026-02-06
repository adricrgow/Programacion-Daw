package ActividadER;

public class MainCursos {
    public static void main(String[] args) {
        // Prueba de ProfesorDAO
        System.out.println("Insertando profesores...");
        ProfesorDAO.insertar(1, "12345678A", "Juan", "García", "López");
        ProfesorDAO.insertar(2, "87654321B", "María", "Rodríguez", "Martínez");

        System.out.println("Listando profesores:");
        ProfesorDAO.listar();

        System.out.println("Actualizando profesor con id=1...");
        ProfesorDAO.actualizar(1, "Pedro");

        System.out.println("Listando profesores después de actualización:");
        ProfesorDAO.listar();

        System.out.println("Borrando profesor con id=2...");
        ProfesorDAO.borrar(2);

        System.out.println("Listando profesores después de borrado:");
        ProfesorDAO.listar();
    }
}
