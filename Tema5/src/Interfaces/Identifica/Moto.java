package Interfaces.Identifica;

public class Moto extends Vehiculo{
    protected boolean limitador;

    public Moto(){}

    public Moto(boolean limitador, String marca, String matricula, String modelo) {
        super(marca, matricula, modelo);
        this.limitador = limitador;
    }

    public boolean isLimitador() {
        return limitador;
    }

    public void setLimitador(boolean limitador) {
        this.limitador = limitador;
    }

    @Override
    public String identificar() {
        return super.identificar() + " Limitador: " + limitador;
    }

    

}
