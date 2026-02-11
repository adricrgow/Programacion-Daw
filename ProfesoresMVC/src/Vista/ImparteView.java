package Vista;

import Modelo.Imparte;
import java.util.List;
import java.util.Scanner;

public class ImparteView {
    private Scanner sc = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n--- MENÚ IMPARTE ---");
        System.out.println("1. Listar imparte");
        System.out.println("2. Insertar imparte");
        System.out.println("3. Actualizar imparte");
        System.out.println("4. Eliminar imparte");
        System.out.println("0. Salir");
        System.out.print("Opción: ");
        return sc.nextInt();
    }

    public void mostrarImparte(List<Imparte> lista) {
        System.out.println("\nLISTADO IMPARTE:");
        for (Imparte i : lista) {
            System.out.println(i.getIdProfesor() + " - " + i.getCodigoAsignatura());
        }
    }

    public Imparte pedirNuevoImparte() {
        System.out.print("ID profesor: ");
        int id = sc.nextInt();
        System.out.print("Código asignatura: ");
        int ca = sc.nextInt();
        return new Imparte(id, ca);
    }

    public int[] pedirActualizar() {
        System.out.print("ID profesor: ");
        int id = sc.nextInt();
        System.out.print("Código asignatura antiguo: ");
        int antiguo = sc.nextInt();
        System.out.print("Código asignatura nuevo: ");
        int nuevo = sc.nextInt();
        return new int[] { id, antiguo, nuevo };
    }

    public int[] pedirEliminar() {
        System.out.print("ID profesor: ");
        int id = sc.nextInt();
        System.out.print("Código asignatura: ");
        int ca = sc.nextInt();
        return new int[] { id, ca };
    }

    public void mostrarMensaje(String msg) { System.out.println(msg); }
}
