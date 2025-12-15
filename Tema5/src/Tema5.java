
import java.util.InputMismatchException;
import java.util.Scanner;
public class Tema5 {
    
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numero = 0;
    boolean entradaValida = false;
    do {
    System.out.println("Introduce un número entero: ");
    try {
    numero = scanner.nextInt();
    entradaValida = true;
    } catch (InputMismatchException e) {
    System.out.println("¡Cuidado! Solo puedes introducir números enteros.");
    scanner.next(); // Limpiar la entrada inválida
    }
    } while (!entradaValida);
    System.out.println("Has introducido el número: " + numero);
    }
    }
