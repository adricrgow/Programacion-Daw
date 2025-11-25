
import java.util.Scanner;

public class Bucle {
    public static void main(String[] args) {
    //     for (int i=0<5;i++){ 
    //         System.out.println(i); 
    //     }
    //     int j=0;
    //     while (j<5){ //mientras se cumpla la condicion
    //         System.out.println(j);
    //         j++;
    // }
    // do {
    //     System.out.println(k); //se ejecuta al menos una vez
    //     k++;
    // } while (k<5);

    // for(int i=0;i<5;i++){
    // System.out.println(i);
    // if (i==3) break; //rompe el bucle
        
    // }

    // //hacerlo mejor co un bucle while
    // int j=0;
    // boolean continua=true;
    // while (j<5 && continua){
    //     System.out.println(j);
    //     if (j==3) continua=false;
    //     j++;
    // }

    Scanner teclado=new Scanner(System.in);
    int numero=0;
    do {
    System.out.println("Escribe un número entre 1 y 5");
        numero=teclado.nextInt();
    } while (numero<1||numero>5);

}
}
