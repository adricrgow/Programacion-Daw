package ClaseAbstracta;

public class Circulo extends Figura {
    private double radio;

    public Circulo(){}

    public Circulo(double radio, String color) {
        super(color);
        this.radio = radio;
    }

    @Override
    public double CalcularArea() {
        return Math.PI*radio*radio;
    }

    @Override
    public double CalcularPerimetro() {
        return 2*Math.PI*radio;
    }

    
    
}
