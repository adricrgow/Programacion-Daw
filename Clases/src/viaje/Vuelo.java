package viaje;

public class Vuelo {
    int id;
    String fecha;
    String hora;
    String origen;
    String destino;
    String plazasTotales;

    public Vuelo (){}

    public Vuelo(String destino, String fecha, String hora, int id, String origen, String plazasTotales) {
        this.destino = destino;
        this.fecha = fecha;
        this.hora = hora;
        this.id = id;
        this.origen = origen;
        this.plazasTotales = plazasTotales;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getPlazasTotales() {
        return plazasTotales;
    }

    public void setPlazasTotales(String plazasTotales) {
        this.plazasTotales = plazasTotales;
    }

    @Override
    public String toString() {
        return "Vuelo [id=" + id + ", fecha=" + fecha + ", hora=" + hora + ", origen=" + origen + ", destino=" + destino
                + ", plazasTotales=" + plazasTotales + "]";
    }


}
