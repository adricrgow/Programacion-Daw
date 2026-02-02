package Ejercicio4;

public abstract class Vehicuo implements Parkeable {

    public static int getPlazasOcupadas() {
        return plazasOcupadas;
    }

    public static void setPlazasOcupadas(int plazasOcupadas) {
        Vehicuo.plazasOcupadas = plazasOcupadas;
    }
    protected String matricula;

    // atributo static plazas ocupadas

    protected static int plazasOcupadas = 0;

    public Vehicuo(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public abstract void CaldularPrecioHoras(int horas);

    @Override
    public void Salir(){
        System.out.println("Vehiculo con matricula " + matricula + " ha salido del parking. Plazas ocupadas: " + plazasOcupadas);
        plazasOcupadas--;
    }

    @Override
    public void entrar(){
        System.out.println("Vehiculo con matricula " + matricula + " ha entrado al parking. Plazas ocupadas: " + plazasOcupadas);
        plazasOcupadas++;
    }

    // numero de plazas libres
    public static int plazasLibres() {
        return PLAZAS - plazasOcupadas;
    }

    

}
