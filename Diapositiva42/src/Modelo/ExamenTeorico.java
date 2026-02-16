package Modelo;

public class ExamenTeorico {
    private int id;
    private String titulo;
    private int numeroPreguntas;
    private String fecha;

    public ExamenTeorico() {
    }

    public ExamenTeorico(int id, String titulo, int numeroPreguntas, String fecha) {
        this.id = id;
        this.titulo = titulo;
        this.numeroPreguntas = numeroPreguntas;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroPreguntas() {
        return numeroPreguntas;
    }

    public void setNumeroPreguntas(int numeroPreguntas) {
        this.numeroPreguntas = numeroPreguntas;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return id + " - " + titulo;
    }
}
