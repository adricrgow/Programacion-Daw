package Modelo;

public class Alumno {
    private int id;
    private String nif;
    private String grupo;
    private String nombre;
    private String apellido1;
    private String apellido2;

    public Alumno() {
    }

    public Alumno(int id, String nif, String grupo, String nombre, String apellido1, String apellido2) {
        this.id = id;
        this.nif = nif;
        this.grupo = grupo;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    @Override
    public String toString() {
        return id + " - " + nif + "-" + grupo + " - " + nombre + " " + apellido1 + " " + apellido2;
    }
}
