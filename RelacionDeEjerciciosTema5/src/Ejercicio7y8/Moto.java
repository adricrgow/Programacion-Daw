package Ejercicio7y8;

public class Moto extends Vehiculo {

    protected int velocidadMaxima;

    public Moto(){}

    public Moto(int velocidadMaxima, String marca) {
        super(marca);
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public void arrancar() {
        System.out.println(getMarca() + " está arrancando");
    }
    @Override
    public void frenar() {
        super.frenar();
    }
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Velocidad máxima: " + getVelocidadMaxima());
    }
}
