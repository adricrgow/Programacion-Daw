package Modelo;

public class Imparte {
    private int idProfesor;
    private int codigoAsignatura;

    public Imparte(int idProfesor, int codigoAsignatura) {
        this.idProfesor = idProfesor;
        this.codigoAsignatura = codigoAsignatura;
    }

    public int getIdProfesor() { return idProfesor; }
    public void setIdProfesor(int idProfesor) { this.idProfesor = idProfesor; }
    public int getCodigoAsignatura() { return codigoAsignatura; }
    public void setCodigoAsignatura(int codigoAsignatura) { this.codigoAsignatura = codigoAsignatura; }
}
