package  modelo;

public class Libro {
    private String titulo;
    private int codigoLibro;
    private String editorial;
    private String genero;
    private double precio;
    private int codigoCompra;
    private String autor;

    public Libro(String titulo, int codigoLibro, String editorial, String genero, double precio, int codigoCompra,
            String autor) {
        this.titulo = titulo;
        this.codigoLibro = codigoLibro;
        this.editorial = editorial;
        this.genero = genero;
        this.precio = precio;
        this.codigoCompra = codigoCompra;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCodigoLibro() {
        return codigoLibro;
    }

    public void setCodigoLibro(int codigoLibro) {
        this.codigoLibro = codigoLibro;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCodigoCompra() {
        return codigoCompra;
    }

    public void setCodigoCompra(int codigoCompra) {
        this.codigoCompra = codigoCompra;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}