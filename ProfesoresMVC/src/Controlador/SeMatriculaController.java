package Controlador;

import Modelo.SeMatriculaDAO;
import Vista.SeMatriculaView;

public class SeMatriculaController {
    private SeMatriculaDAO dao;
    private SeMatriculaView view;

    public SeMatriculaController() {
        dao = new SeMatriculaDAO();
        view = new SeMatriculaView();
    }

    public void iniciar() {
        int opcion;
        do {
            opcion = view.mostrarMenu();
            switch (opcion) {
                case 1:
                    view.mostrarMatriculas(dao.listar());
                    break;
                case 2:
                    dao.insertar(view.pedirNuevaMatricula());
                    view.mostrarMensaje("Matrícula insertada");
                    break;
                case 3: {
                    int[] data = view.pedirActualizar();
                    dao.actualizar(data[0], data[1], data[2], data[3]);
                    view.mostrarMensaje("Matrícula actualizada");
                    break;
                }
                case 4: {
                    int[] data = view.pedirEliminar();
                    dao.eliminar(data[0], data[1], data[2]);
                    view.mostrarMensaje("Matrícula eliminada");
                    break;
                }
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
