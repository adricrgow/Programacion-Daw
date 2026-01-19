package Interfaces;


public class Futbolista extends SeleccionFutbol {
    private int dorsal;
    private String demarcacion;

    public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public void entrevista() {
        System.out.println(nombre + " está dando una entrevista.");
    }

    @Override
    public void concentrarse() {
        System.out.println(nombre + " (Futbolista) concentrándose.");
    }

    @Override
    public void viajar() {
        System.out.println(nombre + " (Futbolista) viajando.");
    }

    @Override
    public void entrenar() {
        System.out.println(nombre + " (Futbolista) entrenando.");
    }

    @Override
    public void jugarPartido() {
        System.out.println(nombre + " (Futbolista) jugando partido.");
    }
}

