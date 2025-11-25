package proyectotren;

public class Tren {
    Locomotora locomotora;
    Vagon[] vagones;
    Maquinista maquinista;

    public Tren (){}

    public Tren(Locomotora locomotora, Maquinista maquinista, Vagon[] vagones) {
        this.locomotora = locomotora;
        this.maquinista = maquinista;
        this.vagones = vagones;
    }

    public Locomotora getLocomotora() {
        return locomotora;
    }

    public void setLocomotora(Locomotora locomotora) {
        this.locomotora = locomotora;
    }

    public Vagon[] getVagones() {
        return vagones;
    }

    public void setVagones(Vagon[] vagones) {
        this.vagones = vagones;
    }

    public Maquinista getMaquinista() {
        return maquinista;
    }

    public void setMaquinista(Maquinista maquinista) {
        this.maquinista = maquinista;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tren{");
        sb.append("locomotora=").append(locomotora);
        sb.append(", vagones=").append(vagones);
        sb.append(", maquinista=").append(maquinista);
        sb.append('}');
        return sb.toString();
    }


}
