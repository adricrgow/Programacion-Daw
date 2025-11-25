import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) throws Exception {
        int jugada;
        int jugadaordenador;
        Scanner teclado=new Scanner(System.in);
        System.out.println("introduce 1 si quieres piedra, 2 si quieres papel y 3 si quieres tijeras -1 para salir");
        jugada=teclado.nextInt();
        jugadaordenador = (int)(Math.random() * 3) + 1;
        if(jugada == 1 && jugadaordenador ==1){
            System.out.println("Jugada del ordenador " + jugadaordenador);
            System.out.println("Empate");
        } else if (jugada == 1 && jugadaordenador ==2){
            System.out.println("Jugada del ordenador " + jugadaordenador);
            System.out.println("has perdido");
        }else if (jugada == 1 && jugadaordenador == 3){
            System.out.println("Jugada del ordenador " + jugadaordenador);
            System.out.println("Has ganado");
        }else if (jugada == 2 && jugadaordenador == 1){
            System.out.println("Jugada del ordenador " + jugadaordenador);
            System.out.println("Has ganado");
        }else if (jugada == 2 && jugadaordenador == 2){
            System.out.println("Jugada del ordenador " + jugadaordenador);
            System.out.println("Empate");
        }else if (jugada == 2 && jugadaordenador == 3){
            System.out.println("Jugada del ordenador " + jugadaordenador);
            System.out.println("Has perdido");
        }else if (jugada == 3 && jugadaordenador == 1){
            System.out.println("Jugada del ordenador " + jugadaordenador);
            System.out.println("has perdido");
        }else if (jugada == 3 && jugadaordenador == 2){
            System.out.println("Jugada del ordenador " + jugadaordenador);
            System.out.println("has ganado");
        }else if (jugada == 3 && jugadaordenador == 2){
            System.out.println("Jugada del ordenador " + jugadaordenador);
            System.out.println("Empate");
        }else if (jugada == -1){
            System.out.println("te has salido");
        } else {
            System.out.println("No existe esa jugada");
        }
    }
}
