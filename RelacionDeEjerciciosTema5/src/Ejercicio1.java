import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce la ruta del primer fichero:");
        String inicio=teclado.nextLine();//"./RelacionDeEjerciciosTema5/A.txt"
        System.out.println("Introduce la ruta del segundo fichero:");
        String inicio2=teclado.nextLine();//"./RelacionDeEjerciciosTema5/B.txt"
        //Ruta de detino pedida por teclado
        System.out.println("Introduce la ruta de destino:");
        String rutaDestino=teclado.nextLine();// "./RelacionDeEjerciciosTema5/"
        
        try {
            
            // Lectura de los dos ficheros
            Scanner scanner = new Scanner(new File(inicio));
            Scanner scanner2 = new Scanner(new File(inicio2));

            // Ruta del destino

            // Scanner scanner3 = new Scanner(new File(rutaDestino));

            // Nombres de los ficheros sin extensión
            String nombre1 = "A";
            String nombre2 = "B";

            // Nombre final
            String nombreFinal = nombre1 + "_" + nombre2 + ".txt";

            // Crear el fichero final
            File ficheroFinal = new File(rutaDestino + nombreFinal);
            FileWriter fw = new FileWriter(ficheroFinal);

            // Copiar contenido del primer fichero
            while (scanner.hasNextLine()) {
                fw.write(scanner.nextLine());
                fw.write(System.lineSeparator());
            }

            // Copiar contenido del segundo fichero
            while (scanner2.hasNextLine()) {
                fw.write(scanner2.nextLine());
                fw.write(System.lineSeparator());
            }

            fw.close();
            scanner.close();
            scanner2.close();
            // scanner3.close();

            System.out.println("Fichero creado correctamente: " + ficheroFinal.getAbsolutePath());

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
