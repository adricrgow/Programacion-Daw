import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Actividades {

    // Actividad 1: Método genérico para intercambiar posiciones en un JSONArray
    public static <T> void intercambiar(JSONArray array, int a, int b) {
        Object temp = array.get(a);
        array.set(a, array.get(b));
        array.set(b, temp);
    }

    // Actividad 2: Método genérico para buscar un elemento en un array
    public static <T> int buscarElemento(T[] array, T elemento) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    // Actividad 3: Método genérico para obtener el máximo entre dos valores
    public static <T extends Comparable<T>> T maximo(T a, T b) {
        return (a.compareTo(b) >= 0) ? a : b;
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

            // Actividad 1: Intercambiar posiciones (ejemplo: 0 ↔ 10)
            intercambiar(listaHeroes, 0, 10);

            System.out.println("DESPUÉS DEL INTERCAMBIO:");
            for (Object item : listaHeroes) {
                JSONObject data = (JSONObject) item;
                System.out.println(data.get("publisher") + " - " + data.get("superhero"));
            }

        } catch (Exception e) {
            System.out.println("Algo ha fallado");
        }

        // Actividad 2: Buscar un elemento en un array
        String[] nombres = {"Thor", "Ironman", "Spiderman", "Hulk"};
        int posicion = buscarElemento(nombres, "Spiderman");
        System.out.println("\nSpiderman está en la posición: " + posicion);

        // Actividad 3: Obtener el máximo entre dos valores
        int mayor = maximo(42, 77);
        String palabraMayor = maximo("Batman", "Superman");
        System.out.println("Mayor entre 42 y 77: " + mayor);
        System.out.println("Mayor entre Batman y Superman: " + palabraMayor);
    }
}
