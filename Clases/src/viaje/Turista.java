package viaje;

public class Turista {
    int id;
    String dirección;
    String nombre;
    String apellidos;
    String teléfono;

    public Turista(){}

    public Turista(String apellidos, String dirección, int id, String nombre, String teléfono) {
        this.apellidos = apellidos;
        this.dirección = dirección;
        this.id = id;
        this.nombre = nombre;
        this.teléfono = teléfono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTeléfono() {
        return teléfono;
    }

    public void setTeléfono(String teléfono) {
        this.teléfono = teléfono;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Turista{");
        sb.append("id=").append(id);
        sb.append(", direcci\u00f3n=").append(dirección);
        sb.append(", nombre=").append(nombre);
        sb.append(", apellidos=").append(apellidos);
        sb.append(", tel\u00e9fono=").append(teléfono);
        sb.append('}');
        return sb.toString();
    }


}
