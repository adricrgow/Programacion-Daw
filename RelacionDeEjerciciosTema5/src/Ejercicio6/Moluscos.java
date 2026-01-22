package Ejercicio6;

public class Moluscos extends Invertebrado {
    
    protected String tipoConcha;

    public Moluscos(){}

    public Moluscos(String nombre, String alimentacion, int edad, String tipoExoesqueleto, String tipoConcha) {
        super(nombre, alimentacion, edad, tipoExoesqueleto);
        this.tipoConcha = tipoConcha;
    }

    public String getTipoConcha() {
        return tipoConcha;
    }

    public void setTipoConcha(String tipoConcha) {
        this.tipoConcha = tipoConcha;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Tipo de concha: " + tipoConcha);
    }
    
}
