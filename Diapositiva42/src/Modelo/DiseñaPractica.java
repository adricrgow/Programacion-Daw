package Modelo;

public class DiseñaPractica {
    private int idPractica;
    private int idProfesor;
    private String fecha;

    public DiseñaPractica() {
    }

    public DiseñaPractica(int idPractica, int idProfesor, String fecha) {
        this.idPractica = idPractica;
        this.idProfesor = idProfesor;
        this.fecha = fecha;
    }

    public int getIdPractica() {
        return idPractica;
    }

    public void setIdPractica(int idPractica) {
        this.idPractica = idPractica;
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
        return idPractica + " - " + idProfesor;
    }
}
