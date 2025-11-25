
import java.util.Scanner;

public class Actividadestema3 {
    public static void main(String[] args) {
        //actividad 1
        // Scanner teclado=new Scanner(System.in);
        // double radio;
        // double altura;
        // System.out.println("Introduce la altura del cilindro: ");
        // altura= Double.parseDouble(teclado.nextLine());
        // System.out.println("Introduce el radio del cilindro: ");
        // radio=altura= Double.parseDouble(teclado.nextLine());
        // imprimeCilindro(radio,altura);
        // teclado.close();

           
    //actividad 2 
    // for (int numero=1; numero<=20; numero++) {
    //     if (numero%2==0 && numero%3==0) {
    //         System.out.println("Este número es par y divisible entre 3: " + numero);
    //     }
    // }
    // }

    // public static void imprimeCilindro(double radio, double altura){
    //     double area=2*Math.PI*radio*(radio+altura);
    //     double volumen=Math.PI*radio*radio*altura;
    //     System.out.println("El área del cilindro es: "+area);
    //     System.out.println("El volumen del cilindro es: "+volumen);
    // }
    // public static void imprimirParYDivisiblePor3(int numero) {
    // if (numero % 2 == 0 && numero % 3 == 0) {
    //     System.out.println("El número " + numero + " es par y divisible entre 3.");
    // }
    // quitar los 2 
//     int numeros[] = {2,3,5,6,7,2};
//     int contador = 0;
//     for (int i = 0; i < numeros.length; i++) {
//     if(numeros[i] == 2) contador++;
// }
//     int numeros2[] = new int[numeros.length-contador];
//     int j = 0;  // Añadimos esta variable
//     for (int i = 0; i < numeros.length; i++) {  // Cambiamos numeros2.length por numeros.length
//         if(numeros[i] != 2) {
//         numeros2[j] = numeros[i];  // Usamos j en lugar de i
//         j++;  // Incrementamos j
//         }
// }
//      System.out.println(numeros[0]);
//      System.out.println(numeros2[0]);
  
  //Actividad 7

    //     Scanner teclado=new Scanner(System.in);
    //     //Tener una lista de palabras
    //     String palabras[]={"adrian","domingo","programacion","rafael","antonio","aurora","pedro","marggio"};
    //     //Hay que elegir 1
    //     int aleatorio=(int)(Math.random()*(palabras.length-1+1));
    //     String elegida=palabras[aleatorio];
    //     System.out.println(elegida);
    //     //Hay que hacer que tenga *
    //     char palabraOculta[]=new char[elegida.length()];
    //     for(int i=0;i<palabraOculta.length;i++){
    //         palabraOculta[i]='*';
    //     }
    //     //Control de fallos y encontrada la palabra
    //     boolean encontrada=false;
    //     int fallos=0;
    //     final int FALLOS=7;
    //     //Inicio del juego
    //     System.out.println("Bienvenido al juego del ahorcado!!");
    //     do{
    //         System.out.println("Introduce una letra para adivinar la palabra");
    //         System.out.println("Ahora mismo tienes "+fallos+" fallos");
    //         for(int i=0;i<palabraOculta.length;i++){
    //             System.out.print(palabraOculta[i]);
    //         }
    //         System.out.println();
    //         System.out.print("Introduce la letra: ");
    //         String letra=teclado.nextLine();

    //         //Busco si letra está en la palabra elegida
    //         if(elegida.contains(letra)){
    //             System.out.println("La letra está en la palabra");
    //             for(int i=0;i<elegida.length();i++){
    //                 if(elegida.charAt(i)==letra.charAt(0))
    //                     palabraOculta[i]=letra.charAt(0);
    //             }   
    //         }
    //         else{//Si no está incremento fallos
    //             System.out.println("La letra no está en la palabra");
    //             fallos++;
    //         }
    //         //Compruebo si he ganado
    //         int contador=0;
    //         for(int i=0;i<palabraOculta.length;i++){
    //             if(palabraOculta[i]=='*') contador++;
    //         }
    //         if(contador==0){
    //             encontrada=true;
    //         }

    //     }while(!encontrada && fallos!=FALLOS);
    //     //FIN DEL JUEGO
    //     if(encontrada){
    //         System.out.println("ENHORABUENA!! HAS GANADO!!");
    //     }
    //     else{
    //         System.out.println("QUÉ PENA!! HAS PERDIDO!!");
    //     }
    // Actividad 
    //Declarar variables
        String[] alumnos={"Antonio","María","Marggio","Adrián","Nicolás"};
        String[] materias={"Programación","Entornos","Bases Datos","LMSGI"};
        double[][] notas=new double[alumnos.length][materias.length];

        //1- Generar notas aleatorias y función para imprimir la tabla
        generaNotas(notas);
        imprimeNotas(alumnos,materias,notas);

        //2- Quiero hacer la media, máximo y mínimo de un alumno
        // obterDatosALumno(alumnos, notas);

        //3- ¿Cuánto han superado una materia
        // obtenerSuperadosMaterias(materias,notas);
        
        //4- Número de módulos aprobados por el alumno
        obterAprobadosALumno(alumnos,notas);
    }

