import java.util.Random;
import java.util.Scanner;

public class Activida2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int [][] matriz = new int[5][5];
        System.out.println("ponme el maximo valores que quieres");
        int maximov  = teclado.nextInt();
        System.out.println("ponme el minimo valores que quieres");
        int minimov  = teclado.nextInt();
        
        Random random = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = random.nextInt(maximov - minimov);
            }
        }
         int opcion;
        do { 
            System.out.println("1 suma ");
            System.out.println("2 max y minimo");
            System.out.println("3 mostrar los valores");
            System.out.println("4 modificar");
            System.out.println("0 salir");
            opcion = teclado.nextInt();
            
            switch (opcion) {
                case 1:
                    calcular(matriz);
                    break;
                case 2:
                    maxmin(matriz);
                    break;
                case 3:
                    mostrar(matriz);
                break;
                case 4:
                    modificar(matriz);
                break;
                default: System.out.println("opcion no valida");
            }
        } while (opcion !=0);
        
    }

    public static void maxmin( int [][] matriz) {
        int max = matriz[0][0], min = matriz [0][0];
        int maxI = 0, maxJ = 0, minI = 0, minJ = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(matriz[i][j] > max){
                    max = matriz[i][j];
                    maxI = i;
                    maxJ = j;
                }
                if(matriz[i][j] < min){
                    min = matriz[i][j];
                    minI = i;
                    minJ = j;
                }
            }
        }
        System.out.println("Máximo: " + max + " en (" + maxI + "," + maxJ + ")");
        System.out.println("Mínimo: " + min + " en (" + minI + "," + minJ + ")");
    }
     public static void calcular( int [][] matriz) {
        int sumaPrincipal=0;
        int sumaSecundaria=0;
        for (int i=0;i<3;i++) {
            sumaPrincipal += matriz[i][i];
            sumaSecundaria += matriz[i][2-i];
        }
        System.out.println("Suma diagonal principal: " + sumaPrincipal);
        System.out.println("Suma diagonal secundaria: " + sumaSecundaria);

        int mediacolumn;
        for(int j = 0; j < matriz.length;j++){
            mediacolumn = 0;
            for(int i = 0; i < matriz.length; i++) {
                mediacolumn += matriz[i][j];
            } 
            System.out.println("Suma columna "+ j +mediacolumn);
        }
    }



    public static void modificar(int [][] matriz) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce una fila (0-5)");
        int fila = teclado.nextInt();
        System.out.print("Introduce una columna (0-5)");
        int columna = teclado.nextInt();

        if(fila >=0 && fila < 5 && columna >= 0 && columna < 5){
            System.out.println("mete un nuevo valor");
            int nuevo = teclado.nextInt();
            matriz[fila][columna] = nuevo;
            
        }else{
            System.out.println("la cordenada no existe");
        }


    }
     public static void mostrar( int [][] matriz) {
        System.out.println("Contenido de la matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
            System.out.printf("%3d", matriz[i][j]);
            }
        System.out.println();
            }
        }
}
