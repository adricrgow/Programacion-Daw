package Vista;

import Modelo.SeMatricula;
import java.util.List;
import java.util.Scanner;

public class SeMatriculaView {
    private Scanner sc = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n--- MENÚ SE_MATRICULA ---");
        System.out.println("1. Listar matrículas");
        System.out.println("2. Insertar matrícula");
        System.out.println("3. Actualizar matrícula");
        System.out.println("4. Eliminar matrícula");
        System.out.println("0. Salir");
        System.out.print("Opción: ");
        return sc.nextInt();
    }

    public void mostrarMatriculas(List<SeMatricula> lista) {
        System.out.println("\nLISTADO MATRÍCULAS:");
        for (SeMatricula s : lista) {
            System.out.println(s.getNumeroMatricula() + " - " + s.getIdCurso() + " - " + s.getCodigoAsignatura());
        }
    }

    public SeMatricula pedirNuevaMatricula() {
        System.out.print("Número matrícula: ");
        int nm = sc.nextInt();
        System.out.print("ID curso: ");
        int idc = sc.nextInt();
        System.out.print("Código asignatura: ");
        int ca = sc.nextInt();
        return new SeMatricula(nm, idc, ca);
    }

    public int[] pedirActualizar() {
        System.out.print("Número matrícula: ");
        int nm = sc.nextInt();
        System.out.print("ID curso: ");
        int idc = sc.nextInt();
        System.out.print("Código asignatura antiguo: ");
        int antiguo = sc.nextInt();
        System.out.print("Código asignatura nuevo: ");
        int nuevo = sc.nextInt();
        return new int[] { nm, idc, antiguo, nuevo };
    }

    public int[] pedirEliminar() {
        System.out.print("Número matrícula: ");
        int nm = sc.nextInt();
        System.out.print("ID curso: ");
        int idc = sc.nextInt();
        System.out.print("Código asignatura: ");
        int ca = sc.nextInt();
        return new int[] { nm, idc, ca };
    }

    public void mostrarMensaje(String msg) { System.out.println(msg); }
}
