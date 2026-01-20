package Interfaces.Identifica;

import java.util.ArrayList;
import java.util.List;

public class Taller {
    private String nombre;
    private String direccion;
    private Propietario propietario;
    private List<Cliente> clientes = new ArrayList<>();

    public Taller(){}

    public Taller(String direccion, String nombre, Propietario propietario) {
        this.direccion = direccion;
        this.nombre = nombre;
        this.propietario = propietario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Taller{");
        sb.append("nombre=").append(nombre);
        sb.append(", direccion=").append(direccion);
        sb.append(", propietario=").append(propietario);
        sb.append(", clientes=").append(clientes);
        sb.append('}');
        return sb.toString();
    }


}
