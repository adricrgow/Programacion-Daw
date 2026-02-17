package Vista;

import Modelo.Alumno;
import Modelo.DiseñaExamen;
import Modelo.DiseñaPractica;
import Modelo.ExamenTeorico;
import Modelo.Hace;
import Modelo.Practica;
import Modelo.Profesor2;
import java.util.List;
import java.util.Scanner;

public class Diapositiva42view {
    private Scanner sc = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n--- MENÚ PRINCIPAL ---");
        System.out.println("1. Listar Alumnos");
        System.out.println("2. Listar Profesores");
        System.out.println("3. Listar Exámenes Teóricos");
        System.out.println("4. Listar Prácticas");
        System.out.println("5. Listar Diseña Examen");
        System.out.println("6. Listar Diseña Práctica");
        System.out.println("7. Listar Hace");
        System.out.println("8. Insertar Alumno");
        System.out.println("9. Insertar Profesor");
        System.out.println("10. Insertar Examen Teórico");
        System.out.println("11. Insertar Práctica");
        System.out.println("12. Insertar Diseña Examen");
        System.out.println("13. Insertar Diseña Práctica");
        System.out.println("14. Insertar Hace");
        System.out.println("15. Eliminar Alumno");
        System.out.println("16. Eliminar Profesor");
        System.out.println("17. Eliminar Examen Teórico");
        System.out.println("18. Eliminar Práctica");
        System.out.println("19. Eliminar Diseña Examen");
        System.out.println("20. Eliminar Diseña Práctica");
        System.out.println("21. Eliminar Hace");
        System.out.println("22. Actualizar Alumno");
        System.out.println("23. Actualizar Profesor");
        System.out.println("24. Actualizar Examen Teórico");
        System.out.println("25. Actualizar Práctica");
        System.out.println("26. Actualizar Diseña Examen");
        System.out.println("27. Actualizar Diseña Práctica");
        System.out.println("28. Actualizar Hace");
        System.out.println("0. Salir");
        System.out.print("Opción: ");
        return sc.nextInt();
    }

    // --- MÉTODOS PARA MOSTRAR LISTAS ---
    public void mostrarAlumnos(List<Alumno> alumnos) {
        System.out.println("\n--- LISTADO DE ALUMNOS ---");
        if (alumnos.isEmpty()) {
            System.out.println("No hay alumnos registrados.");
        } else {
            for (Alumno a : alumnos) {
                System.out.println(a.getId() + " - " + a.getNif() + " - " + a.getGrupo() + " - " + a.getNombre() + " " + a.getApellido1() + " " + a.getApellido2());
            }
        }
    }

    public void mostrarProfesores(List<Profesor2> profesores) {
        System.out.println("\n--- LISTADO DE PROFESORES ---");
        if (profesores.isEmpty()) {
            System.out.println("No hay profesores registrados.");
        } else {
            for (Profesor2 p : profesores) {
                System.out.println(p.getId() + " - " + p.getNif() + " - " + p.getNombre() + " " + p.getApellido1() + " " + p.getApellido2());
            }
        }
    }

    public void mostrarExamenes(List<ExamenTeorico> examenes) {
        System.out.println("\n--- LISTADO DE EXÁMENES TEÓRICOS ---");
        if (examenes.isEmpty()) {
            System.out.println("No hay exámenes registrados.");
        } else {
            for (ExamenTeorico e : examenes) {
                System.out.println(e.getId() + " - " + e.getTitulo() + " - " + 
                                   e.getNumeroPreguntas() + " preguntas - " + e.getFecha());
            }
        }
    }

    public void mostrarPracticas(List<Practica> practicas) {
        System.out.println("\n--- LISTADO DE PRÁCTICAS ---");
        if (practicas.isEmpty()) {
            System.out.println("No hay prácticas registradas.");
        } else {
            for (Practica p : practicas) {
                System.out.println(p.getId() + " - " + p.getTitulo() + " - Dificultad: " + p.getDificultad());
            }
        }
    }

    public void mostrarDiseñaExamenes(List<DiseñaExamen> diseñas) {
        System.out.println("\n--- LISTADO DE DISEÑA EXAMEN ---");
        if (diseñas.isEmpty()) {
            System.out.println("No hay registros de diseña examen.");
        } else {
            for (DiseñaExamen d : diseñas) {
                System.out.println("Examen " + d.getIdExamen() + " - Profesor " + d.getIdProfesor() + " - Fecha: " + d.getFecha());
            }
        }
    }

    public void mostrarDiseñaPracticas(List<DiseñaPractica> diseñas) {
        System.out.println("\n--- LISTADO DE DISEÑA PRÁCTICA ---");
        if (diseñas.isEmpty()) {
            System.out.println("No hay registros de diseña práctica.");
        } else {
            for (DiseñaPractica d : diseñas) {
                System.out.println("Práctica " + d.getIdPractica() + " - Profesor " + d.getIdProfesor() + " - Fecha: " + d.getFecha());
            }
        }
    }

    public void mostrarHaces(List<Hace> haces) {
        System.out.println("\n--- LISTADO DE HACE (Alumnos-Exámenes) ---");
        if (haces.isEmpty()) {
            System.out.println("No hay registros de hace.");
        } else {
            for (Hace h : haces) {
                System.out.println("Alumno " + h.getIdAlumno() + " - Examen " + h.getIdExamen() + " - Nota: " + h.getNota());
            }
        }
    }

    // --- MÉTODOS PARA PEDIR DATOS ---
    public Alumno pedirNuevoAlumno() {
        sc.nextLine();
        System.out.print("ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("NIF: ");
        String nif = sc.nextLine();
        System.out.print("Grupo: ");
        String grupo = sc.nextLine();
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Primer Apellido: ");
        String apellido1 = sc.nextLine();
        System.out.print("Segundo Apellido: ");
        String apellido2 = sc.nextLine();
        return new Alumno(id, nif, grupo, nombre, apellido1, apellido2);
    }

    public Profesor2 pedirNuevoProfesor() {
        sc.nextLine();
        System.out.print("ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("NIF: ");
        String nif = sc.nextLine();
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Primer Apellido: ");
        String apellido1 = sc.nextLine();
        System.out.print("Segundo Apellido: ");
        String apellido2 = sc.nextLine();
        return new Profesor2(id, nif, nombre, apellido1, apellido2);
    }

    public ExamenTeorico pedirNuevoExamen() {
        sc.nextLine();
        System.out.print("ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Título: ");
        String titulo = sc.nextLine();
        System.out.print("Número de Preguntas: ");
        int numeroPreguntas = sc.nextInt();
        sc.nextLine();
        System.out.print("Fecha (YYYY-MM-DD): ");
        String fecha = sc.nextLine();
        return new ExamenTeorico(id, titulo, numeroPreguntas, fecha);
    }

    public Practica pedirNuevaPractica() {
        sc.nextLine();
        System.out.print("ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Título: ");
        String titulo = sc.nextLine();
        System.out.print("Dificultad: ");
        String dificultad = sc.nextLine();
        return new Practica(id, titulo, dificultad);
    }

    public DiseñaExamen pedirNuevoDiseñaExamen() {
        sc.nextLine();
        System.out.print("ID Examen: ");
        int idExamen = sc.nextInt();
        System.out.print("ID Profesor: ");
        int idProfesor = sc.nextInt();
        sc.nextLine();
        System.out.print("Fecha (YYYY-MM-DD): ");
        String fecha = sc.nextLine();
        return new DiseñaExamen(idExamen, idProfesor, fecha);
    }

    public DiseñaPractica pedirNuevoDiseñaPractica() {
        sc.nextLine();
        System.out.print("ID Práctica: ");
        int idPractica = sc.nextInt();
        System.out.print("ID Profesor: ");
        int idProfesor = sc.nextInt();
        sc.nextLine();
        System.out.print("Fecha (YYYY-MM-DD): ");
        String fecha = sc.nextLine();
        return new DiseñaPractica(idPractica, idProfesor, fecha);
    }

    public Hace pedirNuevoHace() {
        sc.nextLine();
        System.out.print("ID Alumno: ");
        int idAlumno = sc.nextInt();
        System.out.print("ID Examen: ");
        int idExamen = sc.nextInt();
        System.out.print("Nota: ");
        double nota = sc.nextDouble();
        return new Hace(idAlumno, idExamen, nota);
    }

    public Alumno actualizar(){
        sc.nextLine();
        System.out.print("ID del alumno a actualizar: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Nuevo Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Nuevo Primer Apellido: ");
        String apellido1 = sc.nextLine();
        System.out.print("Nuevo Segundo Apellido: ");
        String apellido2 = sc.nextLine();
        return new Alumno(id, null, null, nombre, apellido1, apellido2);
    }

    public Profesor2 actualizarProfesor(){
        sc.nextLine();
        System.out.print("ID del profesor a actualizar: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Nuevo Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Nuevo Primer Apellido: ");
        String apellido1 = sc.nextLine();
        System.out.print("Nuevo Segundo Apellido: ");
        String apellido2 = sc.nextLine();
        return new Profesor2(id, null, nombre, apellido1, apellido2);
    }

    public ExamenTeorico actualizarExamen(){
        sc.nextLine();
        System.out.print("ID del examen a actualizar: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Nuevo Título: ");
        String titulo = sc.nextLine();
        System.out.print("Nuevo Número de Preguntas: ");
        int numeroPreguntas = sc.nextInt();
        sc.nextLine();
        System.out.print("Nueva Fecha (YYYY-MM-DD): ");
        String fecha = sc.nextLine();
        return new ExamenTeorico(id, titulo, numeroPreguntas, fecha);
    }

    public Practica actualizarPractica(){
        sc.nextLine();
        System.out.print("ID de la práctica a actualizar: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Nuevo Título: ");
        String titulo = sc.nextLine();
        System.out.print("Nueva Dificultad: ");
        String dificultad = sc.nextLine();
        return new Practica(id, titulo, dificultad);
    }

    public DiseñaExamen actualizarDiseñaExamen(){
        sc.nextLine();
        System.out.print("ID del examen a actualizar: ");
        int idExamen = sc.nextInt();
        System.out.print("ID del profesor a actualizar: ");
        int idProfesor = sc.nextInt();
        sc.nextLine();
        System.out.print("Nueva Fecha (YYYY-MM-DD): ");
        String fecha = sc.nextLine();
        return new DiseñaExamen(idExamen, idProfesor, fecha);
    }
    public DiseñaPractica actualizarDiseñaPractica(){
        sc.nextLine();
        System.out.print("ID de la práctica a actualizar: ");
        int idPractica = sc.nextInt();
        System.out.print("ID del profesor a actualizar: ");
        int idProfesor = sc.nextInt();
        sc.nextLine();
        System.out.print("Nueva Fecha (YYYY-MM-DD): ");
        String fecha = sc.nextLine();
        return new DiseñaPractica(idPractica, idProfesor, fecha);
    }
    public Hace actualizarHace(){
        sc.nextLine();
        System.out.print("ID del alumno a actualizar: ");
        int idAlumno = sc.nextInt();
        System.out.print("ID del examen a actualizar: ");
        int idExamen = sc.nextInt();
        System.out.print("Nueva Nota: ");
        double nota = sc.nextDouble();
        return new Hace(idAlumno, idExamen, nota);
    }
    // --- MÉTODOS DE UTILIDAD ---
    public int pedirId() {
        System.out.print("ID: ");
        return sc.nextInt();
    }

    public int pedirIdAlumno() {
        System.out.print("ID Alumno: ");
        return sc.nextInt();
    }

    public int pedirIdProfesor() {
        System.out.print("ID Profesor: ");
        return sc.nextInt();
    }

    public int pedirIdExamen() {
        System.out.print("ID Examen: ");
        return sc.nextInt();
    }

    public int pedirIdPractica() {
        System.out.print("ID Práctica: ");
        return sc.nextInt();
    }

    public void mostrarMensaje(String msg) {
        System.out.println(msg);
    }

    public String pedirNuevoNombre() {
        sc.nextLine();
        System.out.print("Nuevo Nombre: ");
        return sc.nextLine();
    }
    public String pedirNuevoApellido1() {
        System.out.print("Nuevo Primer Apellido: ");
        return sc.nextLine();
    }
    public String pedirNuevoApellido2() {
        System.out.print("Nuevo Segundo Apellido: ");
        return sc.nextLine();
    }

}
