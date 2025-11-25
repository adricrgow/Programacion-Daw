package proyectotren;

public class Mecanicos {
    Especialidad espe = null;
    String nombre;
    String DNI;
    int telefono;

    public Mecanicos(){}

    public Mecanicos(String DNI, Especialidad espe, String nombre, int telefono) {
        this.DNI = DNI;
        this.espe = espe;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public Especialidad getEspe() {
        return espe;
    }

    public void setEspe(Especialidad espe) {
        this.espe = espe;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Mecanicos [espe=" + espe + ", nombre=" + nombre + ", DNI=" + DNI + ", telefono=" + telefono + "]";
    }



}