    public static void imprimeNotas(String[] alumnos, String[] materias, double[][] notas){
        System.out.print("      | ");
        for(int i=0;i<materias.length;i++){//Materias
            System.out.print(materias[i]+" | ");
        }
        System.out.println();
        //Imprimir las notas
        for(int i=0;i<notas.length;i++){
            System.out.print(alumnos[i]+" | ");
            for(int j=0;j<notas[0].length;j++){
                System.out.printf("%2.1f | ",notas[i][j]);
            }
            System.out.println();
        }
        System.out.println();

    }

    public static void generaNotas(double[][] notas){
        for(int i=0;i<notas.length;i++){
            for(int j=0;j<notas[0].length;j++){
                notas[i][j]=(Math.random()*(10));
            }
        }
    }
    public static void obterDatosALumno(String[] alumnos, double[][] notas){
        System.out.print("Introduce el alumno: ");
        Scanner teclado=new Scanner(System.in);
        String nombre=teclado.nextLine();
        int indice=-1;
        //Buscamos el alumno con ese nombre
        for(int i=0;i<alumnos.length;i++){
            if(alumnos[i].equals(nombre)) indice=i;
        }
        if(indice==-1) System.out.println("NO hay notas del alumno "+nombre);
        else{
            //Si está recorro sus notas y calculo
            double[] notasAlumno=notas[indice];
            double maximo=notasAlumno[0];
            double minimo=notasAlumno[0];
            double media=0;
            for(int i=0;i<notasAlumno.length;i++){
                media+=notasAlumno[i];
                if(maximo<notasAlumno[i]) maximo=notasAlumno[i];
                if(minimo>notasAlumno[i]) minimo=notasAlumno[i];
            }
            System.out.println("Nota media del alumno "+nombre+": "+media/notasAlumno.length);
            System.out.println("Nota máxima del alumno "+nombre+": "+maximo);
            System.out.println("Nota mínima del alumno "+nombre+": "+minimo);
        }
    }
    public static void obtenerSuperadosMaterias(String[] materias,double[][]notas){
        System.out.print("Introduce la materia: ");
        Scanner teclado=new Scanner(System.in);
        String nombre=teclado.nextLine();
        int indice=-1;
        //Buscamos el alumno con ese nombre
        for(int i=0;i<materias.length;i++){
            if(materias[i].equals(nombre)) indice=i;
        }
        if(indice==-1) System.out.println("NO existen datos de la materia "+nombre);
        else{
            int aprobadas=0;
            //Si está recorro sus notas y calculo
            for(int i=0;i<notas.length;i++){
                if(notas[i][indice]>=5) aprobadas++;
            }
            System.out.println("Han aprobado la materia "+nombre+": "+aprobadas);
        }
    
    }
    public static void obterAprobadosALumno(String[] alumnos, double[][] notas){
        System.out.print("Introduce el alumno: ");
        Scanner teclado=new Scanner(System.in);
        String nombre=teclado.nextLine();
        int indice=-1;
        //Buscamos el alumno con ese nombre
        for(int i=0;i<alumnos.length;i++){
            if(alumnos[i].equals(nombre)) indice=i;
        }
        if(indice==-1) System.out.println("NO hay notas del alumno "+nombre);
        else{
            //Si está recorro sus notas y calculo
            int aprobadas=0;
            for(int i=0;i<notas[0].length;i++){
                if(notas[indice][i]>=5) aprobadas++;
            }
            System.out.println("El alumno "+nombre+" aprueba "+aprobadas+" módulos");
        }
        
    }
}