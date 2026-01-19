package Interfaces;

public class Masajista extends SeleccionFutbol {
    private String titulacion;
    private int aniosExperiencia;

    public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public void darMasaje() {
        System.out.println(nombre + " está dando un masaje.");
    }

    @Override
    public void concentrarse() {
        System.out.println(nombre + " (Masajista) concentrándose.");
    }

    @Override
    public void viajar() {
        System.out.println(nombre + " (Masajista) viajando.");
    }

    @Override
    public void entrenar() {
        System.out.println(nombre + " (Masajista) asistiendo en entrenamiento.");
    }

    @Override
    public void jugarPartido() {
        System.out.println(nombre + " (Masajista) asistiendo en partido.");
    }
}
