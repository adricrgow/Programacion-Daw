package viaje;

public class Hotel {
    int id;
    String nombreHotel;
    String teléfono;
    String plazas;
    String Ciudad;
    String dirreción;

    public Hotel(){}
    
    public Hotel(String Ciudad, String dirreción, int id, String nombreHotel, String plazas, String teléfono) {
        this.Ciudad = Ciudad;
        this.dirreción = dirreción;
        this.id = id;
        this.nombreHotel = nombreHotel;
        this.plazas = plazas;
        this.teléfono = teléfono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreHotel() {
        return nombreHotel;
    }

    public void setNombreHotel(String nombreHotel) {
        this.nombreHotel = nombreHotel;
    }

    public String getTeléfono() {
        return teléfono;
    }

    public void setTeléfono(String teléfono) {
        this.teléfono = teléfono;
    }

    public String getPlazas() {
        return plazas;
    }

    public void setPlazas(String plazas) {
        this.plazas = plazas;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getDirreción() {
        return dirreción;
    }

    public void setDirreción(String dirreción) {
        this.dirreción = dirreción;
    }

    @Override
    public String toString() {
        return "Hotel [id=" + id + ", nombreHotel=" + nombreHotel + ", teléfono=" + teléfono + ", plazas=" + plazas
                + ", Ciudad=" + Ciudad + ", dirreción=" + dirreción + "]";
    }
}
