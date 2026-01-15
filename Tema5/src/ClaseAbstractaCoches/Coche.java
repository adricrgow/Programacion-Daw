package ClaseAbstractaCoches;

public class Coche extends Vehiculo {
    public int velocidadMaxima() {
        return 200;
    }
    public Coche(){}

    public Coche(String matricula, int velocidadMaxima) {
        super(matricula, velocidadMaxima);
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("La velocidad maxima del coche es: " + velocidadMaxima() + " km/h");
    }

}
