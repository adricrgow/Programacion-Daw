import java.util.ArrayList;
import java.util.Scanner;

public class Relaciondeejerciciostema3 {
    // Actividad 8: Función para verificar si una frase es palíndroma
    
    public static void main(String[] args){
        
        
        //Actividad 1
    //     int[] vector=null;
    //     vector=push(vector,3);
    //     vector=push(vector,5);
    //     for(int i=0;i<vector.length;i++){
    //         System.out.println(vector[i] + " ");
    //     }
        // Actividad 2
        // Scanner teclado = new Scanner(System.in);
        // int[] vector = null;
        // int numeros;
        // System.out.println("¿Cuántos números deseas introducir? ");
        // numeros = teclado.nextInt();

        // for (int i = 0; i < numeros; i++) {
        //     System.out.print("Introduce el número " + (i + 1) + ": ");
        //     int numero = teclado.nextInt();
        //     vector = push(vector, numero);
        // }

        // System.out.println("Vector original:");
        // mostrarvectororignial(vector);

        // ordenarDescendente(vector);

        // System.out.println("Vector ordenado de mayor a menor:");
        // mostrarvectororignial(vector);

        // teclado.close();

        // Actividad 3
        // int[] datos = { 10, 5, 9, 8, 12 };
        // int[] resultado = minmax(datos);
        // System.out.println("Mínimo: " + resultado[0]);
        // System.out.println("Máximo: " + resultado[1]);

        // Actividad 4
        // Scanner teclado = new Scanner(System.in);
        // int [] ganador = {14,15,30,29,40,39,};
        // int [] jugador = new int[6];
        // System.out.println("Introduce tus 6 números del décimo:");
        // for (int i = 0; i < jugador.length; i++) {
        //     System.out.print("Número " + (i + 1) + ": ");
        //     jugador[i] = teclado.nextInt();
        // }
        // System.out.print("Números ganadores: ");
        // mostrarArray(ganador);

        // System.out.print("Tus números: ");
        // mostrarArray(jugador);

        // int aciertos = contarAciertos(ganador, jugador);
        // System.out.println("Has tenido " + aciertos);

        // teclado.close();

        // Actividad 5
        // Scanner teclado = new Scanner(System.in);
        // actividad5ArrayList(teclado);
        // teclado.close();

        // Actividad 6
        
    // int[][] matriz1 = {
    //     {1, 2, 3},
    //     {4, 5, 6}
    // };
    // int[][] matriz2 = {
    //     {2, 3, 4},
    //     {5, 6, 7}
    // };

    // // Calcular resultados por columnas
    // int[] sumas = new int[3];    
    // int[] productos = new int[3];    
    // double[] medias = new double[3];

    // // Procesar cada columna
    // for (int j = 0; j < 3; j++) {
    //     sumas[j] = matriz1[0][j] + matriz1[1][j] + matriz2[0][j] + matriz2[1][j];
    //     productos[j] = matriz1[0][j] * matriz1[1][j] * matriz2[0][j] * matriz2[1][j];
    //     medias[j] = sumas[j] / 4.0;
    // }

    //     System.out.print("Suma por columnas: ");
    //     for (int v : sumas) System.out.print(v + " ");
    //     System.out.println();

    //     System.out.print("Producto por columnas: ");
    //     for (int v : productos) System.out.print(v + " ");
    //     System.out.println();

    //     System.out.print("Media por columnas: ");
    //     for (double v : medias) System.out.printf("%.2f ", v);
    //     System.out.println();

    // Actividad 7
        // int[][] matriz = new int[5][5];
        // int[][] rotada = new int[5][5];
        
        
        // for (int i = 0; i < 5; i++) {
        //     for (int j = 0; j < 5; j++) {
        //         matriz[i][j] = (int)(Math.random() * 101);
        //     }
        // }
        
        // // Mostrar matriz original
        // System.out.println("Matriz original:");
        // for (int i = 0; i < 5; i++) {
        //     for (int j = 0; j < 5; j++) {
        //         System.out.printf("%3d ", matriz[i][j]);
        //     }
        //     System.out.println();
        // }
        
        // // Copiar el centro que no cambia
        // for (int i = 1; i < 4; i++) {
        //     for (int j = 1; j < 4; j++) {
        //         rotada[i][j] = matriz[i][j];
        //     }
        // }
        
        // // Rotar los bordes
        // // Superior: se mueve a la derecha
        // for (int j = 0; j < 4; j++) {
        //     rotada[0][j+1] = matriz[0][j];
        // }
        // // Derecho: se mueve hacia abajo
        // for (int i = 0; i < 4; i++) {
        //     rotada[i+1][4] = matriz[i][4];
        // }
        // // Inferior: se mueve a la izquierda
        // for (int j = 4; j > 0; j--) {
        //     rotada[4][j-1] = matriz[4][j];
        // }
        // // Izquierdo: se mueve hacia arriba
        // for (int i = 4; i > 0; i--) {
        //     rotada[i-1][0] = matriz[i][0];
        // }
        
        // // Mostrar matriz rotada
        // System.out.println("\nMatriz rotada:");
        // for (int i = 0; i < 5; i++) {
        //     for (int j = 0; j < 5; j++) {
        //         System.out.printf("%3d ", rotada[i][j]);
        //     }
        //     System.out.println();
        // }
        // Activida 8
        // String[] frases = {
        //     "Dábale arroz a la zorra el abad",
        //     "Acaso hubo búhos acá",
        //     "Esta frase no es un palíndromo",
        //     "Ana lleva al oso la avellana"
        // };

        // System.out.println("Verificación de palíndromos\n");
        // for (String frase : frases) {
        //     System.out.println("Frase: \"" + frase + "\"");
        //     System.out.println("¿Es palíndromo? " + (esPalindromo(frase) ? "Sí" : "No"));
        //     System.out.println();
        // }
        
        // Actividad 9 
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        int opcion;

        do {
            // Menú simple
            System.out.println("\nMENU:");
            System.out.println("1. Agregar número");
            System.out.println("2. Eliminar número");
            System.out.println("3. Mostrar números");
            System.out.println("4. Buscar número");
            System.out.println("5. Borrar todo");
            System.out.println("6. Ver tamaño");
            System.out.println("7. Salir");
            System.out.print("Elige: ");
            
            opcion = teclado.nextInt();
            
            switch (opcion) {
                case 1: 
                    System.out.print("Número a agregar: ");
                    int num = teclado.nextInt();
                    if (num >= 0) {
                        numeros.add(num);
                        System.out.println("Número agregado");
                    } else {
                        System.out.println("El número debe ser positivo");
                    }
                    break;
                    
                case 2: 
                    System.out.print("Número a eliminar: ");
                    numeros.removeIf(n -> n == teclado.nextInt());
                    break;
                    
                case 3: 
                    System.out.println(numeros);
                    break;
                    
                case 4: 
                    System.out.print("Número a buscar: ");
                    System.out.println(numeros.contains(teclado.nextInt()) ? "Sí está" : "No está");
                    break;
                    
                case 5: 
                    numeros.clear();
                    System.out.println("Lista vacía");
                    break;
                    
                case 6: 
                    System.out.println("Tamaño: " + numeros.size());
                    break;
            }
        } while (opcion != 7);
        
       
        
         teclado.close();
    }
    // Actividad 8 
    // public static boolean esPalindromo(String frase) {
    //     // Convertir a minúsculas y quitar espacios, tildes y signos
    //     String limpia = frase.toLowerCase()
    //         .replace('á', 'a')
    //         .replace('é', 'e')
    //         .replace('í', 'i')
    //         .replace('ó', 'o')
    //         .replace('ú', 'u')
    //         .replace(" ", "")
    //         .replace(",", "")
    //         .replace(".", "");
            
