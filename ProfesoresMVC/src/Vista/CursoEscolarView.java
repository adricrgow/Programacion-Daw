package Vista;

import Modelo.CursoEscolar;
import java.util.List;
import java.util.Scanner;

public class CursoEscolarView {
    private Scanner sc = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n--- MENÚ CURSOS ESCOLARES ---");
        System.out.println("1. Listar cursos");
        System.out.println("2. Insertar curso");
        System.out.println("3. Actualizar curso");
        System.out.println("4. Eliminar curso");
        System.out.println("0. Salir");
        System.out.print("Opción: ");
        return sc.nextInt();
    }

    public void mostrarCursos(List<CursoEscolar> lista) {
        System.out.println("\nLISTADO CURSOS:");
        for (CursoEscolar c : lista) {
            System.out.println(c.getId() + " - " + c.getAnoInicio() + " / " + c.getAnoFin());
        }
    }

    public CursoEscolar pedirNuevoCurso() {
        sc.nextLine();
        System.out.print("ID: ");
        int id = sc.nextInt();
        System.out.print("Año inicio: ");
        int ai = sc.nextInt();
        System.out.print("Año fin: ");
        int af = sc.nextInt();
        return new CursoEscolar(id, ai, af);
    }

    public CursoEscolar pedirCursoActualizar() {
        System.out.print("ID a modificar: ");
        int id = sc.nextInt();
        System.out.print("Nuevo año inicio: ");
        int ai = sc.nextInt();
        System.out.print("Nuevo año fin: ");
        int af = sc.nextInt();
        return new CursoEscolar(id, ai, af);
    }

    public int pedirIdEliminar() {
        System.out.print("ID a eliminar: ");
        return sc.nextInt();
    }

    public void mostrarMensaje(String msg) { System.out.println(msg); }
}
