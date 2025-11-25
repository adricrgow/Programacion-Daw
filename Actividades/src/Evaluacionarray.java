
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Evaluacionarray {
    public static void main(String[] args) {
        ArrayList<String> alumnos=new ArrayList<>();
        alumnos.add("Antonio");
        alumnos.add("María");
        alumnos.add("Marggio");
        alumnos.add("Adrián");
        alumnos.add("Nicolás");
        ArrayList<String> materias=new ArrayList<>();
        materias.add("Programación");
        materias.add("Entornos");
        materias.add("Bases de Datos");
        materias.add("LMSGI");
        ArrayList<ArrayList<Double>> notas =new ArrayList<>();

        //Generar notas aleatorias
        generaNotas(notas,alumnos.size(),materias.size());
        //Imprimir los datos
        imprimeNotas(alumnos, materias, notas);

        //Obtener estadísticas del alumno
        // obtenerDatosAlumno(alumnos, notas);
        materiasSuperadas(materias,notas);

    }
    public static void generaNotas(ArrayList<ArrayList<Double>> notas,int filas,int columnas){

        for(int i=0;i<filas;i++){
            ArrayList<Double> vector=new ArrayList<>();
            for(int j=0;j<columnas;j++){
                vector.add((Math.random()*(10)));
            }
            notas.add(vector);
        }
        
    }
    public static void imprimeNotas(ArrayList<String> alumnos, ArrayList<String> materias, ArrayList<ArrayList<Double>> notas){
        System.out.print("       | ");
        for(int i=0;i<materias.size();i++){
            System.out.print(materias.get(i)+" | ");
        }   
        System.out.println();
        for(int i=0;i<notas.size();i++){
            System.out.print(alumnos.get(i)+" | ");
            for(int j=0;j<notas.get(i).size();j++){
                System.out.printf("%2.1f | ",notas.get(i).get(j));
            }
            System.out.println();
        }
    }
    public static void obtenerDatosAlumno(ArrayList<String> alumnos,ArrayList<ArrayList<Double>> notas){
        //Pedir el alumno
        Scanner teclado=new Scanner(System.in);
        System.out.print("Introduce el alumno: ");
        String nombre=teclado.nextLine();

        if(alumnos.contains(nombre)){
            System.out.println("Ese alumno está en la lista");
            int indice=alumnos.indexOf(nombre);
            ArrayList<Double> notasAlumno=notas.get(indice);
            //Maximo, mínimo y media
            double maximo=notasAlumno.get(0);
            double minimo=notasAlumno.get(0);
            double media=0;
            for(int i=0;i<notasAlumno.size();i++){
                if(maximo>notasAlumno.get(i)) maximo=notasAlumno.get(i);
                if(minimo<notasAlumno.get(i)) minimo=notasAlumno.get(i);
                media+=notasAlumno.get(i);
            }
            media=media/notasAlumno.size();
            System.out.println("Nota media del alumno "+nombre+": "+media);
            System.out.println("Nota máxima del alumno "+nombre+": "+maximo);
            System.out.println("Nota mínima del alumno "+nombre+": "+minimo);
        }
        else{
            System.out.println("Ese alumno no está en la lista");
        }
    }
    public static void materiasSuperadas(ArrayList<String> materias, ArrayList<ArrayList<Double>> notas){
        //Pedir la materia
        Scanner teclado=new Scanner(System.in);
        System.out.print("Introduce la materia: ");
        String nombre=teclado.nextLine();

        if(materias.contains(nombre)){
            System.out.println("Esa materia sí está en la lista");
            int indice=materias.indexOf(nombre);
            int contador=0;
            for(int i=0;i<notas.size();i++){
                if(notas.get(i).get(indice)>=5) contador++;
            }
            System.out.println("Han aprobado la materia "+nombre+" un total de "+contador);
        }
        else{
            System.out.println("Esa materia no existe");
        }
    }
}

