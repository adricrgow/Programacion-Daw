package ActividadER;

import java.sql.Date;

public class MainPrueba {
    public static void main(String[] args) {
        
        System.out.println("===== PRUEBA SUCURSAL =====");
        SucursalDAO.insertar(1, "912345678", "Calle Principal 10", "Madrid", "Madrid");
        SucursalDAO.insertar(2, "913456789", "Calle Secundaria 20", "Barcelona", "Barcelona");
        SucursalDAO.listar();
        System.out.println("--- Actualizar sucursal 1 ---");
        SucursalDAO.actualizar(1, "987654321", "Avenida Nueva 15", "Sevilla", "Sevilla");
        SucursalDAO.listar();
        
        EmpleadoDAO.insertar(1, "12345678A", "Juan", "García", "López", "600123456", 1);
        EmpleadoDAO.insertar(2, "87654321B", "María", "Rodríguez", "Martínez", "600654321", 2);
        EmpleadoDAO.listar();
        System.out.println("--- Actualizar empleado 1 ---");
        EmpleadoDAO.actualizar(1, "699999999", 2);
        EmpleadoDAO.listar();
        
        PeriodismoDAO.insertar(1, "Carlos", "Pérez", "García", "600111111", "Deportes");
        PeriodismoDAO.insertar(2, "Laura", "Sánchez", "Ruiz", "600222222", "Política");
        PeriodismoDAO.listar();
        System.out.println("--- Actualizar periodista 1 ---");
        PeriodismoDAO.actualizar(1, "699777777", "Tecnología");
        PeriodismoDAO.listar();
        
        System.out.println("\n===== PRUEBA REVISTA =====");
        RevistaDAO.insertar(1, "El Mundo", "Periódico", "Diaria");
        RevistaDAO.insertar(2, "Microsiervos", "Revista", "Semanal");
        RevistaDAO.listar();
        System.out.println("--- Actualizar revista 1 ---");
        RevistaDAO.actualizar(1, "El Mundo Digital", "Periódico", "Diaria");
        RevistaDAO.listar();
        
        System.out.println("\n===== PRUEBA SECCION =====");
        SeccionDAO.insertar(1, "Portada", 5, 1);
        SeccionDAO.insertar(2, "Noticias", 20, 1);
        SeccionDAO.listar();
        System.out.println("--- Actualizar sección 1 ---");
        SeccionDAO.actualizar(1, "Portada Especial", 10, 1);
        SeccionDAO.listar();
        
        System.out.println("\n===== PRUEBA EJEMPLAR =====");
        EjemplarDAO.insertar(1, Date.valueOf("2026-02-06"), 48, 5000, 1);
        EjemplarDAO.insertar(2, Date.valueOf("2026-02-07"), 50, 4500, 2);
        EjemplarDAO.listar();
        System.out.println("--- Actualizar ejemplar 1 ---");
        EjemplarDAO.actualizar(1, Date.valueOf("2026-02-10"), 52, 6000);
        EjemplarDAO.listar();
        
        System.out.println("\n===== PRUEBA SUCURSAL PUBLICA REVISTA (N:N) =====");
        SucursalPublicaRevistaDAO.insertar(1, 1);
        SucursalPublicaRevistaDAO.insertar(1, 2);
        SucursalPublicaRevistaDAO.insertar(2, 1);
        SucursalPublicaRevistaDAO.listar();
        System.out.println("--- Actualizar relación sucursal-revista ---");
        SucursalPublicaRevistaDAO.actualizar(2, 1, 2, 2);
        SucursalPublicaRevistaDAO.listar();
        
        System.out.println("\n===== PRUEBA ESCRIBE (N:N) =====");
        EscribeDAO.insertar(1, 1);
        EscribeDAO.insertar(2, 1);
        EscribeDAO.insertar(1, 2);
        EscribeDAO.listar();
        System.out.println("--- Actualizar relación periodista-revista ---");
        EscribeDAO.actualizar(2, 1, 2, 2);
        EscribeDAO.listar();
        
        System.out.println("\n===== PRUEBA DELETE =====");
        System.out.println("--- Borrar un ejemplar ---");
        EjemplarDAO.borrar(2);
        EjemplarDAO.listar();
        
        System.out.println("\n===== FIN DE PRUEBAS =====");
    }
}
