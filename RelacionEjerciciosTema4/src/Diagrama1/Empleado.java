package Diagrama1;

public class Empleado {
    String legajo;
    String dni;
    String nombre;
    String telefono;
    String domicilio;
    String calle;
    String ciudad;
    String numero;
    String horario;
    String dia;
    Sucursal sucursal;

    public Empleado() {
    }
    

    public Empleado(String calle, String ciudad, String dia, String dni, String domicilio, String horario, String legajo, String nombre, String numero, Sucursal sucursal, String telefono) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.dia = dia;
        this.dni = dni;
        this.domicilio = domicilio;
        this.horario = horario;
        this.legajo = legajo;
        this.nombre = nombre;
        this.numero = numero;
        this.sucursal = sucursal;
        this.telefono = telefono;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("legajo=").append(legajo);
        sb.append(", dni=").append(dni);
        sb.append(", nombre=").append(nombre);
        sb.append(", telefono=").append(telefono);
        sb.append(", domicilio=").append(domicilio);
        sb.append(", calle=").append(calle);
        sb.append(", ciudad=").append(ciudad);
        sb.append(", numero=").append(numero);
        sb.append(", horario=").append(horario);
        sb.append(", dia=").append(dia);
        sb.append(", sucursal=").append(sucursal);
        sb.append('}');
        return sb.toString();
    }


}
