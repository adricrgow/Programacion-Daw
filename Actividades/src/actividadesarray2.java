public import java.util.*;

import java.util.List;

import java.util.Arrays;

import java.util.Scanner;

public class actividadesarray2 {
    private static final int TOTAL_TEMAS = 65;
    private static final int BOLAS_A_SACAR = 5;

    private static final List<Integer> TEMAS_OPOSITOR = Arrays.asList(
            4, 11, 23, 34, 35, 36, 39, 50, 60, 65
    );

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> sorteo = new ArrayList<>();
        int opcion;
        do {
            System.out.println("\n--- Menú Oposiciones ---");
            System.out.println("1. Generar vector aleatorio sin repetidos (5 números de 1..65)");
            System.out.println("2. Validar coincidencias con los temas del opositor");
            System.out.println("0. Salir");
            System.out.print("Elige opción: ");
            opcion = leerEntero();

            switch (opcion) {
                case 1:
                    sorteo = generarVectorAleatorioUnico(BOLAS_A_SACAR, 1, TOTAL_TEMAS);
                    System.out.println("Vector generado: " + sorteo);
                    break;
                case 2:
                    if (sorteo.isEmpty()) {
                        System.out.println("Primero genera el vector (opción 1).");
                    } else {
                        validarCoincidencias(sorteo, new ArrayList<>(TEMAS_OPOSITOR));
                    }
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
    }

    // 1. Generar vector aleatorio sin repetidos
    private static ArrayList<Integer> generarVectorAleatorioUnico(int cantidad, int min, int max) {
        if (cantidad > (max - min + 1)) {
            throw new IllegalArgumentException("No se pueden generar " + cantidad + " únicos en ese rango.");
        }
        Random rnd = new Random();
        HashSet<Integer> usados = new HashSet<>();
        ArrayList<Integer> resultado = new ArrayList<>();
        while (resultado.size() < cantidad) {
            int n = rnd.nextInt(max - min + 1) + min;
            if (!usados.contains(n)) {
                usados.add(n);
                resultado.add(n);
            }
        }
        return resultado;
    }

    private static void validarCoincidencias(ArrayList<Integer> sorteo, ArrayList<Integer> opositor) {
        ArrayList<Integer> coincidencias = new ArrayList<>();
        HashSet<Integer> setSorteo = new HashSet<>(sorteo);
        for (Integer tema : opositor) {
            if (setSorteo.contains(tema)) {
                coincidencias.add(tema);
            }
        }
        Collections.sort(coincidencias);
        if (coincidencias.isEmpty()) {
            System.out.println("Lo siento, no hay coincidencias.");
        } else {
            System.out.println("Temas coincidentes: " + joinEnteros(coincidencias) + ". Enhorabuena");
        }
    }

    private static String joinEnteros(List<Integer> lista) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < lista.size(); i++) {
            sb.append(lista.get(i));
            if (i < lista.size() - 1) sb.append(", ");
        }
        return sb.toString();
    }

    private static int leerEntero() {
        while (true) {
            try {
                String s = sc.nextLine().trim();
                return Integer.parseInt(s);
            } catch (Exception e) {
                System.out.print("Introduce un número válido: ");
            }
        }
    }
}

