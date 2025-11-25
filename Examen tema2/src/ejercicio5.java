import java.util.Scanner;

public class ejercicio5{
    public static void main(String[] args) throws Exception {
    boolean imprimirtablero;
    Scanner teclado=new Scanner(System.in);
        System.out.println("Pon true o false");
        imprimirtablero=teclado.nextBoolean();
        if(imprimirtablero == true){
            System.out.println("|   |   |   |   |   |   |   |");
            System.out.println("|   |   |   |   |   |   |   |");
            System.out.println("|   |   |   |   |   |   |   |");
            System.out.println("|   |   | X |   |   |   |   |");
            System.out.println("|   |   | 0 | X |   |   |   |");
            System.out.println("|   | X | 0 | 0 |   |   |   |");
            System.out.println("| X | 0 | X | 0 | X |   |   |");
            System.out.println("-----------------------------");
            System.out.println("  0   1   2   3   4   5   6");
        } else {
            System.out.println("| X | 0 | X |");
            System.out.println("-------------");
            System.out.println("|   | 0 |   |");
            System.out.println("-------------");
            System.out.println("|   | X |   |");
            System.out.println("-------------");
            System.out.println("  0   1   2");
        }
    }
    
}