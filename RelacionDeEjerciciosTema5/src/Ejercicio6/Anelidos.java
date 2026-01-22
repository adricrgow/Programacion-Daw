package Ejercicio6;

public class Anelidos extends Invertebrado {
    
    protected String tipoSegmentos;

    public Anelidos(){}

    public Anelidos(String nombre, String alimentacion, int edad, String tipoExoesqueleto, String tipoSegmentos) {
        super(nombre, alimentacion, edad, tipoExoesqueleto);
        this.tipoSegmentos = tipoSegmentos;
    }

    public String getTipoSegmentos() {
        return tipoSegmentos;
    }

    public void setTipoSegmentos(String tipoSegmentos) {
        this.tipoSegmentos = tipoSegmentos;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Tipo de segmentos: " + tipoSegmentos);
    }
    
}