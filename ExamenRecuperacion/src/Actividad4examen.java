public class Actividad4examen {
    public class Vocales {
    public static void main(String[] args) {
        String ejemplo = "Murciélago";
        if (tieneTodasLasVocales(ejemplo)) {
            System.out.println(ejemplo + " contiene todas las vocales.");
        } else {
            System.out.println(ejemplo + " NO contiene todas las vocales.");
        }
    }
     public static boolean tieneTodasLasVocales(String palabra) {
     
        palabra = palabra.toLowerCase();

        palabra = palabra.replace("á", "a")
                         .replace("é", "e")
                         .replace("í", "i")
                         .replace("ó", "o")
                         .replace("ú", "u");

        return palabra.contains("a") &&
               palabra.contains("e") &&
               palabra.contains("i") &&
               palabra.contains("o") &&
               palabra.contains("u");
    }

}

}
