public class Empleado {
    private String nombre;


    public Empleado() {
    }

    public Empleado(String nombre) {
        this.nombre = nombre;
        System.out.println("Constructor de Empleado " + nombre);
    }
   
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
                  
    @Override
    public String toString() {
        return "Empleado " + nombre;
    }
}