    //     // Comparar la cadena con su versión invertida
    //     String invertida = new StringBuilder(limpia).reverse().toString();
    //     return limpia.equals(invertida);
    // }


    // //actividad 5
    // public static void actividad5ArrayList(Scanner teclado) {
    //     // Números ganadores
    //     ArrayList<Integer> ganador = new ArrayList<>();
    //     ganador.add(14);
    //     ganador.add(15);
    //     ganador.add(30);
    //     ganador.add(29);
    //     ganador.add(40);
    //     ganador.add(39);
    //     ArrayList<Integer> jugador = new ArrayList<>();
    //     System.out.println("Introduce tus 6 números del décimo:");
    //     for (int i = 0; i < 6; i++) {
    //         System.out.print("Número " + (i + 1) + ": ");
    //         int num = teclado.nextInt();
    //         jugador.add(num);
    //     }

    //     System.out.print("Números ganadores: ");
    //     mostrarArrayList(ganador);
    //     System.out.print("Tus números: ");
    //     mostrarArrayList(jugador);

    //     int aciertos = contarAciertosArrayList(ganador, jugador);
    //     System.out.println("Has tenido " + aciertos + " aciertos.");
    // }

   

    // public static void mostrarArrayList(ArrayList<Integer> lista) {
    //     for (Integer n : lista) System.out.print(n + " ");
    //     System.out.println();
    // }

