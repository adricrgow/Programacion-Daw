package viaje;

public class Sucursal {
    int id;
    String teléfono;
    String dirección;
    String ciudad;
    String provincia;

    public Sucursal(){}

    public Sucursal(String ciudad, String dirección, int id, String provincia, String teléfono) {
        this.ciudad = ciudad;
        this.dirección = dirección;
        this.id = id;
        this.provincia = provincia;
        this.teléfono = teléfono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTeléfono() {
        return teléfono;
    }

    public void setTeléfono(String teléfono) {
        this.teléfono = teléfono;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        return "Sucursal [id=" + id + ", teléfono=" + teléfono + ", dirección=" + dirección + ", ciudad=" + ciudad
                + ", provincia=" + provincia + "]";
    }


}
