package Interfaces;

public class Entrenador extends SeleccionFutbol {
    private int idFederacion;

    public Entrenador(int id, String nombre, String apellidos, int edad, int idFederacion) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    public void planificarEntrenamiento() {
        System.out.println(nombre + " está planificando el entrenamiento.");
    }

    @Override
    public void concentrarse() {
        System.out.println(nombre + " (Entrenador) concentrándose.");
    }

    @Override
    public void viajar() {
        System.out.println(nombre + " (Entrenador) viajando.");
    }

    @Override
    public void entrenar() {
        System.out.println(nombre + " (Entrenador) dirigiendo entrenamiento.");
    }

    @Override
    public void jugarPartido() {
        System.out.println(nombre + " (Entrenador) dirigiendo partido.");
    }
}
