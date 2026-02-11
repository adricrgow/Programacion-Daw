package Vista;

import Modelo.Profesor;
import java.util.List;
import java.util.Scanner;

public class ProfesorView {

    private Scanner sc = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n--- MENÚ PROFESORES ---");
        System.out.println("1. Listar profesores");
        System.out.println("2. Insertar profesor");
        System.out.println("3. Actualizar profesor");
        System.out.println("4. Eliminar profesor");
        System.out.println("0. Salir");
        System.out.print("Opción: ");
        return sc.nextInt();
    }

    public void mostrarProfesores(List<Profesor> lista) {
        System.out.println("\nLISTADO PROFESORES:");
        for (Profesor p : lista) {
            System.out.println(p.getId() + " - " + p.getNombre() + " " + p.getApellido1() + " " + p.getApellido2()
                    + " - " + p.getEspecialidad() + " - " + p.getTelefono());
        }
    }

    public Profesor pedirNuevoProfesor() {
        sc.nextLine();
        System.out.print("ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Apellido1: ");
        String ap1 = sc.nextLine();
        System.out.print("Apellido2: ");
        String ap2 = sc.nextLine();
        System.out.print("Especialidad: ");
        String esp = sc.nextLine();
        System.out.print("Teléfono: ");
        String tel = sc.nextLine();
        return new Profesor(id, nombre, ap1, ap2, esp, tel);
    }

    public Profesor pedirProfesorActualizar() {
        System.out.print("ID a modificar: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Nuevo nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Nuevo apellido1: ");
        String ap1 = sc.nextLine();
        System.out.print("Nuevo apellido2: ");
        String ap2 = sc.nextLine();
        System.out.print("Nueva especialidad: ");
        String esp = sc.nextLine();
        System.out.print("Nuevo teléfono: ");
        String tel = sc.nextLine();
        return new Profesor(id, nombre, ap1, ap2, esp, tel);
    }

    public int pedirIdEliminar() {
        System.out.print("ID a eliminar: ");
        return sc.nextInt();
    }

    public void mostrarMensaje(String msg) {
        System.out.println(msg);
    }
}
