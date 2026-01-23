package Ejercicio7y8;

public class PruebaVehiculo {
    public static void main(String[] args) {
        Coche coche = new Coche("Toyota GR GT", 400);
        Moto moto = new Moto(160, "Yamaha");

        coche.arrancar();
        coche.frenar();
        coche.mostrarInfo();

        moto.arrancar();
        moto.frenar();
        moto.mostrarInfo();
    }
}
