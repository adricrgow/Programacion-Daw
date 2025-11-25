package actividaddelegado;

public class CursaModulo {
    Alumno cursa;
    Modulo NombreM;

    public CursaModulo(Alumno cursa, Modulo nombreM) {
        this.cursa = cursa;
        NombreM = nombreM;
    }
    public Alumno getCursa() {
        return cursa;
    }
    public void setCursa(Alumno cursa) {
        this.cursa = cursa;
    }
    public Modulo getNombreM() {
        return NombreM;
    }
    public void setNombreM(Modulo nombreM) {
        NombreM = nombreM;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CursaModulo{");
        sb.append("cursa=").append(cursa);
        sb.append(", NombreM=").append(NombreM);
        sb.append('}');
        return sb.toString();
    }

    
    
    
}
