package AnimalesPracticaherencia;
public class Animal {
    protected String nombre;
    protected String tipo_alimentacion;
    protected int edad;

    public Animal(String nombre, String tipo_alimentacion, int edad) {
        this.nombre = nombre;
        this.tipo_alimentacion = tipo_alimentacion;
        this.edad = edad;
    }
    
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo de alimentación: " + tipo_alimentacion);
        System.out.println("Edad: " + edad);
    }
}
