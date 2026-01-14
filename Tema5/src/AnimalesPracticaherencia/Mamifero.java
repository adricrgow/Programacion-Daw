package AnimalesPracticaherencia;

public class Mamifero extends Animal {
    protected int gestacion;

    public Mamifero(String nombre, String tipo_alimentacion, int edad, int gestacion) {
        super(nombre, tipo_alimentacion, edad);
        this.gestacion = gestacion;
    }

    

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Gestación: " + gestacion + " días");
    }
}


