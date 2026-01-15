package ClaseAbstractaCoches;

public class Moto extends Vehiculo {
    public int velocidadMaxima() {
        return 100;
    }
    public Moto(){}

    public Moto(String matricula, int velocidadMaxima) {
        super(matricula, velocidadMaxima);
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("La velocidad maxima de la moto es: " + velocidadMaxima() + " km/h");
    }

    
    
}
