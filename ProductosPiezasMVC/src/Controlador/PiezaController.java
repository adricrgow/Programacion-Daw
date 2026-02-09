package Controlador;

import Modelo.PiezaDAO;
import Modelo.Pieza;
import Vista.PiezaView;

public class PiezaController {

    private PiezaDAO dao;
    private PiezaView view;

    public PiezaController() {
        dao = new PiezaDAO();
        view = new PiezaView();
    }

    public void iniciar() {
        int opcion;
        do {
            opcion = view.mostrarMenu();
            switch (opcion) {
                case 1:
                    view.mostrarPiezas(dao.listar());
                    break;
                case 2: {
                    Pieza p = view.pedirNuevaPieza();
                    dao.insertar(p.getCodigo(), p.getNombre(), p.getColor(), p.getPrecio(), p.getCodigo_categoria());
                    view.mostrarMensaje("Pieza insertada");
                    break;
                }
                case 3: {
                    Pieza p = view.pedirPiezaActualizar();
                    dao.actualizar(p.getCodigo(), p.getNombre());
                    view.mostrarMensaje("Pieza actualizada");
                    break;
                }
                case 4: {
                    dao.borrar(view.pedirCodigoEliminar());
                    view.mostrarMensaje("Pieza eliminada");
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
