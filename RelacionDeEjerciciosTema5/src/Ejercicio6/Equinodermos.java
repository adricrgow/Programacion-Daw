package Ejercicio6;

public class Equinodermos extends Invertebrado {
    
    protected String tipoSimetria;

    public Equinodermos(){}

    public Equinodermos(String nombre, String alimentacion, int edad, String tipoExoesqueleto, String tipoSimetria) {
        super(nombre, alimentacion, edad, tipoExoesqueleto);
        this.tipoSimetria = tipoSimetria;
    }

    public String getTipoSimetria() {
        return tipoSimetria;
    }

    public void setTipoSimetria(String tipoSimetria) {
        this.tipoSimetria = tipoSimetria;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Tipo de simetría: " + tipoSimetria);
    }
    
}
