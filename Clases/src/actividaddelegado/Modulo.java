package actividaddelegado;

public class Modulo{
int codigoM;
String NombreM;
Profesor Nombre;


public Modulo(int codigoM, String nombreM, Profesor nombProfesor) {
    this.codigoM = codigoM;
    NombreM = nombreM;
    Nombre = nombProfesor;
}

public int getCodigoM() {
    return codigoM;
}
public void setCodigoM(int codigoM) {
    this.codigoM = codigoM;
}
public String getNombreM() {
    return NombreM;
}
public void setNombreM(String nombreM) {
    NombreM = nombreM;
}
public Profesor getNombProfesor() {
    return Nombre;
}

public void setNombProfesor(Profesor nombProfesor) {
    Nombre = nombProfesor;
}

    @Override
    public String toString() {
        return "Modulo [codigoM=" + codigoM + ", NombreM=" + NombreM + ", NombProfesor=" + Nombre + "]";
    }

}