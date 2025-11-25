import java.util.Scanner;

public class ArraysActividades {

public static void  imprimeMatriz(int[][]matriz) {
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            System.out.println(matriz[i][j] + " ");
        }
        System.out.println();
    }
}
   public static void main(String[] args) {
        // int[][] matriz = {
        //     {1,2,3,4,5},
        //     {2,3,4,5},
        //     {3,4,5},
        //     {4,5},
        //     {5}
        // };
        // for (int i = 0; i < matriz.length; i++) { //recore las filas
        //     for (int j = 0; j < matriz[i].length; j++) { //recorre las columnas
        //     System.out.print(matriz[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        //Realiza una función que busca un número en un array e indica dónde está
        // int[] vector = {1,2,3,4,5,6,7,8,9,10};
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Introduce un número a buscar:");
        // int num = scanner.nextInt();
        // boolean encontrado=false;
        // for (int i = 0; i < vector.length; i++) {
        //     if(vector[i]==num){
        //         System.out.println("El número " + num + " está en la posición " + i);
        //         encontrado=true;
        //     }

        //Realiza un programa que muestra tu horario y qué clases tienes hoy
        // String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes"};
        // String[][] horario = {
        //     {"IPE", "Sisemas informáticos", "Base de datos", "Base de datos", "Programación","Programación"},
        //     {"Lenguaje de Marcas", "Sisemas informáticos", "Sistemas Informáticos", "Programación", "Programación","Entornos de desarrollo"},
        //     {"Base de Datos", "Base de Datos", "Sistemas Informáticos", "Sistemas Informáticos", "Programación","Programación"},
        //     {"Programación", "Entornos de desarrollo", "Entornos de desarrollo", "IPE", "Base de Datos","Sotenibilidad"},
        //     {"Base de Datos", "Digitalización", "Lenguaje de Marcas", "Lenguaje de Marcas", "IPE","Programación"}
        // };
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Introduce un día de la semana (Lunes a Viernes):");
        // String dia = scanner.nextLine();
        // boolean diaValido = false;
        // for (int i = 0; i < dias.length; i++) {
        //     if(dias[i].equalsIgnoreCase(dia)){
        //         diaValido = true;
        //         System.out.println("Horario del " + dias[i] + ":");
        //         for (int j = 0; j < horario[i].length; j++) {
        //             System.out.println((j + 1) + "ª hora: " + horario[i][j]);
        //         }       
        //     }
        // }
        // Realiza un programa que inserta valores en una matriz dinámica y devuelva la suma de los valores de cada fila y columna
        

         //Vamos a solicitar filas y columnas
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduzca filas: ");
        int filas=teclado.nextInt();
        System.out.println("Introduzca columnas: ");
        int columnas=teclado.nextInt();

        //Generar la matriz dinámica
        int[][] matriz = new int[filas][columnas];

        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                matriz[i][j]=(int)(Math.random()*10)+1;
            }
        }
        //Imprimir la matriz
        imprimeMatriz(matriz);

        //Suma de los elementos de cada fila
        int[] resultadoFila = new int[filas];
        int[] resultadoColumna = new int[columnas];

        //Recorrer por filas
        for(int i=0;i<filas;i++){
            int total=0;
            for(int j=0;j<columnas;j++){
                total=total+matriz[i][j];
            }
            resultadoFila[i]=total;
        }
        //Mostar las sumas
        System.out.println("SUmas por filas:");
        for(int i=0;i<filas;i++){
            System.out.println(resultadoFila[i]);
        }

        //Recorrer por columnas
        for(int i=0;i<columnas;i++){
            int total=0;
            for(int j=0;j<filas;j++){
                total=total+matriz[j][i];
            }
            resultadoColumna[i]=total;
        }
        //Mostar las sumas
        System.out.println("SUmas por columnas:");
        for(int i=0;i<columnas;i++){
            System.out.println(resultadoColumna[i]);
        }
        teclado.close();
        


        
    }
}





