import ActividadER.PiezaDAO;

public class ActividadER {
    public static void main(String[] args) {
        //insertar categoriaes
        // CategoriaDAO.insertar(1, "Electronica");
        // CategoriaDAO.insertar(2, "PEPe");
        // CategoriaDAO.insertar(3, "borrar");

        //Actualizar categoria
        // CategoriaDAO.actualizar(2, "Mecanica");

        //Borrar categoria
        // CategoriaDAO.borrar(3);

        //Listar categorias
        // CategoriaDAO.listar();

        //insertar piezas

        PiezaDAO.insertar(1, "Resistor", "Azul", 0.10, 1);
        PiezaDAO.insertar(2, "Capacitor", "Negro", 0.15, 2);
    }
}
