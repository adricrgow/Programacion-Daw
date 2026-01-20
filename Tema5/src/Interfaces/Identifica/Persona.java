package Interfaces.Identifica;

public class Persona implements Identificacion {
    protected String nombre;
    protected String dni;
    protected String pape;

    public Persona(){}

    public Persona(String nombre, String dni, String pape) {
        this.nombre = nombre;
        this.dni = dni;
        this.pape = pape;
    }

    
    @Override
    public String identificar() {
        return "Persona: " + nombre + ", DNI: " + dni + ", Pape " + pape;
    }
    
}
