package Diagrama2;

public class CocheNuevo_Extras {
    CocheNuevo cocheNuevo;
    Extra extra;

    public CocheNuevo_Extras() {
    }

    public CocheNuevo_Extras(CocheNuevo cocheNuevo, Extra extra) {
        this.cocheNuevo = cocheNuevo;
        this.extra = extra;
    }

    public CocheNuevo getCocheNuevo() {
        return cocheNuevo;
    }

    public void setCocheNuevo(CocheNuevo cocheNuevo) {
        this.cocheNuevo = cocheNuevo;
    }

    public Extra getExtra() {
        return extra;
    }

    public void setExtra(Extra extra) {
        this.extra = extra;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CocheNuevo_Extras{");
        sb.append("cocheNuevo=").append(cocheNuevo);
        sb.append(", extra=").append(extra);
        sb.append('}');
        return sb.toString();
    }

    
}
