package Diagrama2;


public class CocheUsado {
    String matricula;
    double precioTasacion;
    String nombre;
    int id;
    Cliente cliente;
    String fechaEntrega;

    public CocheUsado() {
    }

    public CocheUsado(String matricula, double precioTasacion, String nombre, int id, Cliente cliente) {
        this.matricula = matricula;
        this.precioTasacion = precioTasacion;
        this.nombre = nombre;
        this.id = id;
        this.cliente = cliente;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getPrecioTasacion() {
        return precioTasacion;
    }

    public void setPrecioTasacion(double precioTasacion) {
        this.precioTasacion = precioTasacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CocheUsado{");
        sb.append("matricula=").append(matricula);
        sb.append(", precioTasacion=").append(precioTasacion);
        sb.append(", nombre=").append(nombre);
        sb.append(", id=").append(id);
        sb.append(", cliente=").append(cliente);
        sb.append('}');
        return sb.toString();
    }

    
    
}
