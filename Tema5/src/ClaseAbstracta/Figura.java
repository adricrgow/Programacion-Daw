package ClaseAbstracta;

public abstract class Figura {
    protected  String color;
    public Figura(){}
    public Figura(String color){
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double CalcularArea();
    public abstract double CalcularPerimetro();


}
