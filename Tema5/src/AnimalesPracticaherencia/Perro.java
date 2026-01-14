package AnimalesPracticaherencia;

public class Perro extends Mamifero {
    private String raza;

    public Perro(String nombre, String tipo_alimentacion, int edad, int gestacion, String raza) {
        super(nombre, tipo_alimentacion, edad, gestacion);
        this.raza = raza;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Raza: " + raza);
    }
}

