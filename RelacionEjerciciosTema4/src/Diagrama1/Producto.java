package Diagrama1;

public class Producto {
    String codigo;
    String descripcion;
    String color;
    double costo;
    Fabrica fabrica;

    public Producto() {
    }

    public Producto(String codigo, String color, double costo, String descripcion, Fabrica fabrica) {
        this.codigo = codigo;
        this.color = color;
        this.costo = costo;
        this.descripcion = descripcion;
        this.fabrica = fabrica;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Fabrica getFabrica() {
        return fabrica;
    }

    public void setFabrica(Fabrica fabrica) {
        this.fabrica = fabrica;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Producto{");
        sb.append("codigo=").append(codigo);
        sb.append(", descripcion=").append(descripcion);
        sb.append(", color=").append(color);
        sb.append(", costo=").append(costo);
        sb.append(", fabrica=").append(fabrica);
        sb.append('}');
        return sb.toString();
    }

    
}
