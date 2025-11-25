import java.util.Scanner;

public class Actividad1 {
    public static void main(String[] args) throws Exception {
       //actividades pagina 14 diapositiva
    int a=0, b=0, c=0;
    Scanner teclado=new Scanner(System.in);
    System.out.println("Dime el valor de a b c: ");
    a=teclado.nextInt();
    b=teclado.nextInt();
    c=teclado.nextInt();
    // calcular el discriminante
    double x1=0, x2=0;
    double discriminante=Math.pow(b,2)-4*a*c;
    
    if (discriminante<0){
        System.out.println("No tiene solucións");
    } else if (discriminante==0){
        x1=-b/(2*a);
        System.out.println("la unica solución es " + x1);
    }  else {
        x1=(-b+Math.sqrt(discriminante))/(2*a);
        x2=(-b-Math.sqrt(discriminante))/(2*a);
        System.out.println("Las soluciones es: " +x1);
        System.out.println("Las soluciones es: " +x2);
    }
    
    // ejercicio 2 Haz un programa que nos pide una nota y nos indica la calificación (sobresaliente, notable, bien, aprobado, suspenso, nota incorrecta)
    int nota=0;
    System.out.println("Dime la nota: ");
    nota=teclado.nextInt();
    if (nota<5){
        System.out.println("Suspenso");
    } else if (nota<6){
        System.out.println("Aprobado");
    } else if (nota<7){
        System.out.println("Bien");
    } else if (nota<9){
        System.out.println("Notable");
    } else if (nota<=10){
        System.out.println("Sobresaliente");
    } else {
        System.out.println("Nota incorrecta");
    
    }

    // ejercicio 3
    int dia=0, mes=0, ano=0;
    System.out.println("Introduce dia, mes y año: ");
    dia=teclado.nextInt();
    mes=teclado.nextInt();
    ano=teclado.nextInt();

    if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12){
        if (dia>=1 && dia<=31){
            System.out.println("Fecha correcta");
        } else {
            System.out.println("Fecha incorrecta");
        }
    } else if (mes==4 || mes==6 || mes==9 || mes==11){
        if (dia>=1 && dia<=30){
            System.out.println("Fecha correcta");
        } else {
            System.out.println("Fecha incorrecta");

    }
    } else if (mes==2){
        if(dia>=1 && dia<=28){
            System.out.println("Fecha correcta");
        } else if (dia==29){
        if ((ano%4==0 && ano%100!=0) || (ano%400==0)){ // ver si es bisiesto
            System.out.println("Fecha correcta");
        } else { 
            System.out.println("Fecha incorrecta");
        }
        } else {
            System.out.println("Fecha incorrecta");
        }
        
    }
    
    }

}