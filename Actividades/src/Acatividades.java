
public class Acatividades {
 

    public static void main(String[] args) throws Exception {
       //Actividad tema 2 diapositiva 9
       //Realiza un programa que genera 2 números y nos diga el cociente, la media, la potencia y la raíz cuadrada. Usa tipos adecuados
       /*
        * pseudocódigo
        inicio
        * generar num1 aleatorio
        * generar num2 aleatorio
        * Hacer cociente, media, potencia y raíz cuadrada
        * Imprimir cociente, media, potencia y raíz cuadrada de cada número
        fin
        */

        //numero aleatorio entre 1 y 100
        int min=1, max=10;
        int numero1=(int)(Math.random()*(max-min+1)+min);
        int numero2=(int)(Math.random()*(max-min+1)+min);

        //hacer cociente, media, potencia y raíz cuadrada
        int cociente=numero1/numero2;
        double media=(numero1+numero2)/2.0;
        double potencia=Math.pow(numero1,numero2);
        double raiz1=Math.sqrt(numero1);
        double raiz2=Math.sqrt(numero2);

        //sacar resultados
        System.out.println("Los números generados son: " + numero1 + " y " + numero2);
        System.out.println("El cociente es: " + cociente);
        System.out.println("La media es: " + media);
        System.out.println("La potencia es: " + potencia);
        System.out.println("La raíz cuadradada del número1 es: " + raiz1);
        System.out.println("La raíz cuadradada del número2 es: " + raiz2);

        //uso de funciones propias externas
        // System.out.println(Matematicas.sumar(5,3));

           //uso de funciones propias externas
// public class Acatividades {
//     public class Matematicas {
//      public static int sumar(int a, int b) {
//  return a + b;
//  }
//  public static int multiplicar(int a, int b) {
//  return a * b;
//  }
// }
    }
}
