package Interfaces.Identifica;

public class Vehiculo implements Identificacion {
    protected String matricula;
    protected String modelo;
    protected String marca;

    public Vehiculo(){}

    public Vehiculo(String marca, String matricula, String modelo) {
        this.marca = marca;
        this.matricula = matricula;
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String identificar() {
        return null;
    }

}
