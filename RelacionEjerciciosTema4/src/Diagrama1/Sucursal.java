package Diagrama1;

public class Sucursal {
    String numero;
    String domicilio;
    String ciudad;

    public Sucursal() {
    }

    public Sucursal(String numero, String domicilio, String ciudad) {
        this.numero = numero;
        this.domicilio = domicilio;
        this.ciudad = ciudad;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Sucursal{");
        sb.append("numero=").append(numero);
        sb.append(", domicilio=").append(domicilio);
        sb.append(", ciudad=").append(ciudad);
        sb.append('}');
        return sb.toString();
    }

   
    
}
