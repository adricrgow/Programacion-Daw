import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Ejercicio3 {

    public static void main(String[] args) {
        try {
            // Ruta del JSON
            String filePath = "./RelacionDeEjerciciosTema5/alumnos.json";

            BufferedReader br = new BufferedReader(new FileReader(filePath));
            StringBuilder sb = new StringBuilder();
            String line;

            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
            br.close();

            JSONParser parser = new JSONParser();
            JSONObject root = (JSONObject) parser.parse(sb.toString());

            JSONArray alumnos = (JSONArray) root.get("alumnos");

            // HashMap para contar tipos de notas
            HashMap<String, Integer> contador = new HashMap<>();
            contador.put("suspensos", 0);
            contador.put("aprobados", 0);
            contador.put("notables", 0);
            contador.put("sobresalientes", 0);

            // Procesar cada alumno
            for (Object obj : alumnos) {
                JSONObject alumno = (JSONObject) obj;

                String nombre = (String) alumno.get("nombre");
                JSONArray notas = (JSONArray) alumno.get("notas");

                double suma = 0;

                for (Object n : notas) {
                    long nota = (long) n;
                    suma += nota;

                    // Clasificación de notas
                    if (nota < 5) {
                        contador.put("suspensos", contador.get("suspensos") + 1);
                    } else if (nota <= 6) {
                        contador.put("aprobados", contador.get("aprobados") + 1);
                    } else if (nota <= 8) {
                        contador.put("notables", contador.get("notables") + 1);
                    } else {
                        contador.put("sobresalientes", contador.get("sobresalientes") + 1);
                    }
                }

                double media = suma / notas.size();
                System.out.println("Alumno: " + nombre + " | Media: " + media);
            }

            // Mostrar HashMap final
            System.out.println("\nResumen de notas:");
            System.out.println(contador);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
