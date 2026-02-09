package Controlador;

import Modelo.Categoria;
import Modelo.CategoriaDAO;
import Vista.CategoriaView;

public class CategoriaController {

    private CategoriaDAO dao;
    private CategoriaView view;

    public CategoriaController() {
        dao = new CategoriaDAO();
        view = new CategoriaView();
    }

    public void iniciar() {
        int opcion;
        do {
            opcion = view.mostrarMenu();
            switch (opcion) {
                case 1:
                    view.mostrarCategorias(dao.listar());
                    break;
                case 2: {
                    Categoria ejemplo = view.pedirNuevaCategoria();
                    dao.insertar((int)ejemplo.getCodigo(), ejemplo.getNombre());
                    view.mostrarMensaje("Categoria insertada");
                    break;
                }
                case 3: {
                    dao.actualizar(view.pedirCategoriaActualizar());
                    view.mostrarMensaje("Categoria actualizada");
                    break;
                }
                case 4: {
                    dao.borrar(view.pedirCodigoEliminar());
                    view.mostrarMensaje("Categoria eliminada");
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
