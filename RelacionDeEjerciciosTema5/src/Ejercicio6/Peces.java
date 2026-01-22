package Ejercicio6;

public class Peces extends Vertebrados {
    
    protected String tipoEscamas;

    public Peces(){}

    public Peces(String nombre, String alimentacion, int edad, int columnaVertebral, String tipoEscamas) {
        super(nombre, alimentacion, edad, columnaVertebral);
        this.tipoEscamas = tipoEscamas;
    }

    public String getTipoEscamas() {
        return tipoEscamas;
    }

    public void setTipoEscamas(String tipoEscamas) {
        this.tipoEscamas = tipoEscamas;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Tipo de escamas: " + tipoEscamas);
    }

    
    
}