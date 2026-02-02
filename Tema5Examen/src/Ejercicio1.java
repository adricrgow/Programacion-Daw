import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        // ubicacion del fichero  ./Tema5Examen/src/Ejemplo1.java
        System.out.print("Introduce el nombre del fichero Java: ");
        String nombreFichero = teclado.nextLine();

        File fichero = new File(nombreFichero);

        // Comprobar si el archivo existe
        if (!fichero.exists()) {
            System.out.println("El fichero no existe.");
            return;
        }

        ArrayList<String> lineas = new ArrayList<>();

        // Leer el fichero
        try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                // Solo se eliminan las líneas que empiezan por //
                if (!linea.trim().startsWith("//")) {
                    lineas.add(linea);
                }
            }

        } catch (IOException e) {
            System.out.println("Error al leer el fichero.");
            return;
        }

        // Sobrescribir el fichero sin los comentarios
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fichero))) {
            for (String l : lineas) {
                bw.write(l);
                bw.newLine();
            }

        } catch (IOException e) {
            System.out.println("Error al escribir el fichero.");
        }

        System.out.println("Comentarios eliminados correctamente.");
    }
}
