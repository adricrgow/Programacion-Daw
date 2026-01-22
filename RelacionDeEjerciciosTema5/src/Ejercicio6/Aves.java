package Ejercicio6;

public class Aves extends Vertebrados {
    
    protected String tipoPlumas;

    public Aves(){}

    public Aves(String nombre, String alimentacion, int edad, int columnaVertebral, String tipoPlumas) {
        super(nombre, alimentacion, edad, columnaVertebral);
        this.tipoPlumas = tipoPlumas;
    }
    public String getTipoPlumas() {
        return tipoPlumas;
    }
    public void setTipoPlumas(String tipoPlumas) {
        this.tipoPlumas = tipoPlumas;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Tipo de plumas: " + tipoPlumas);
    }
    
}
