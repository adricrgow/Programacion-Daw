package Ejercicio3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Actividad3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
         try {
            List<String> espanol = Arrays.asList(
                "caliente", "rojo", "ardiente", "verde", "agujetas", "abrasador", "hierro", "grande"
            );
            Map<String, Integer> DiccionarioEspanolIngles = new HashMap<>();
            for (String esp : espanol) {
                if (DiccionarioEspanolIngles.containsKey(esp)) {
                    int veces = DiccionarioEspanolIngles.get(esp);
                DiccionarioEspanolIngles.put(esp, veces + 1);

                DiccionarioEspanolIngles.put(esp, 1);
            }
        }
            } catch (FileNotFoundException e) {
            System.out.println("Error.");
        }
        
        }

    }
    

