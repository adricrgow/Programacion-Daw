package proyectotren;

public class Maquinista {
    String nombre;
    String DNI;
    int sueldo;
    String rango;

    public Maquinista (){}

    public Maquinista(String DNI, String nombre, String rango, int sueldo) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.rango = rango;
        this.sueldo = sueldo;
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

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Maquinista{");
        sb.append("nombre=").append(nombre);
        sb.append(", DNI=").append(DNI);
        sb.append(", sueldo=").append(sueldo);
        sb.append(", rango=").append(rango);
        sb.append('}');
        return sb.toString();
    }


}
