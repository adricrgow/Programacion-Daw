package Ejercicio6;

public class Cnidarios extends Invertebrado {
    
    protected String tipoCnida;

    public Cnidarios(){}

    public Cnidarios(String nombre, String alimentacion, int edad, String tipoExoesqueleto, String tipoCnida) {
        super(nombre, alimentacion, edad, tipoExoesqueleto);
        this.tipoCnida = tipoCnida;
    }

    public String getTipoCnida() {
        return tipoCnida;
    }

    public void setTipoCnida(String tipoCnida) {
        this.tipoCnida = tipoCnida;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Tipo de cnidios: " + tipoCnida);
    }
    
}