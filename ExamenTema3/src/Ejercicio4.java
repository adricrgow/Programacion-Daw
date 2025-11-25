
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) throws Exception {
        String[] anagrama ={};
        Scanner teclado = new Scanner(System.in);
        for (int i=0; i<anagrama.length; i++) {
            System.out.println("Escribe dos palabras");
            anagrama[i] = teclado.nextLine();
        }
        for (int i = 0; i < anagrama.length; i++) {
        System.out.println(anagrama[i]);
        }

       
    }
    public static boolean verificaAnagrama(String anagrama){
        String verifica = anagrama.toLowerCase()
            .replace('á', 'a')
            .replace('é', 'e')
            .replace('í', 'i')
            .replace('ó', 'o')
            .replace('ú', 'u')
            .replace(" ", "")
            .replace(",", "")
            .replace(".", "");
            char[] cadena=anagrama.toCharArray();
            Arrays.sort(cadena);
        
        return anagrama.equals(verifica);

    }
}
