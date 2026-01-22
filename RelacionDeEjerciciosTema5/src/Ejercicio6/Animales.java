package Ejercicio6;

public class Animales {
    protected String nombre;
    protected String alimentacion;
    protected int edad;

    public Animales(){}

    public Animales(String nombre, String alimentacion, int edad) {
        this.nombre = nombre;
        this.alimentacion = alimentacion;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo de alimentación: " + alimentacion);
        System.out.println("Edad: " + edad);
    }

    
}
