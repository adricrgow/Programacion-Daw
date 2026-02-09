package Controlador;

import Modelo.ProvedorDAO;
import Modelo.Provedor;
import Vista.ProvedorView;

public class ProvedorController {

    private ProvedorDAO dao;
    private ProvedorView view;

    public ProvedorController() {
        dao = new ProvedorDAO();
        view = new ProvedorView();
    }

    public void iniciar() {
        int opcion;
        do {
            opcion = view.mostrarMenu();
            switch (opcion) {
                case 1:
                    view.mostrarProvedores(dao.listar());
                    break;
                case 2: {
                    Provedor pv = view.pedirNuevoProvedor();
                    dao.insertar(pv.getCodigo(), pv.getDireccion(), pv.getCiudad(), pv.getProvincia());
                    view.mostrarMensaje("Proveedor insertado");
                    break;
                }
                case 3: {
                    Provedor pv = view.pedirProvedorActualizar();
                    dao.actualizar(pv.getCodigo(), pv.getCiudad());
                    view.mostrarMensaje("Proveedor actualizado");
                    break;
                }
                case 4: {
                    dao.borrar(view.pedirCodigoEliminar());
                    view.mostrarMensaje("Proveedor eliminado");
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
