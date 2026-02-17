package Controlador;

import Modelo.*;
import Vista.Diapositiva42view;

public class Diapositiva42Controlador {

    private AlumnoDAO alumnoDAO;
    private Diapositiva42view view;
    private DiseñaExamenDAO diseñaExamenDAO;
    private DiseñaPracticaDAO diseñaPracticaDAO;
    private HaceDAO haceDAO;
    private ExamenTeoricoDAO examenTeoricoDAO;
    private PracticaDAO practicaDAO;
    private ProfesorDAO profesorDAO;

    public Diapositiva42Controlador(AlumnoDAO alumnoDAO, DiseñaExamenDAO diseñaExamenDAO, ExamenTeoricoDAO examenTeoricoDAO, HaceDAO haceDAO, PracticaDAO practicaDAO, ProfesorDAO profesorDAO, Diapositiva42view view) {
        this.alumnoDAO = alumnoDAO;
        this.diseñaExamenDAO = diseñaExamenDAO;
        this.examenTeoricoDAO = examenTeoricoDAO;
        this.haceDAO = haceDAO;
        this.practicaDAO = practicaDAO;
        this.profesorDAO = profesorDAO;
        this.view = view;
    }
    
     public void iniciar() {
        int opcion;
        try{
            do {
                opcion = view.mostrarMenu();
                switch (opcion) {
                    case 1:
                        view.mostrarAlumnos(alumnoDAO.listar());
                        break;
                    case 2:
                        view.mostrarProfesores(profesorDAO.listar());
                        break;
                    case 3:
                        view.mostrarPracticas(practicaDAO.listar());
                        break;
                    case 4:
                        view.mostrarExamenes(examenTeoricoDAO.listar());
                        break;
                    case 5:
                        view.mostrarHaces(haceDAO.listar());
                        break;
                    case 6:
                        view.mostrarDiseñaExamenes(diseñaExamenDAO.listar());
                        break;
                    case 7:
                        view.mostrarDiseñaPracticas(DiseñaPracticaDAO.listar());
                        break;
                    case 8:
                        alumnoDAO.insertar(view.pedirNuevoAlumno());
                        break;
                    case 9:
                        profesorDAO.insertar(view.pedirNuevoProfesor());
                        break;
                    case 10:
                        practicaDAO.insertar(view.pedirNuevaPractica());
                        break;
                    case 11:
                        examenTeoricoDAO.insertar(view.pedirNuevoExamen());
                        break;
                    case 12:
                        haceDAO.insertar(view.pedirNuevoHace());
                        break;
                    case 13:
                        diseñaExamenDAO.insertar(view.pedirNuevoDiseñaExamen());
                        break;
                    case 14:
                        diseñaPracticaDAO.insertar(view.pedirNuevoDiseñaPractica());
                        break;
                    case 15:
                        alumnoDAO.borrar(view.pedirId());
                        break;
                    case 16:
                        profesorDAO.borrar(view.pedirId());
                        break;
                    case 17:
                        examenTeoricoDAO.borrar(view.pedirId());
                        break;
                    case 18:
                        practicaDAO.borrar(view.pedirId());
                        break;
                    case 19:
                        diseñaExamenDAO.borrar(view.pedirId());
                        break;
                    case 20:
                        diseñaPracticaDAO.borrar(view.pedirIdExamen(), view.pedirIdProfesor());
                        break;
                    case 21:
                        haceDAO.borrar(view.pedirIdAlumno(), view.pedirIdPractica());
                        break;
                    case 22:
                        alumnoDAO.actualizar(view.actualizar());
                        break;
                    case 23:
                        profesorDAO.actualizar(view.actualizarProfesor());
                        break;
                    case 24:
                        practicaDAO.actualizar(view.actualizarPractica());
                        break;
                    case 25:
                        examenTeoricoDAO.actualizar(view.actualizarExamen());
                        break;
                    case 26:
                        diseñaExamenDAO.actualizar(view.actualizarDiseñaExamen());
                        break;
                    case 27:
                        diseñaPracticaDAO.actualizar(view.actualizarDiseñaPractica());
                        break;
                    case 28:
                        haceDAO.actualizar(view.actualizarHace());
                        break;
                    case 0:
                }
            } while (opcion != 0);
        }catch(Exception e){
            System.err.println(e.getStackTrace());
        }
    }

}
