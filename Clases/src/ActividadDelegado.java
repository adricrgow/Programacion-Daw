
import actividaddelegado.Profesor;
import actividaddelegado.Alumno;
import actividaddelegado.Modulo;
import actividaddelegado.CursaModulo;

public class ActividadDelegado {
     public static void main(String[] args) {
        Profesor profesor1 = new Profesor("2356756890L", "Paco", "huelva", "7880332");
        Profesor profesor2 = new Profesor("2356756890L", "Domigo", "huelva", "7834032");
        Alumno alumno1 = new Alumno(3000, "Adrián", "14/07/2007", "Contreras Ramirez", null);
        Alumno alumno2 = new Alumno(3030, "Antonio", "10/04/2007", "Lozano", null);
        alumno2.setDelegado(alumno1);
        Modulo M1 = new Modulo(12346,"Programación" , profesor2);
        Modulo M2 = new Modulo(87429, "Sistemas", profesor1);
        CursaModulo cursa1 = new CursaModulo(alumno2, M2);
        CursaModulo cursa2 = new CursaModulo(alumno1, M1);
        cursa1.setNombreM(M2);
        cursa2.setNombreM(M1);
        cursa1.setCursa(alumno2);
        cursa2.setCursa(alumno1);
        System.out.println(profesor1);
        System.out.println(M1);
        

        
    }
}
