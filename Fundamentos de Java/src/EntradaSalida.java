import java.util.Scanner;

public class EntradaSalida {
    public static void main(String[] args){
        //Instruciones de salida por pantalla
        // int valor=7;
        // System.out.println(valor);

        // //Usar printf
        // double precio=13.5889;
        // System.out.printf("El precio del producto %s tiene un valor de %5.2f y se han comprado %d","Tablets",precio,valor);
        
        // //Incluir un icono
        // System.out.println("Que ganas tengo de unas vacaciones \u26F1");

        // //Formato reciente de System
        // System.out.println("El precio del producto "+"Tablet "+"tiene un valor de "+precio+ " y se han comprado "+valor);

        // //Formato salida texto
        // System.out.printf("%15s, %-15s \n","Adrián Contreras","Informatico");
    
        // System.out.println("|----------|----------|----------|");
        // System.out.printf("|%-10s|%-10s|%-10s|\n", "Producto","Cantidad","Valor");
        // System.out.println("|----------|----------|----------|");
        // System.out.printf("|%-10s|%d         |%f |\n", "Producto",valor,precio);
        // System.out.println("|----------|----------|----------|");

        // System.out.println("|----------|----------|----------|");
        // System.out.println("|"+"Producto  "+"|"+"Cantidad"  +"  |"+"Precio    "+"|");
        // System.out.println("|----------|----------|----------|");
        // System.out.println("|"+"Producto  "+"|"+valor+"         |"+precio + "   |");
        // System.out.println("|----------|----------|----------|");

        //operaciones de entrada
        // Scanner teclado=new Scanner(System.in);
        // System.out.println("Introduce la cadena de texto deseada ");
        // String cadena=teclado.nextLine();
        //  System.out.println("La cadena introducido es: "+cadena);
        
        
         //teclado.close();

        
 Scanner teclado = new Scanner(System.in);
 System.out.println("Introduce Nombre");
 String nombre = teclado.nextLine();
 System.out.println("Introduce Apellido");
 String apellido = teclado.nextLine();
 System.out.println("Introduce Edad");
 //int edad = teclado.nextInt();
 int edad=Integer.parseInt(teclado.nextLine());
 //teclado.nextline(); //limpiar buffer
 System.out.println("Introduce Profesión");
 String profesion = teclado.nextLine();
 System.out.println("Nombre: " + nombre + ", Apellido: " + apellido+", Edad: " + edad +", Profesión: " + profesion);
 teclado.close();

    }

}
