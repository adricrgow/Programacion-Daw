package Modelo;

public class DiseñaExamen {
    private int idExamen;
    private int idProfesor;
    private String fecha;

    public DiseñaExamen() {
    }

    public DiseñaExamen(int idExamen, int idProfesor, String fecha) {
        this.idExamen = idExamen;
        this.idProfesor = idProfesor;
        this.fecha = fecha;
    }

    public int getIdExamen() {
        return idExamen;
    }

    public void setIdExamen(int idExamen) {
        this.idExamen = idExamen;
    }

    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return idExamen + " - " + idProfesor;
    }
}
