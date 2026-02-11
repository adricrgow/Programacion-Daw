package Controlador;

import Modelo.AlumnoDAO;
import Vista.AlumnoView;

public class AlumnoController {
    private AlumnoDAO dao;
    private AlumnoView view;

    public AlumnoController() {
        dao = new AlumnoDAO();
        view = new AlumnoView();
    }

    public void iniciar() {
        int opcion;
        do {
            opcion = view.mostrarMenu();
            switch (opcion) {
                case 1:
                    view.mostrarAlumnos(dao.listar());
                    break;
                case 2:
                    dao.insertar(view.pedirNuevoAlumno());
                    view.mostrarMensaje("Alumno insertado");
                    break;
                case 3:
                    dao.actualizar(view.pedirAlumnoActualizar());
                    view.mostrarMensaje("Alumno actualizado");
                    break;
                case 4:
                    dao.eliminar(view.pedirIdEliminar());
                    view.mostrarMensaje("Alumno eliminado");
                    break;
                case 0:
                    view.mostrarMensaje("Saliendo...");
                    break;
                default:
                    view.mostrarMensaje("Opción incorrecta");
                    break;
            }
        } while (opcion != 0);
    }
}
