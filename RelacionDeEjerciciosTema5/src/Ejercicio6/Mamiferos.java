package Ejercicio6;

public class Mamiferos extends Vertebrados {
    
    protected String tipoPelo;

    public Mamiferos(){}

    public Mamiferos(String nombre, String alimentacion, int edad, int columnaVertebral, String tipoPelo) {
        super(nombre, alimentacion, edad, columnaVertebral);
        this.tipoPelo = tipoPelo;
    }

    public String getTipoPelo() {
        return tipoPelo;
    }
    public void setTipoPelo(String tipoPelo) {
        this.tipoPelo = tipoPelo;
    }
    
    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Tipo de pelo: " + tipoPelo);
    }
    
}
