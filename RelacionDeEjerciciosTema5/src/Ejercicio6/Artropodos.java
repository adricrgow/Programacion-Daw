package Ejercicio6;

public class Artropodos extends Invertebrado {
    protected  int numerosDePatas;

    public Artropodos(){}

    public Artropodos(int numerosDePatas, String nombre, String alimentacion, int edad, String tipoExoesqueleto) {
        super(nombre, alimentacion, edad, tipoExoesqueleto);
        this.numerosDePatas = numerosDePatas;
    }
    public int getNumerosDePatas() {
        return numerosDePatas;
    }
    public void setNumerosDePatas(int numerosDePatas) {
        this.numerosDePatas = numerosDePatas;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos() ;
        System.out.println("Número de patas: " + numerosDePatas);
    }
    


}
