import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AcividadhashMap {

        List<String> marcas = Arrays.asList(
                "BMW", "Audi", "Seat", "Mercedes", "Toyota", "Citroën", "Renault"
        );

        Map<String, Integer> contador = new HashMap<>();{
            for (String marca : marcas) {

            // Si la marca ya existe, incrementamos su contador
            if (contador.containsKey(marca)) {
                int veces = contador.get(marca);
                contador.put(marca, veces + 1);
            } else {
                // Si no existe, la añadimos con valor 1
                contador.put(marca, 1);
            }
        }

        // Imprimir resultados
        for (String marca : contador.keySet()) {
            System.out.println(marca + " → " + contador.get(marca));
        }

      
        }
    }

