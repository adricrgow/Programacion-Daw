import java.io.BufferedReader;
import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class Ejercicio2 {

    public static void main(String[] args) {
        try {
            String filePath = "./RelacionDeEjerciciosTema5/heroes.json";

            BufferedReader br = new BufferedReader(new FileReader(filePath));
            StringBuilder sb = new StringBuilder();
            String line;

            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
            br.close();

            JSONParser parser = new JSONParser();
            JSONArray heroes = (JSONArray) parser.parse(sb.toString());

            for (Object obj : heroes) {
                JSONObject hero = (JSONObject) obj;

                String superhero = (String) hero.get("superhero");
                String publisher = (String) hero.get("publisher");

                // Filtrar DC + superhéroes que empiezan por G
                if (publisher.equals("DC Comics") && superhero.startsWith("G")) {

                    // Filtrar personajes que empiezan por G
                    String characters = (String) hero.get("characters");
                    String[] charsArray = characters.split(",");

                    System.out.println("Superhero: " + superhero);
                    System.out.println();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
