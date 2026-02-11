package Controlador;

import Modelo.CursoEscolarDAO;
import Vista.CursoEscolarView;

public class CursoEscolarController {
    private CursoEscolarDAO dao;
    private CursoEscolarView view;

    public CursoEscolarController() {
        dao = new CursoEscolarDAO();
        view = new CursoEscolarView();
    }

    public void iniciar() {
        int opcion;
        do {
            opcion = view.mostrarMenu();
            switch (opcion) {
                case 1:
                    view.mostrarCursos(dao.listar());
                    break;
                case 2:
                    dao.insertar(view.pedirNuevoCurso());
                    view.mostrarMensaje("Curso insertado");
                    break;
                case 3:
                    dao.actualizar(view.pedirCursoActualizar());
                    view.mostrarMensaje("Curso actualizado");
                    break;
                case 4:
                    dao.eliminar(view.pedirIdEliminar());
                    view.mostrarMensaje("Curso eliminado");
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
