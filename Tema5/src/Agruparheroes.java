import java.io.FileReader;
import java.util.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Agruparheroes {
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();

        //Estructura final: Clave (Editorial) -valor (Lista de heroes)
        Map<String, List<String>> heroesPorEditorial = new HashMap<>();

        try {
            //Leer el archivo completo
            FileReader reader = new FileReader("./Tema5/heroes.json");
            Object obj = parser.parse(reader);
            JSONArray ListaJson = (JSONArray) obj;
           
            for (Object Heroe : ListaJson) {
                JSONObject heroe = (JSONObject) Heroe;

                //Extraer los datos necesarios
                String nombre = (String) heroe.get("superhero");
                String editorial = (String) heroe.get("publisher");

                //crear el objeto Heroe
                Heroe h = new Heroe(nombre, editorial);

                //Logica de agrupar en el map
                if (!heroesPorEditorial.containsKey(editorial)) {
                    //Si no existe la clave, crear una nueva lista
                    heroesPorEditorial.put(editorial, new ArrayList<>());
                }
                //Agregar el heroe a la lista correspondiente
                heroesPorEditorial.get(editorial).add(nombre);
            }
            //mostrar el resultado
            for (String editorialKey : heroesPorEditorial.keySet()) {
                System.out.println("Editorial: " + editorialKey);
                List<String> listaHeroes = heroesPorEditorial.get(editorialKey);
                for (String heroeNombre : listaHeroes) {
                    System.out.println(" - " + heroeNombre);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Heroe {
    private String superhero;
    private String publisher;

    public Heroe(String superhero, String publisher) {
        this.superhero = superhero;
        this.publisher = publisher;
    }

    public String getSuperhero() {
        return superhero;
    }

    public String getPublisher() {
        return publisher;
    }
}
