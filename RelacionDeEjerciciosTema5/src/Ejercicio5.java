import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        //hashmap de usuario
        Map<String, String> usuarios = new HashMap<>();
        try {
            //Fichero que se lee
            BufferedReader br = new BufferedReader(new FileReader("./RelacionDeEjerciciosTema5/usuarios.txt"));
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(" ");
                if (partes.length == 2) {
                    String user = partes[0];
                    String pass = partes[1];
                    usuarios.put(user, pass);
                }
            }

            br.close();
        } catch (IOException e) {
            System.out.println("Error leyendo el fichero de usuarios.");
            return;
        }

        //control de acceso
        Scanner teclado = new Scanner(System.in);
        int intentos = 3;
        boolean accesoConcedido = false;

        while (intentos > 0 && !accesoConcedido) {
            System.out.print("Usuario: ");
            String usuario = teclado.nextLine();

            System.out.print("Contraseña: ");
            String password = teclado.nextLine();

            // Comprobar credenciales
            if (usuarios.containsKey(usuario) && usuarios.get(usuario).equals(password)) {
                System.out.println("Ha accedido");
                accesoConcedido = true;
            } else {
                intentos--;
                System.out.println("Datos incorrectos. Intentos restantes: " + intentos);
            }
        }

        if (!accesoConcedido) {
            System.out.println("Lo siento, no tiene acceso al área restringida");
        }

        teclado.close();
    }
}
