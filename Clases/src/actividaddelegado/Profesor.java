package actividaddelegado;

public class Profesor {
    String DNI;
    String Nombre;
    String Dirección;
    String telefono;
    
    public Profesor(String dNI, String nombre, String dirección, String telefono) {
        DNI = dNI;
        Nombre = nombre;
        Dirección = dirección;
        this.telefono = telefono;
    }

    public String getDNI() {
        return DNI;
    }
    public void setDNI(String dNI) {
        DNI = dNI;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getDirección() {
        return Dirección;
    }
    public void setDirección(String dirección) {
        Dirección = dirección;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Profesor{");
        sb.append("DNI=").append(DNI);
        sb.append(", Nombre=").append(Nombre);
        sb.append(", Direcci\u00f3n=").append(Dirección);
        sb.append(", telefono=").append(telefono);
        sb.append('}');
        return sb.toString();
    }
    
    
}
