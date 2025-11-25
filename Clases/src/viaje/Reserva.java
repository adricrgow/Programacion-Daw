package viaje;

public class Reserva {
    Turista nombre= null;
    Hotel nombreHotel = null;
    Sucursal id = null;
    String fechaSalida;
    String fechaEntrada;
    String régimen;

    public Reserva(){}

    public Reserva(String fechaEntrada, String fechaSalida, String régimen) {
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.régimen = régimen;
    }
    
    public Turista getNombre() {
        return nombre;
    }

    public void setNombre(Turista nombre) {
        this.nombre = nombre;
    }

    public Hotel getNombreHotel() {
        return nombreHotel;
    }

    public void setNombreHotel(Hotel nombreHotel) {
        this.nombreHotel = nombreHotel;
    }

    public Sucursal getId() {
        return id;
    }

    public void setSucursal(Sucursal id) {
        this.id = id;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getRégimen() {
        return régimen;
    }

    public void setRégimen(String régimen) {
        this.régimen = régimen;
    }

    @Override
    public String toString() {
        return "Reserva [nombre=" + nombre + ", nombreHotel=" + nombreHotel + ", id=" + id + ", fechaSalida="
                + fechaSalida + ", fechaEntrada=" + fechaEntrada + ", régimen=" + régimen + "]";
    }
    
    
    
    
}
