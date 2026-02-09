package Vista;

import Modelo.Provedor;
import java.util.List;
import java.util.Scanner;

public class ProvedorView {

    private Scanner sc = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n--- MENÚ PROVEEDORES ---");
        System.out.println("1. Listar proveedores");
        System.out.println("2. Insertar proveedor");
        System.out.println("3. Actualizar proveedor");
        System.out.println("4. Eliminar proveedor");
        System.out.println("0. Salir");
        System.out.print("Opción: ");
        return sc.nextInt();
    }

    public void mostrarProvedores(List<Provedor> provedores) {
        System.out.println("\nLISTADO DE PROVEEDORES:");
        for (Provedor pv : provedores) {
            System.out.println(pv.getCodigo() + " - " + pv.getDireccion() + " - "
                    + pv.getCiudad() + " - " + pv.getProvincia());
        }
    }

    public Provedor pedirNuevoProvedor() {
        sc.nextLine();
        System.out.print("Código: ");
        int codigo = sc.nextInt();
        sc.nextLine();
        System.out.print("Dirección: ");
        String direccion = sc.nextLine();
        System.out.print("Ciudad: ");
        String ciudad = sc.nextLine();
        System.out.print("Provincia: ");
        String provincia = sc.nextLine();
        return new Provedor(codigo, direccion, ciudad, provincia);
    }

    public Provedor pedirProvedorActualizar() {
        System.out.print("Código a modificar: ");
        int codigo = sc.nextInt();
        sc.nextLine();
        System.out.print("Nueva ciudad: ");
        String ciudad = sc.nextLine();
        return new Provedor(codigo, "", ciudad, "");
    }

    public int pedirCodigoEliminar() {
        System.out.print("Código a eliminar: ");
        return sc.nextInt();
    }

    public void mostrarMensaje(String msg) {
        System.out.println(msg);
    }
}
