package Ejercicio7y8;

public class Helicoptero extends Vehiculo implements Volador{

    public Helicoptero(String marca) {
        super(marca);
    }

    @Override
    public void arrancar() {
        System.out.println(getMarca() + " está arrancando");
    }
    @Override
    public void volar() {
        System.out.println(getMarca() + " está volando");
    }
}