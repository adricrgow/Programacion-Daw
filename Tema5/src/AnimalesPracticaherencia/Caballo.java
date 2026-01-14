package AnimalesPracticaherencia;

public class Caballo extends Mamifero {
    private String comida;
    private int ejercicio;

    public Caballo(String nombre, String tipo_alimentacion, int edad, int gestacion, String comida, int ejercicio) {
        super(nombre, tipo_alimentacion, edad, gestacion);
        this.comida = comida;
        this.ejercicio = ejercicio;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Comida favorita: " + comida);
        System.out.println("Ejercicio diario: " + ejercicio + " horas");
    }
}
