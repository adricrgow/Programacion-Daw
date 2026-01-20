package Interfaces.Identifica;

import java.util.ArrayList;

public class Cliente extends Persona {
    protected String telefono;
    ArrayList<Vehiculo> vehiculos;

    public Cliente(){}
    public Cliente(String telefono, ArrayList<Vehiculo> vehiculos, String nombre, String dni, String pape) {
        super(nombre, dni, pape);
        this.telefono = telefono;
        this.vehiculos = vehiculos;
    }

    

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
    @Override
    public String identificar() {
        return super.identificar() + " Teléfono: " + telefono + " Vehículos: " + vehiculos.size();
    }
    

}