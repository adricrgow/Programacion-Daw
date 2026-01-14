package ClaseAbstracta;

public class Cuadrado extends Figura {
    private double lado;

    public Cuadrado(){}

    @Override
    public double CalcularArea() {
        return lado*lado;
    }

    @Override
    public double CalcularPerimetro() {
        return 4*lado;
    }
    

}
