import Pruebas1.Matematicas;
import Pruebas1.Persona;

public class Actividad1Clases {
    public static void main(String[] args) {
        Persona p = new Persona("Adri",18);
        p.imprimePersona();

        double a=4;
        double b=5;

        System.out.println(Matematicas.suma(a,b));

        System.out.println(p.getNombre());
    }   
}

