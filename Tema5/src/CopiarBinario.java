import java.io.*;

public class CopiarBinario {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("./Tema5/heroes.json");
        FileOutputStream out = new FileOutputStream("copia_heroes.json");

        int n = 0, c;
        System.out.println("\nCopiando...");

        while ((c = in.read()) != -1) {
            out.write(c);
            n++;
        }

        in.close();
        out.close();

        System.out.println("\nSe han copiado " + n + " bytes.");
    }
}
