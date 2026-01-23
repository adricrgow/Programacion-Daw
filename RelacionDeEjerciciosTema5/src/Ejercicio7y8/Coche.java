package Ejercicio7y8;

public class Coche extends Vehiculo {

    protected int velocidadMaxima;
    
    public Coche(){}

    public Coche(String marca, int velocidadMaxima) {
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
