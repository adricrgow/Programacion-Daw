package ClaseAbstracta;

public class Rectangulo extends Figura{
    private double ancho;
    private double alto;
    public Rectangulo(){}
    public Rectangulo(double ancho, double alto, String color) {
        super(color);
        this.ancho = ancho;
        this.alto = alto;
    }
    @Override
    public double CalcularArea() {
        return ancho*alto;
    }

    @Override
    public double CalcularPerimetro() {
        return (ancho+alto)*2;
    }
    
}