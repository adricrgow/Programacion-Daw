package Diagrama1;

public class Cliente {
    String codigo;
    String nombre;
    String ciudad;
    String dni;
    String fechaNac;

    public Cliente() {
    }

    public Cliente(String ciudad, String codigo, String dni, String fechaNac, String nombre) {
        this.ciudad = ciudad;
        this.codigo = codigo;
        this.dni = dni;
        this.fechaNac = fechaNac;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{");
        sb.append("codigo=").append(codigo);
        sb.append(", nombre=").append(nombre);
        sb.append(", ciudad=").append(ciudad);
        sb.append(", dni=").append(dni);
        sb.append(", fechaNac=").append(fechaNac);
        sb.append('}');
        return sb.toString();
    }

    

}
