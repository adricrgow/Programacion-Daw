
import java.util.Scanner;

public class App {
     // crear la matriz
       static  int[][] matriz= {{0,0,0},{0,0,0},{0,0,0}};
       // varible de turno, que por defecto empieza en 1
       static boolean turno=true;
       static final int JUEGO1=1;
       static final int JUEGO2=2;

    public static void main(String[] args) throws Exception {
        Scanner teclado=new Scanner(System.in);
        int posicion;
        
       for(int i=0;i<9;i++){
       do{
        System.out.println("Introduce coordenada de la jugada 1 al 9: ");
        posicion =teclado.nextInt();
       } while (!valida) { 
           
       }
        jugada(matriz, turno, posicion);
        if(comprobarganador(matriz, turno)){
            if(turno==true) System.out.println("Ha ganado el jugador 1");
            else System.out.println("Ha ganado el jugador 2");
            break;
        }
        imprimematriz();
        turno=!turno;

    if(comprobarganador(matriz, turno))
        if(turno==true) System.out.println("Ha ganado el jugador 1");
        else System.out.println("Ha ganado el jugador 2");
    
    if(!comprobarganador(matriz, turno))
        System.out.println("Empate");
       }
       teclado.close();
    }
    
    // do{
    //     System.out.println("Introduce coordenada de la jugada 1 al 9: ");
    //     posicion =teclado.nextInt();
    //     jugada(matriz, turno, posicion);
    //     imprimematriz();
    //     turno=!turno; 
    // }while(!comprobarganador(matriz, turno));
    // if(turno==false) System.out.println("Ha ganado el jugador 1");
    // else System.out.println("Ha ganado el jugador 2");
        
    //     teclado.close();
    // }

    
    
    public static void imprimematriz() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void jugada(int [][] matriz, boolean turno, int posicion) {
       int valor;
       if (turno==true) valor=JUEGO1;
       else{ valor=JUEGO2;}
        switch(posicion){
            case 1:
                matriz[0][0]=valor;
                break;
            case 2:
                matriz[0][1]=valor;
                break;
            case 3:
                matriz[0][2]=valor;
                break;
            case 4:
                matriz[1][0]=valor;
                break;
            case 5:
                matriz[1][1]=valor;
                break;
            case 6:
                matriz[1][2]=valor;
                break;
            case 7:
                matriz[2][0]=valor;
                break;
            case 8:
                matriz[2][1]=valor;
                break;
            case 9:
                matriz[2][2]=valor;
                break;
        }
    }
    public static boolean comprobarganador(int [][] matriz, boolean turno) {
        //determinar el valor a buscar en la matriz
        int valor;
        if (turno==true) valor=JUEGO1;
        else{ valor=JUEGO2;}
        // gana en las filas
        if(comprobarfila(0,valor)||comprobarfila(1,valor)||comprobarfila(2,valor)) return true;
        else if (compruebacolumna(0,valor)||compruebacolumna(1,valor)||compruebacolumna(2,valor)) return true;
        else if (comprobardiagonal1(valor) || comprobardiagonal2(valor)) return true;
        else return false;
        
    }
    public static boolean comprobardiagonal1( int valor) {
        if (matriz[0][0]==valor && matriz[1][1]==valor && matriz[2][2]==valor)  return true;
        else return false;
        
    }
    public static boolean comprobardiagonal2( int valor) {
        if (matriz[0][2]==valor && matriz[1][1]==valor && matriz[2][0]==valor)  return true;
        else return false;
        
    }
    public static boolean comprobarfila(int fila, int valor) {
        if (matriz[fila][0]==valor && matriz[fila][1]==valor && matriz[fila][2]==valor)  return true;
        else return false;  
}
public static boolean compruebacolumna(int columna, int valor) {
    if (matriz[0][columna]==valor && matriz[1][columna]==valor && matriz[2][columna]==valor)  return true;
    else return false;
    
}
}
