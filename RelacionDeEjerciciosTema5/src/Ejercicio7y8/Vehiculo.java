package Ejercicio7y8;

public abstract class Vehiculo {

    protected String marca;

    public Vehiculo(){}
    public Vehiculo(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Método abstracto
    public abstract void arrancar();

    // Método concreto
    public void frenar() {
        System.out.println(getMarca() + " está frenando");
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + getMarca());
    }
}
