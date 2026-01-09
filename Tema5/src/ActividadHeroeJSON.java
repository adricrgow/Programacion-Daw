import java.io.FileReader;
import java.io.Reader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ActividadHeroeJSON {
    public static void main(String[] args) {
        try {
             // Lectura del contenido del fichero JSON
        Object ob = new JSONParser().parse(new FileReader("./Tema5/heroes.json"));
        // Convertir el objeto a JSONObject

        JSONArray ListaHeroes = (JSONArray) ob;
    
        for (Object item : ListaHeroes) {
            JSONObject data = (JSONObject) item;
            String publisher = (String) data.get("publisher");
            String superheroe = (String) data.get("superheroe");
            System.out.println(publisher);
            System.out.println(superheroe);
        }
        } catch (Exception e) {
            System.out.println("algo a fallado");
        }
    }
}
