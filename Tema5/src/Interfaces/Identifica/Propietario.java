package Interfaces.Identifica;

public class Propietario extends Persona {
    protected String direccion;
    public Propietario(){}
    public Propietario(String direccion, String nombre, String dni, String pape) {
        super(nombre, dni, pape);
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String identificar() {
        return super.identificar() + " Dirección: " + direccion;
    }
    
    
}
