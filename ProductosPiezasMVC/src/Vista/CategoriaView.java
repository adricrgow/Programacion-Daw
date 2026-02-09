package Vista;

import Modelo.Categoria;
import java.util.List;
import java.util.Scanner;

public class CategoriaView {

    private Scanner sc = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n--- MENÚ CATEGORÍAS ---");
        System.out.println("1. Listar categorías");
        System.out.println("2. Insertar categoría");
        System.out.println("3. Actualizar categoría");
        System.out.println("4. Eliminar categoría");
        System.out.println("0. Salir");
        System.out.print("Opción: ");
        return sc.nextInt();
    }

    public void mostrarCategorias(List<Categoria> categorias) {
        System.out.println("\nLISTADO DE CATEGORÍAS:");
        for (Categoria c : categorias) {
            System.out.println(c.getCodigo() + " - " + c.getNombre());
        }
    }

    public Categoria pedirNuevaCategoria() {
        sc.nextLine();
        System.out.print("Código: ");
        int codigo = sc.nextInt();
        sc.nextLine();
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        return new Categoria(codigo, nombre);
    }

    public Categoria pedirCategoriaActualizar() {
        System.out.print("Código a modificar: ");
        int codigo = sc.nextInt();
        sc.nextLine();
        System.out.print("Nuevo nombre: ");
        String nombre = sc.nextLine();
        return new Categoria(codigo, nombre);
    }

    public int pedirCodigoEliminar() {
        System.out.print("Código a eliminar: ");
        return sc.nextInt();
    }

    public void mostrarMensaje(String msg) {
        System.out.println(msg);
    }
}
