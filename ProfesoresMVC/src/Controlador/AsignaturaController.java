package Controlador;

import Modelo.AsignaturaDAO;
import Vista.AsignaturaView;

public class AsignaturaController {
    private AsignaturaDAO dao;
    private AsignaturaView view;

    public AsignaturaController() {
        dao = new AsignaturaDAO();
        view = new AsignaturaView();
    }

    public void iniciar() {
        int opcion;
        do {
            opcion = view.mostrarMenu();
            switch (opcion) {
                case 1:
                    view.mostrarAsignaturas(dao.listar());
                    break;
                case 2:
                    dao.insertar(view.pedirNuevaAsignatura());
                    view.mostrarMensaje("Asignatura insertada");
                    break;
                case 3:
                    dao.actualizar(view.pedirAsignaturaActualizar());
                    view.mostrarMensaje("Asignatura actualizada");
                    break;
                case 4:
                    dao.eliminar(view.pedirIdEliminar());
                    view.mostrarMensaje("Asignatura eliminada");
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
