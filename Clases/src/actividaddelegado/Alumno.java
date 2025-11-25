package actividaddelegado;

public class Alumno {
    int Expediente;
    String nombre;
    String FechaNa;
    String Apellidos;
    Alumno Delegado = null;

    
    public Alumno(int expediente, String nombre, String fechaNa, String apellidos, Alumno delegado) {
        Expediente = expediente;
        this.nombre = nombre;
        FechaNa = fechaNa;
        Apellidos = apellidos;
        Delegado = delegado;
    }
    

    public int getExpediente() {
        return Expediente;
    }
    public void setExpediente(int expediente) {
        Expediente = expediente;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getFechaNa() {
        return FechaNa;
    }
    public void setFechaNa(String fechaNa) {
        FechaNa = fechaNa;
    }
    public String getApellidos() {
        return Apellidos;
    }
    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }
    public Alumno getDelegado() {
        return Delegado;
    }

    public void setDelegado(Alumno delegado) {
        Delegado = delegado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Alumno{");
        sb.append("Expediente=").append(Expediente);
        sb.append(", nombre=").append(nombre);
        sb.append(", FechaNa=").append(FechaNa);
        sb.append(", Apellidos=").append(Apellidos);
        sb.append(", Delegado=").append(Delegado);
        sb.append('}');
        return sb.toString();
    }
    
}
