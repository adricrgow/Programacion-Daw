package Interfaces.Identifica;

public class Coche extends Vehiculo {
    protected int anchura;
    protected int altura;

    public Coche(){}

    public Coche(int altura, int anchura, String marca, String matricula, String modelo) {
        super(marca, matricula, modelo);
        this.altura = altura;
        this.anchura = anchura;
    }


    public int getAnchura() {
        return anchura;
    }
    public void setAnchura(int anchura) {
        this.anchura = anchura;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }


    @Override
    public String identificar() {
        return super.identificar() + " Altura: " + altura + " Anchura: " + anchura;
    }

    

}
