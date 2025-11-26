package actividadbiblioteca;

import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private int codigo;
    private ArrayList<Libro> librosPrestados;

    public Usuario(){librosPrestados=new ArrayList<>();}
    public Usuario(String nombre, int codigo){
        this.nombre=nombre;
        this.codigo=codigo;
        librosPrestados=new ArrayList<>();
    }
    @Override
    public String toString() {
        return "Usuario [nombre=" + nombre + ", codigo=" + codigo + "]";
    }
    
    public void prestarLibro(Libro libro){
        if(librosPrestados!=null)
            if(!librosPrestados.contains(libro))
                librosPrestados.add(libro);
        else{
            librosPrestados.add(libro);
        }

    }
    public void devolverLibro(Libro libro){
        int posicion=librosPrestados.indexOf(libro);
        if(posicion!=-1)
            librosPrestados.remove(librosPrestados.get(posicion));
    }
}