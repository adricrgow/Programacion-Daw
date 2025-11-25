import java.util.Scanner;

public class Actividadesbucle {
    public static void main(String[] args) {
    //   //Repetir numero de 50 a 200
    //   for(int numero=50;numero<=200;numero++){
    //   if(numero%2 ==0 && numero%3==0)
    //     System.out.println(numero);
    //   }

    // //actividad 2

    // int producto=1,factorial=5;
    // for(int i=1;i<=factorial;i++){
    //     producto=producto*1;
    // }
    // System.out.println(producto);

    //actividad 3 leer número de edades
    // int maximo=0;
    // int minimo=120;
    // int contadorPersonas=0;
    // Scanner teclado = new Scanner(System.in);
    // int edad;
    // do { 
    //     System.out.println("Introduce una edad o -1 para salir: ");
    //     edad=teclado.nextInt();
    //     if(edad!=-1) contadorPersonas++;

    //     if(edad>maximo){
    //       maximo=edad;
    //     }
    //     if(edad<minimo && edad!=-1){
    //       minimo=edad;
    //     }
    // } while (edad!=-1);
    // System.out.println("Has introducido "+contadorPersonas+" edades");
    // System.out.println("La edad máxima es: "+maximo);
    // System.out.println("La edad mínima es: "+minimo);
    // teclado.close();

    //actividad 4 Continúa el programa anterior para que calcule la suma,media, número de alumnos y cuántos son mayores de edad

    // Scanner teclado = new Scanner(System.in);

    // int edad;
    // int contadorPersonas = 0;
    // int sumaEdades = 0;
    // int mayoresEdad = 0;
    // double media = 0;
    // do {
    //     System.out.println("Introduce una edad o -1 para salir: ");
    //     edad = teclado.nextInt();
    //     if (edad != -1) {
    //         contadorPersonas++;
    //         sumaEdades += edad;
    //         if (edad >= 18) {
    //             mayoresEdad++;
    //         }
    //     }
    // } while (edad != -1);
    // if (contadorPersonas > 0) {
    //     media = sumaEdades / (double) contadorPersonas;
    // }
    // System.out.println("Has introducido " + contadorPersonas + " edades");
    // System.out.println("La suma de las edades es: " + sumaEdades);
    // System.out.println("La media de las edades es: " + media);
    // System.out.println("Número de alumnos mayores de edad: " + mayoresEdad);
    // teclado.close();

    //actividad 5
    // Scanner teclado = new Scanner(System.in);
    // int numeroaleatorio=(int)(Math.random()*100+1);
    // int numero=0;
    // int intentos=0;
    // System.out.println("Adivina el número entre 1 y 100");
    // do {
    //     System.out.println("Introduce un número: ");
    //     numero=teclado.nextInt();
    //     intentos++;
    //     if(numero<numeroaleatorio){
    //         System.out.println("El número es mayor");
    //     } else if (numero>numeroaleatorio){
    //         System.out.println("El número es menor");
    //     } else {
    //         System.out.println("Has acertado el número en "+intentos+" intentos");


    // }
    // } while (numero!=numeroaleatorio);
    // teclado.close();
  //actividad 6
  // Scanner teclado = new Scanner(System.in);
  // int numero1=0;
  // int numero2=0;
  // int suma=0;
  // String operacion="";
  // int resta=0;
  // int multiplicacion=0;
  // int division=0;
  // do{
  //   System.out.println("Quieres hacer alguna operación o quieres salir pon -1.");
  //   operacion=teclado.nextLine().toLowerCase();
  //   if (operacion.equals("suma")) {
  //     System.out.println("Introduce el primer número: ");
  //     numero1=teclado.nextInt();
  //     System.out.println("Introduce el segundo número: ");
  //     numero2=teclado.nextInt();
  //     suma=numero1+numero2;
  //     System.out.println("El resultado de la suma es: "+suma);
  //     teclado.nextLine();
  //   } else if (operacion.equals("resta")) {
  //     System.out.println("Introduce el primer número: ");
  //     numero1=teclado.nextInt();
  //     System.out.println("Introduce el segundo número: ");
  //     numero2=teclado.nextInt();
  //     resta=numero1-numero2;
  //     System.out.println("El resultado de la resta es: "+resta);
  //     teclado.nextLine();
  //   } else if (operacion.equals("multiplicacion")) {
  //     System.out.println("Introduce el primer número: ");
  //     numero1=teclado.nextInt();
  //     System.out.println("Introduce el segundo número: ");
  //     numero2=teclado.nextInt();
  //     multiplicacion=numero1*numero2;
  //     System.out.println("El resultado de la resta es: "+multiplicacion);
  //     teclado.nextLine();
  //   } else if (operacion.equals("division")) {
  //     System.out.println("Introduce el primer número: ");
  //     numero1=teclado.nextInt();
  //     System.out.println("Introduce el segundo número: ");
  //     numero2=teclado.nextInt();
  //     division=numero1/numero2;
  //     System.out.println("El resultado de la resta es: "+division);
  //     teclado.nextLine();
  //   }
  //   } while(!operacion.equals("-1"));
  //   teclado.close();

  //bucles anidados
  // for(int i=1;i<=4;i++){
  //   if(i%2==0)
  //   for(int j=1;j<=i;j++){
  //     System.out.print("*");
  //   }
  //   System.out.println("");
  // }

  // for(int i=1;i<=10;i++){
  //   for(int j=1;j<=10;j++){
  //     System.out.println(i+"*"+j+"="+i*j);
  //   }
  //   System.out.println("");
  // }
    
  // Actividad 7
 
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el primer número: ");
        int a = Math.abs(teclado.nextInt());

        System.out.println("Introduce el segundo número: ");
        int b = Math.abs(teclado.nextInt());

        teclado.close();
        int a_original = a;
        int b_original = b;

        while (b != 0) {
            int resto = a % b;
            a = b;
            b = resto;
        }

        int mcd = a;
        int mcm = Math.abs(a_original * b_original) / mcd;

        System.out.println("El máximo común divisor es: " + mcd);
        System.out.println("El mínimo común múltiplo es: " + mcm);
    }

  
  

}
