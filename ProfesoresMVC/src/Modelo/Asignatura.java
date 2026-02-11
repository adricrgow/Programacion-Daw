package Modelo;

public class Asignatura {
    private int codigo;
    private String nombre;
    private int numeroHoras;

    public Asignatura(int codigo, String nombre, int numeroHoras) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.numeroHoras = numeroHoras;
    }

    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public int getNumeroHoras() { return numeroHoras; }
    public void setNumeroHoras(int numeroHoras) { this.numeroHoras = numeroHoras; }
}
