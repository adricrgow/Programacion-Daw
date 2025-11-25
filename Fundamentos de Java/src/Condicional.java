import java.util.Scanner;

public class Condicional {
    public static void main(String[] args) {
// comprobar si un numero es divisible por 2 o por 3
    // int numero= 10;
    // if (numero%2==0 && numero%3==0){
    //     System.out.println("El número es divisible por 2 y por 3");
    // } else {
    //     System.out.println("El número no es divisible ni por 2 ni por 3");
    // }

    // // programa al que le digo un número entero y me dice que dia del mes es
    // Scanner teclado=new Scanner(System.in);
    // System.out.println("Dime un número: ");
    // int mes=teclado.nextInt();

    // if (mes==1){
    //     System.out.println("Enero");
    // } else if (mes==2){
    //     System.out.println("Febrero");
    // } else if (mes==3){
    //     System.out.println("Marzo");
    // } else if (mes==4){
    //     System.out.println("Abril");
    // } else if (mes==5){
    //     System.out.println("Mayo");
    // } else if (mes==6){
    //     System.out.println("Junio");
    // } else if (mes==7){
    //     System.out.println("Julio");
    // } else if (mes==8){
    //     System.out.println("Agosto");
    // } else if (mes==9){
    //     System.out.println("Septiembre");
    // } else if (mes==10){
    //     System.out.println("Octubre");
    // } else if (mes==11){
    //     System.out.println("Noviembre");
    // } else if (mes==12){
    //     System.out.println("Diciembre");
    // } else {
    //     System.out.println("no hay mas meses");
    // }
    // ahora vamos a hacer con el comando switch
    Scanner teclado=new Scanner(System.in);
    System.out.println("Dime un número: ");
    int numero2=teclado.nextInt();
    switch (numero2) {
        case 1: System.out.println("Enero");break;
        case 2: System.out.println("Febrero");break;
        case 3: System.out.println("Marzo");break;
        case 4: System.out.println("Abril");break;
        case 5: System.out.println("Mayo");break;
        case 6: System.out.println("Junio");break;
        case 7: System.out.println("Julio");break;
        case 8: System.out.println("Agosto");break;
        case 9: System.out.println("Septiembre");break;
        case 10: System.out.println("Octubre");break;
        case 11: System.out.println("Noviembre");break;
        case 12: System.out.println("Diciembre");break;
        default: System.out.println("No hay más meses");break;
    }
}
}