    // public static int contarAciertosArrayList(ArrayList<Integer> ganadores, ArrayList<Integer> usuario) {
    //     int aciertos = 0;
    //     for (Integer num : usuario) {
    //         if (ganadores.contains(num)) aciertos++;
    //     }
    //     return aciertos;
    // }
    // Actividad 4
    //  public static void mostrarArray(int[] array) {
    //     for (int num : array) {
    //         System.out.print(num + " ");
    //     }
    //     System.out.println();
    // }
    // public static int contarAciertos(int[] ganadores, int[] usuario) {
    //     int aciertos = 0;
    //     for (int i = 0; i < usuario.length; i++) {
    //         for (int j = 0; j < ganadores.length; j++) {
    //             if (usuario[i] == ganadores[j]) {
    //                 aciertos++;
    //             }
    //         }
    //     }
    //     return aciertos;
    // }
    // Actividad 3
    //     public static int[] minmax(int[] array) {
    //         int min = array[0];
    //         int max = array[0];
    //         if (array == null || array.length == 0) {
    //         return null;
    //     }
    //     for (int i = 1; i < array.length; i++) {
    //         if (array[i] < min) {
    //             min = array[i];
    //         }
    //         if (array[i] > max) {
    //             max = array[i];
    //         }
    //     }
    //     return new int[] { min, max };
    // }
    
    // public static int[] push(int[] array,int valor){
    //     int longitud;
    //     if (array==null) longitud=0;
    //     else longitud=array.length;
    //     //crear el array con +1 de tamaño
    //     int[] salida=new int[longitud+1];
    //     //Copiar lo que haya en ese momento
    //     for(int i=0;i<longitud;i++){
    //         salida[i]=array[i];
    //     }
    //     salida[longitud]=valor;
    //     return salida;

    // }
            // Actividad 2
    // public static void mostrarvectororignial(int [] array){
    //     if(array==null){
    //         System.out.println("Vector original");
    //         return;
    //     }
    //     for(int i =0; i < array.length; i++){
    //         System.out.print(array[i]);
    //     }
    //     System.out.println();
    // }
            // Actividad 2
    // public static void ordenarDescendente(int[] array) {
    //     if (array == null) return;
    //     for (int i = 0; i < array.length - 1; i++) {
    //         for (int j = 0; j < array.length - i - 1; j++) {
    //             if (array[j] < array[j + 1]) {
    //                 int temporal = array[j];
    //                 array[j] = array[j + 1];
    //                 array[j + 1] = temporal;
    //             }
    //         }
    //     }
    // }


    // public static int[] pop(int[] array){
    //     if (array == null || array.length == 0) {
    //         return array;
    //     }
    //     int[] nuevo = new int[array.length - 1];
    //     // copiar hasta el tamaño de nuevo
    //     for (int i = 0; i < nuevo.length; i++) {
    //         nuevo[i] = array[i];
    //     }
    //     return nuevo;
    

    

    
}