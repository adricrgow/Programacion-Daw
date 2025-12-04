package Diagrama2;

public class CocheNuevo {
    int id;
    String matricula;
    Version version;

    public CocheNuevo() {
    }

    public CocheNuevo(int id, String matricula, Version version) {
        this.id = id;
        this.matricula = matricula;
        this.version = version;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Version getVersion() {
        return version;
    }

    public void setVersion(Version version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "CocheNuevo [id=" + id + ", matricula=" + matricula + ", version=" + version + "]";
    }

    
}
