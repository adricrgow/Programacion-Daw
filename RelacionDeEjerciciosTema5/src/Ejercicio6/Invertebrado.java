package Ejercicio6;

public class Invertebrado {
    protected String tipoExoesqueleto;

    public Invertebrado(){}

    public Invertebrado(String nombre, String alimentacion, int edad, String tipoExoesqueleto) {
        this.tipoExoesqueleto = tipoExoesqueleto;
    }

    public String getTipoExoesqueleto() {
        return tipoExoesqueleto;
    }

    public void setTipoExoesqueleto(String tipoExoesqueleto) {
        this.tipoExoesqueleto = tipoExoesqueleto;
    }
    
    public void mostrarDatos() {
        System.out.println("Tipo de exoesqueleto: " + tipoExoesqueleto);
    }
    
}
