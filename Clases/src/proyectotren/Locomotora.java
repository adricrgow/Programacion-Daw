package proyectotren;

public class Locomotora {
    String matricula;
    int potencia;
    String anoDeFabricacion;
    Mecanicos mecanico;

    public Locomotora(){}

    public Locomotora(String anoDeFabricacion, String matricula, Mecanicos mecanico, int potencia) {
        this.anoDeFabricacion = anoDeFabricacion;
        this.matricula = matricula;
        this.mecanico = mecanico;
        this.potencia = potencia;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getAnoDeFabricacion() {
        return anoDeFabricacion;
    }

    public void setAnoDeFabricacion(String anoDeFabricacion) {
        this.anoDeFabricacion = anoDeFabricacion;
    }

    public Mecanicos getMecanico() {
        return mecanico;
    }

    public void setMecanico(Mecanicos mecanico) {
        this.mecanico = mecanico;
    }

    @Override
    public String toString() {
        return "Locomotora [matricula=" + matricula + ", potencia=" + potencia + ", anoDeFabricacion="
                + anoDeFabricacion + ", mecanico=" + mecanico + "]";
    }


    
}
