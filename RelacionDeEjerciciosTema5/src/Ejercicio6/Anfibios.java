package Ejercicio6;

public class Anfibios extends Vertebrados {
    
    protected String tipoPiel;

    public Anfibios(){}

    public Anfibios(String nombre, String alimentacion, int edad, int columnaVertebral, String tipoPiel) {
        super(nombre, alimentacion, edad, columnaVertebral);
        this.tipoPiel = tipoPiel;
    }

    public String getTipoPiel() {
        return tipoPiel;
    }
    public void setTipoPiel(String tipoPiel) {
        this.tipoPiel = tipoPiel;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Tipo de piel: " + tipoPiel);
    }
    
}