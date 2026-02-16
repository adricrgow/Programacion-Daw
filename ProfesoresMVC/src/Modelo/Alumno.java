package Modelo;

import java.time.LocalDate;

public class Alumno {
    private int numeroMatricula;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private LocalDate fechaNacimiento;
    private String telefono;

    public Alumno(int numeroMatricula, String nombre, String apellido1, String apellido2, String apellido12, String telefono) {
        this.numeroMatricula = numeroMatricula;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.fechaNacimiento = apellido12;
        this.telefono = telefono;
    }

    public int getNumeroMatricula() { return numeroMatricula; }
    public void setNumeroMatricula(int numeroMatricula) { this.numeroMatricula = numeroMatricula; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getApellido1() { return apellido1; }
    public void setApellido1(String apellido1) { this.apellido1 = apellido1; }
    public String getApellido2() { return apellido2; }
    public void setApellido2(String apellido2) { this.apellido2 = apellido2; }
    public LocalDate getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(LocalDate fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }
    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
}
