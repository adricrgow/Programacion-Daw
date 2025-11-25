
import proyectotren.Especialidad;
import proyectotren.Locomotora;
import proyectotren.Maquinista;
import proyectotren.Mecanicos;
import proyectotren.Tren;
import proyectotren.Vagon;

public class ActividadTrenes {
    public static void main(String[] args) {
        Mecanicos me1 = new Mecanicos("38102938F", Especialidad.motor, "Pepe", 38912749);
        Mecanicos me2 = new Mecanicos("38198938F", Especialidad.electricidad, "Alvaro", 37842943);
        Mecanicos me3 = new Mecanicos("39195938F", Especialidad.frenos, "Domingo", 34842853);

        
        Maquinista maquinista1 = new Maquinista("78264596F", "Pedro", "Muy alto", 1500);
        Maquinista maquinista2 = new Maquinista("78264776F", "Antonio", "Muy bajo", 900);
        Maquinista maquinista3 = new Maquinista("88864776F", "Adrián", "Muy Alto", 1700);

        Locomotora loc1 = new Locomotora("1/1/1999", "82364701H", me3, 1500);
        Locomotora loc2 = new Locomotora("2/2/1999", "72364701H", me1, 1600);
        Locomotora loc3 = new Locomotora("3/3/1999", "92364701H", me2, 1700);
        
        Vagon[] vagon1= new Vagon[3];
        for (int i=0; i<vagon1.length;i++) {
            vagon1[i] = new Vagon(20, 40, 1, "drogica");
        }

        Tren tren1 = new Tren();
        tren1.setLocomotora(loc3);
        tren1.setVagones(vagon1);
        tren1.setMaquinista(maquinista3);

        Tren tren2 = new Tren();
        tren2.setLocomotora(loc1);
        tren2.setVagones(vagon1);
        tren2.setMaquinista(maquinista1);

        Tren tren3 = new Tren();
        tren3.setLocomotora(loc2);
        tren3.setVagones(vagon1);
        tren3.setMaquinista(maquinista2);

        System.out.println(tren1);

    
    }
}
