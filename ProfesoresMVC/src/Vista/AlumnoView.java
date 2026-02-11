package Vista;

import Modelo.Alumno;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class AlumnoView {
    private Scanner sc = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n--- MENÚ ALUMNOS ---");
        System.out.println("1. Listar alumnos");
        System.out.println("2. Insertar alumno");
        System.out.println("3. Actualizar alumno");
        System.out.println("4. Eliminar alumno");
        System.out.println("0. Salir");
        System.out.print("Opción: ");
        return sc.nextInt();
    }

    public void mostrarAlumnos(List<Alumno> lista) {
        System.out.println("\nLISTADO ALUMNOS:");
        for (Alumno a : lista) {
            System.out.println(a.getNumeroMatricula() + " - " + a.getNombre() + " " + a.getApellido1() + " " + a.getApellido2() + " - " + a.getFechaNacimiento() + " - " + a.getTelefono());
        }
    }

    public Alumno pedirNuevoAlumno() {
        sc.nextLine();
        System.out.print("Número matrícula: ");
        int nm = sc.nextInt();
        sc.nextLine();
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Apellido1: ");
        String ap1 = sc.nextLine();
        System.out.print("Apellido2: ");
        String ap2 = sc.nextLine();
        System.out.print("Fecha nacimiento (YYYY-MM-DD): ");
        String fecha = sc.nextLine();
        System.out.print("Teléfono: ");
        String tel = sc.nextLine();
        LocalDate ld = fecha.isBlank() ? null : LocalDate.parse(fecha);
        return new Alumno(nm, nombre, ap1, ap2, ld, tel);
    }

    public Alumno pedirAlumnoActualizar() {
        System.out.print("Número matrícula a modificar: ");
        int nm = sc.nextInt();
        sc.nextLine();
        System.out.print("Nuevo nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Nuevo apellido1: ");
        String ap1 = sc.nextLine();
        System.out.print("Nuevo apellido2: ");
        String ap2 = sc.nextLine();
        System.out.print("Nueva fecha nacimiento (YYYY-MM-DD): ");
        String fecha = sc.nextLine();
        System.out.print("Nuevo teléfono: ");
        String tel = sc.nextLine();
        LocalDate ld = fecha.isBlank() ? null : LocalDate.parse(fecha);
        return new Alumno(nm, nombre, ap1, ap2, ld, tel);
    }

    public int pedirIdEliminar() {
        System.out.print("Número matrícula a eliminar: ");
        return sc.nextInt();
    }

    public void mostrarMensaje(String msg) { System.out.println(msg); }
}
