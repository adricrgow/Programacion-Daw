package Diagrama1;

public class Tarjeta {
    String numero;
    String nombre;
    String codigo;
    String fechaVenc;
    Cliente titular;

    public Tarjeta() {
    }

    public Tarjeta(String codigo, String fechaVenc, String nombre, String numero, Cliente titular) {
        this.codigo = codigo;
        this.fechaVenc = fechaVenc;
        this.nombre = nombre;
        this.numero = numero;
        this.titular = titular;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFechaVenc() {
        return fechaVenc;
    }

    public void setFechaVenc(String fechaVenc) {
        this.fechaVenc = fechaVenc;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "Tarjeta [numero=" + numero + ", nombre=" + nombre + ", codigo=" + codigo + ", fechaVenc=" + fechaVenc
                + ", titular=" + titular + "]";
    }
    
    
}
