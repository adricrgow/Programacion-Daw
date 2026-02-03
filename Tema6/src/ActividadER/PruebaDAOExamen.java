package ActividadER;

public class PruebaDAOExamen {
    public static void main(String[] args) {
        // Prueba ProfesorDAO

        ProfesorDAO.insertar(1, "12345678A", "Juan", "García", "López");
        ProfesorDAO.insertar(2, "87654321B", "María", "Rodríguez", "Martínez");
        ProfesorDAO.listar();
        ProfesorDAO.actualizar(1, "Pedro");
        System.out.println("Después de actualizar:");
        ProfesorDAO.listar();
        ProfesorDAO.borrar(2);
        System.out.println("Después de borrar:");
        ProfesorDAO.listar();
        
        // Prueba PracticaDAO

        PracticaDAO.insertar(1, "Práctica 1", "Fácil");
        PracticaDAO.insertar(2, "Práctica 2", "Media");
        PracticaDAO.listar();
        PracticaDAO.actualizar(1, "Práctica Actualizada");
        System.out.println("Después de actualizar:");
        PracticaDAO.listar();
        PracticaDAO.borrar(2);
        System.out.println("Después de borrar:");
        PracticaDAO.listar();
        
        // Prueba ExamenTeoricoDAO

        ExamenTeoricoDAO.insertar(1, "Examen Tema 1", 20, "2024-02-10");
        ExamenTeoricoDAO.insertar(2, "Examen Tema 2", 25, "2024-02-17");
        ExamenTeoricoDAO.listar();
        ExamenTeoricoDAO.actualizar(1, "Examen Tema 1 Revisado");
        System.out.println("Después de actualizar:");
        ExamenTeoricoDAO.listar();
        ExamenTeoricoDAO.borrar(2);
        System.out.println("Después de borrar:");
        ExamenTeoricoDAO.listar();
        
        // Prueba DiseñaExamenDAO

        DiseñaExamenDAO.insertar(1, 1, "2024-02-01");
        DiseñaExamenDAO.listar();
        DiseñaExamenDAO.actualizar(1, "2024-02-05");
        System.out.println("Después de actualizar:");
        DiseñaExamenDAO.listar();
        DiseñaExamenDAO.borrar(1);
        System.out.println("Después de borrar:");
        DiseñaExamenDAO.listar();
        
        // Prueba DiseñaPracticaDAO

        DiseñaPracticaDAO.insertar(1, 1, "2024-01-15");
        DiseñaPracticaDAO.listar();
        DiseñaPracticaDAO.actualizar(1, 1, "2024-01-20");
        System.out.println("Después de actualizar:");
        DiseñaPracticaDAO.listar();
        DiseñaPracticaDAO.borrar(1, 1);
        System.out.println("Después de borrar:");
        DiseñaPracticaDAO.listar();
    }

}
