import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Actividades {

    // Método genérico para intercambiar posiciones dentro de un JSONArray
    public static <T> void intercambiar(JSONArray array, int a, int b) {
        Object temp = array.get(a);
        array.set(a, array.get(b));
        array.set(b, temp);
    }

    public static void main(String[] args) {
        try {
            // Leer el fichero JSON
            Object ob = new JSONParser().parse(new FileReader("./Tema5/heroes.json"));
            JSONArray listaHeroes = (JSONArray) ob;

            System.out.println("ANTES DEL INTERCAMBIO:");
            for (Object item : listaHeroes) {
                JSONObject data = (JSONObject) item;
                System.out.println(data.get("publisher") + " - " + data.get("superhero"));
            }

            // Intercambiar posiciones (ejemplo: 0 ↔ 10)
            intercambiar(listaHeroes, 0, 10);

            System.out.println("DESPUÉS DEL INTERCAMBIO:");
            for (Object item : listaHeroes) {
                JSONObject data = (JSONObject) item;
                System.out.println(data.get("publisher") + " - " + data.get("superhero"));
            }

        } catch (Exception e) {
            System.out.println("Algo ha fallado");
        }
    }
}
