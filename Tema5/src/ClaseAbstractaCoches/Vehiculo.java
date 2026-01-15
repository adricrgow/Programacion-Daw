package ClaseAbstractaCoches;

public abstract class Vehiculo {
    protected String matricula;
    

    public Vehiculo(){}
    public Vehiculo(String matricula, int velocidadMaxima){
        this.matricula=matricula;

    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


    
    public void mostrarInfo() {
        System.out.println("Matricula: " + matricula);
    }

    public abstract int velocidadMaxima();
}
