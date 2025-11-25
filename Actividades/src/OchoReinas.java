import java.util.Scanner;

public class OchoReinas {

    static final int N = 8; // Tamaño del tablero 8x8

    public static void main(String[] args) {
        int[][] tablero = new int[N][N]; // Inicializado con ceros automáticamente
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la columna (0-7) donde colocar la primera reina en la fila 0: ");
        int primeraColumna = sc.nextInt();

        // Validar la entrada del usuario
        if (primeraColumna < 0 || primeraColumna >= N) {
            System.out.println("Columna inválida. Debe estar entre 0 y 7.");
            return;
        }

        tablero[0][primeraColumna] = 1; // Colocar la primera reina

        if (resolver(tablero, 1)) {
            imprimirTablero(tablero);
        } else {
            System.out.println("No hay solución con la reina en esa columna.");
        }

        sc.close();
    }

    // Función recursiva para colocar las reinas fila por fila
    public static boolean resolver(int[][] tablero, int fila) {
        // Caso base: todas las reinas colocadas
        if (fila == N) {
            return true;
        }

        // Intentar colocar una reina en cada columna
        for (int col = 0; col < N; col++) {
            if (esSeguro(tablero, fila, col)) {
                tablero[fila][col] = 1; // Colocar reina

                // Llamada recursiva para la siguiente fila
                if (resolver(tablero, fila + 1)) {
                    return true;
                }

                // Si no funciona, quitar la reina (backtracking)
                tablero[fila][col] = 0;
            }
        }

        return false; // No se pudo colocar una reina válida en esta fila
    }

    // Verifica si es seguro colocar una reina en (fila, col)
    public static boolean esSeguro(int[][] tablero, int fila, int col) {
        // Revisar columna hacia arriba
        for (int i = 0; i < fila; i++) {
            if (tablero[i][col] == 1) {
                return false;
            }
        }

        // Revisar diagonal superior izquierda
        for (int i = fila - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (tablero[i][j] == 1) {
                return false;
            }
        }

        // Revisar diagonal superior derecha
        for (int i = fila - 1, j = col + 1; i >= 0 && j < N; i--, j++) {
            if (tablero[i][j] == 1) {
                return false;
            }
        }

        return true; // Ninguna amenaza encontrada
    }

    // Imprimir el tablero con las posiciones de las reinas
    public static void imprimirTablero(int[][] tablero) {
        System.out.println("Solución encontrada:\n");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print((tablero[i][j] == 1 ? "Q " : ". "));
            }
            System.out.println();
        }
    }
}