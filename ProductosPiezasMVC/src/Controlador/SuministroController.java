package Controlador;

import Modelo.SuministroDAO;
import Modelo.Suministro;
import Vista.SuministroView;

public class SuministroController {

    private SuministroDAO dao;
    private SuministroView view;

    public SuministroController() {
        dao = new SuministroDAO();
        view = new SuministroView();
    }

    public void iniciar() {
        int opcion;
        do {
            opcion = view.mostrarMenu();
            switch (opcion) {
                case 1:
                    view.mostrarSuministros(dao.listar());
                    break;
                case 2: {
                    Suministro s = view.pedirNuevoSuministro();
                    dao.insertar(s.getCodigo_proveedor(), s.getCodigo_pieza(), s.getCantidad(), s.getFecha());
                    view.mostrarMensaje("Suministro insertado");
                    break;
                }
                case 3: {
                    view.mostrarMensaje("Actualización de suministros no disponible");
                    break;
                }
                case 4: {
                    int codigo_proveedor = view.pedirCodigoProvedor();
                    int codigo_pieza = view.pedirCodigoPieza();
                    dao.borrar(codigo_proveedor, codigo_pieza);
                    view.mostrarMensaje("Suministro eliminado");
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
