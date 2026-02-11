package Modelo;

public class CursoEscolar {
    private int id;
    private int anoInicio;
    private int anoFin;

    public CursoEscolar(int id, int anoInicio, int anoFin) {
        this.id = id;
        this.anoInicio = anoInicio;
        this.anoFin = anoFin;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getAnoInicio() { return anoInicio; }
    public void setAnoInicio(int anoInicio) { this.anoInicio = anoInicio; }
    public int getAnoFin() { return anoFin; }
    public void setAnoFin(int anoFin) { this.anoFin = anoFin; }
}
