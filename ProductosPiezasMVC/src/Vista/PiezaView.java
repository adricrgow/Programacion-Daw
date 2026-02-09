package Vista;

import Modelo.Pieza;
import java.util.List;
import java.util.Scanner;

public class PiezaView {

    private Scanner sc = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n--- MENÚ PIEZAS ---");
        System.out.println("1. Listar piezas");
        System.out.println("2. Insertar pieza");
        System.out.println("3. Actualizar pieza");
        System.out.println("4. Eliminar pieza");
        System.out.println("0. Salir");
        System.out.print("Opción: ");
        return sc.nextInt();
    }

    public void mostrarPiezas(List<Pieza> piezas) {
        System.out.println("\nLISTADO DE PIEZAS:");
        for (Pieza p : piezas) {
            System.out.println(p.getCodigo() + " - " + p.getNombre() + " - "
                    + p.getColor() + " - " + p.getPrecio() + "$ - Cat: " + p.getCodigo_categoria());
        }
    }

    public Pieza pedirNuevaPieza() {
        sc.nextLine();
        System.out.print("Código: ");
        int codigo = sc.nextInt();
        sc.nextLine();
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Color: ");
        String color = sc.nextLine();
        System.out.print("Precio: ");
        double precio = sc.nextDouble();
        System.out.print("Código Categoría: ");
        int codigo_categoria = sc.nextInt();
        return new Pieza(codigo, nombre, color, precio, codigo_categoria);
    }

    public Pieza pedirPiezaActualizar() {
        System.out.print("Código a modificar: ");
        int codigo = sc.nextInt();
        sc.nextLine();
        System.out.print("Nuevo nombre: ");
        String nombre = sc.nextLine();
        return new Pieza(codigo, nombre, "", 0, 0);
    }

    public int pedirCodigoEliminar() {
        System.out.print("Código a eliminar: ");
        return sc.nextInt();
    }

    public void mostrarMensaje(String msg) {
        System.out.println(msg);
    }
}
