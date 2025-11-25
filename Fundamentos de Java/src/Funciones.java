//import static java.lang.Math.pow;
import java.time.LocalDateTime;
public class Funciones {
    public static void main(String[] args) {

    LocalDateTime hoy = LocalDateTime.now();
 System.out.println("Hoy es: " + hoy.getDayOfWeek()); // nombre del día
 System.out.println("El día es: " + hoy.getDayOfMonth());
 System.out.println("El mes es: " + hoy.getMonth()); // nombre del mes
 System.out.println("El año es: " + hoy.getYear());
 System.out.println("Hora: " + hoy.getHour() + " Minutos: " + hoy.getMinute());

 //Traramiento de Math
    System.out.println(Math.pow(2,8));

// Crear numero aleatorio
//int aleatorio=(int)(Math.random()*(max-min+1)+min);

int min=1;
int max=15;
int aleatorio=(int)(Math.random()*(max-min+1)+min);
System.out.println(aleatorio);

//operadores
// ++ y --
//no es lo mismo variable++ que ++variable
int valor=1;
valor=--valor;
System.out.println(valor);
valor=valor-1;
System.out.println(valor);

//Expresiones relacionales
    System.out.println((5>3)||(5>6));

//operadores opera-asigna
    int numero11=3;
    int numero12=4;
    numero11+=numero12;
    System.out.println(numero11);

    int a=3, b=5;
    int x=a==10 ? b*2:a;
    System.out.println(x);

}
}