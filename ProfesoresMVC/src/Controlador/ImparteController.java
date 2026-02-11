package Controlador;

import Modelo.ImparteDAO;
import Vista.ImparteView;

public class ImparteController {
    private ImparteDAO dao;
    private ImparteView view;

    public ImparteController() {
        dao = new ImparteDAO();
        view = new ImparteView();
    }

    public void iniciar() {
        int opcion;
        do {
            opcion = view.mostrarMenu();
            switch (opcion) {
                case 1:
                    view.mostrarImparte(dao.listar());
                    break;
                case 2:
                    dao.insertar(view.pedirNuevoImparte());
                    view.mostrarMensaje("Imparte insertado");
                    break;
                case 3: {
                    int[] data = view.pedirActualizar();
                    dao.actualizar(data[0], data[1], data[2]);
                    view.mostrarMensaje("Imparte actualizado");
                    break;
                }
                case 4: {
                    int[] data = view.pedirEliminar();
                    dao.eliminar(data[0], data[1]);
                    view.mostrarMensaje("Imparte eliminado");
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
