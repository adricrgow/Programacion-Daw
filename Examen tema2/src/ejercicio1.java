import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) throws Exception {
        int preciobase = 8;
        int preciodiaespectador = 5;
        int preciodiapareja = 11;
        int dia;
        int personas;
        boolean tienetarjeta= false;
        double preciofinal;
        double preciofinaldescuento;
        Scanner teclado=new Scanner(System.in);
        System.out.println("pon el día del 1 al 7");
        dia=teclado.nextInt();
        System.out.println("pon el número de personas");
        personas=teclado.nextInt();
        System.out.println("Tienes la tarjeta de socio(True o false)");
        tienetarjeta=teclado.nextBoolean();
        if(dia >= 1 && dia < 3){
            if(tienetarjeta = true){
                preciofinaldescuento = preciobase * personas * 0.9;
                System.out.println("tienes que pagar "  + preciofinaldescuento);
                }else{
                    preciofinal= preciobase * personas;
                    System.out.println("tienes que pagar "  + preciofinal);
                }
        } else if ( dia == 3){
                if(tienetarjeta = true){
                preciofinaldescuento = preciodiaespectador * personas * 0.9;
                System.out.println("tienes que pagar "  + preciofinaldescuento);
                }else{
                    preciofinal= preciodiaespectador * personas;
                    System.out.println("tienes que pagar "  + preciofinal);
                }
        } else if ( dia == 4){
                if(tienetarjeta = true){
                preciofinaldescuento = preciodiapareja * personas * 0.9;
                System.out.println("tienes que pagar "  + preciofinaldescuento);
                }else{
                    preciofinal= preciodiapareja * personas;
                    System.out.println("tienes que pagar "  + preciofinal);
                }

    }else if ( dia >4){
                if(tienetarjeta = true){
                preciofinaldescuento = preciobase * personas * 0.9;
                System.out.println("tienes que pagar "  + preciofinaldescuento);
                }else{
                    preciofinal= preciobase * personas;
                    System.out.println("tienes que pagar "  + preciofinal);
                }
    } else {
        System.out.println("Ese dia no existe");
    }
}
}
