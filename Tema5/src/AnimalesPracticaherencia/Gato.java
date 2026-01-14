package AnimalesPracticaherencia;

public class Gato extends Mamifero {
    private String pedigrí;

    public Gato(String nombre, String tipo_alimentacion, int edad, int gestacion, String pedigrí) {
        super(nombre, tipo_alimentacion, edad, gestacion);
        this.pedigrí = pedigrí;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Pedigrí: " + pedigrí);
    }
}
