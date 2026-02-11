package Controlador;

import Modelo.ProfesorDAO;
import Vista.ProfesorView;

public class ProfesorController {
    private ProfesorDAO dao;
    private ProfesorView view;

    public ProfesorController() {
        dao = new ProfesorDAO();
        view = new ProfesorView();
    }

    public void iniciar() {
        int opcion;
        do {
            opcion = view.mostrarMenu();
            switch (opcion) {
                case 1:
                    view.mostrarProfesores(dao.listar());
                    break;
                case 2:
                    dao.insertar(view.pedirNuevoProfesor());
                    view.mostrarMensaje("Profesor insertado");
                    break;
                case 3:
                    dao.actualizar(view.pedirProfesorActualizar());
                    view.mostrarMensaje("Profesor actualizado");
                    break;
                case 4:
                    dao.eliminar(view.pedirIdEliminar());
                    view.mostrarMensaje("Profesor eliminado");
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
