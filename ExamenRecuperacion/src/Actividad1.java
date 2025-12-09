import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Actividad1 {
    public static void main(String[] args) {
       ArrayList<Integer> bolas = generarVector();
    ArrayList<Integer> ninoL= new ArrayList<>(Arrays.asList(3,5,4,7,8));
        validar(bolas, ninoL);
    }

    static ArrayList<Integer> generarVector() {
        ArrayList<Integer> vector = new ArrayList<>();
        Random r = new Random();
        while (vector.size() < 5) {
            int num = r.nextInt(9) + 1; 
            if (!vector.contains(num)) vector.add(num);
        }
        System.out.println("Vector generado: " + vector);
        return vector;
    }

    static void validar(ArrayList<Integer> bolas, ArrayList<Integer> ninoL) {
        ArrayList<Integer> coincidencias = new ArrayList<>();
        for (int b : bolas) if (ninoL.contains(b)) coincidencias.add(b);
        Collections.sort(coincidencias);
        if (coincidencias.isEmpty()) 
            System.out.println("Lo siento, no hay coincidencias.");
        else 
            System.out.println( coincidencias + ". ¡Enhorabuena! te coincidie estos numeros");
    }
}
    


