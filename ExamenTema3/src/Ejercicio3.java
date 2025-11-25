public class Ejercicio3 {
    public static void main(String[] args) {
        int[][] enteros = new int[5][5];

        for (int i = 0; i < enteros.length; i++) {
            for (int j = 0; j < enteros.length; j++) {
                enteros[i][j] = (int)(Math.random() * 50);
            }
        }
        System.out.println("Matriz original:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(enteros[i][j]);
            }
            System.out.println();
            
        }
        int maximo = enteros[0][0];
        int minimo = enteros[0][0];

        // Buscar min y max
        for (int i= 1; i < enteros.length; i++) {
            for (int j = 0; j < enteros.length; j++) {
                if (enteros[i][j] > maximo) {
                maximo = enteros[i][j];
            }
            if (enteros[i][j] < minimo) {
                minimo = enteros[i][j];
            }
            System.out.println("maximo"+maximo );
            System.out.println("minimo" + minimo);
            }
            
        }
    int suma = 0 ;
    

        for(int i = 0; i < enteros.length; i++){
            for (int j = 0; j < enteros.length; j++) {
            suma = suma + enteros[i][j];
            }
            

        }
        System.out.println("Los precios son:" + suma);

}

}
