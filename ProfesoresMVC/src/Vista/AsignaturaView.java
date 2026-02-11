package Vista;

import Modelo.Asignatura;
import java.util.List;
import java.util.Scanner;

public class AsignaturaView {
    private Scanner sc = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n--- MENÚ ASIGNATURAS ---");
        System.out.println("1. Listar asignaturas");
        System.out.println("2. Insertar asignatura");
        System.out.println("3. Actualizar asignatura");
        System.out.println("4. Eliminar asignatura");
        System.out.println("0. Salir");
        System.out.print("Opción: ");
        return sc.nextInt();
    }

    public void mostrarAsignaturas(List<Asignatura> lista) {
        System.out.println("\nLISTADO ASIGNATURAS:");
        for (Asignatura a : lista) {
            System.out.println(a.getCodigo() + " - " + a.getNombre() + " - " + a.getNumeroHoras());
        }
    }

    public Asignatura pedirNuevaAsignatura() {
        sc.nextLine();
        System.out.print("Código: ");
        int codigo = sc.nextInt();
        sc.nextLine();
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Número horas: ");
        int nh = sc.nextInt();
        return new Asignatura(codigo, nombre, nh);
    }

    public Asignatura pedirAsignaturaActualizar() {
        System.out.print("Código a modificar: ");
        int codigo = sc.nextInt();
        sc.nextLine();
        System.out.print("Nuevo nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Nuevas horas: ");
        int nh = sc.nextInt();
        return new Asignatura(codigo, nombre, nh);
    }

    public int pedirIdEliminar() {
        System.out.print("Código a eliminar: ");
        return sc.nextInt();
    }

    public void mostrarMensaje(String msg) { System.out.println(msg); }
}
