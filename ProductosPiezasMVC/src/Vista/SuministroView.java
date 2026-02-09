package Vista;

import Modelo.Suministro;
import java.util.List;
import java.util.Scanner;

public class SuministroView {

    private Scanner sc = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n--- MENÚ SUMINISTROS ---");
        System.out.println("1. Listar suministros");
        System.out.println("2. Insertar suministro");
        System.out.println("3. Actualizar suministro");
        System.out.println("4. Eliminar suministro");
        System.out.println("0. Salir");
        System.out.print("Opción: ");
        return sc.nextInt();
    }

    public void mostrarSuministros(List<Suministro> suministros) {
        System.out.println("\nLISTADO DE SUMINISTROS:");
        for (Suministro s : suministros) {
            System.out.println("Proveedor: " + s.getCodigo_proveedor() + " - Pieza: "
                    + s.getCodigo_pieza() + " - Cantidad: " + s.getCantidad() + " - Fecha: " + s.getFecha());
        }
    }

    public Suministro pedirNuevoSuministro() {
        sc.nextLine();
        System.out.print("Código Proveedor: ");
        int codigo_proveedor = sc.nextInt();
        System.out.print("Código Pieza: ");
        int codigo_pieza = sc.nextInt();
        System.out.print("Cantidad: ");
        int cantidad = sc.nextInt();
        sc.nextLine();
        System.out.print("Fecha (YYYY-MM-DD): ");
        String fecha = sc.nextLine();
        return new Suministro(codigo_proveedor, codigo_pieza, cantidad, fecha);
    }

    public int pedirCodigoProvedor() {
        System.out.print("Código Proveedor: ");
        return sc.nextInt();
    }

    public int pedirCodigoPieza() {
        System.out.print("Código Pieza: ");
        return sc.nextInt();
    }

    public void mostrarMensaje(String msg) {
        System.out.println(msg);
    }
}
