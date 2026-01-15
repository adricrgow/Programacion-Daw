package ClaseAbstractaCoches;

public class Camion extends Vehiculo {
    public int velocidadMaxima() {
        return 140;
    }
    public Camion(){}

    public Camion(String matricula, int velocidadMaxima) {
        super(matricula, velocidadMaxima);
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("La velocidad maxima del camion es: " + velocidadMaxima() + " km/h");
    }
    
}
