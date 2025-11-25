import java.util.ArrayList;
import java.util.Scanner;

public class Arrays {
    public static void imprimeMatriz(int[][] matriz){
        for(int i =0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // // String nombre1;
        // // String Apellidos1; 
        // // int edad1;
        // // double notaBD1;
        // // double notaPROG1;
        // // double notaED1;

        // // double calificaciones[]={7,8,2,4,8,9};
        // // System.out.println(calificaciones[5]);

        // // //Array dinámico
        // // double[] calificaciones2;
        // // System.out.println("Indica el tamaño del array calificaciones2: ");
        // // Scanner teclado=new Scanner(System.in);
        // // calificaciones2=new double[teclado.nextInt()];
        // // System.out.println(calificaciones2);


        // // //Arrays que apuntan al mismo sitio
        // // double[] calificacionesOtro;
        // // calificacionesOtro=calificaciones;
        // // System.out.println(calificaciones[1]);
        // // System.out.println(calificacionesOtro[1]);
        // // // calificaciones=null;
        // // // calificacionesOtro=null;
        // // // System.out.println(calificacionesOtro[3]);

        // // //Imprime la posición 1
        // // imprimeArray(calificaciones);
        // // double[] resultado=devolverArray(calificaciones);
        // // System.out.println(resultado[1]);
        // // System.out.println(calificaciones[1]);


        // // //matrices
        // // String[][] comidas={{"arroz","manzana","conejo","celiaco"},{"verdura","pollo","fresa","domingo"},{"patatas","naranja","cerdo","fiesta"}};
        // // System.out.println(comidas[2][3]);
        // // String[] aux=comidas[1];
        // // System.out.println("Matriz: "+comidas[1][2]);
        // // System.out.println("Vector: "+aux[2]);


        // // //Usar la memoria dinámica reservada
        // // calificaciones2[3]=5;
        // // System.out.println(calificaciones2[3]);
        // // System.out.println(calificaciones2[1]);


        // // //acceso a args del main
        // // // System.out.println(args[0]);

        // //RECORRER UN VECTOR
        // int[] vector={7,5,3,4};
        // for(int i=vector.length-1;i>=0;i--){
        //     System.out.print(vector[i]+" ");
        // }
        // System.out.println();

        // //PRÁCTICA RECORRER MATRICES
        // // int[][] matriz2={{1,2,3,4,5},{1,2,3,4},{1,2,3},{1,2},{1}};
        // int[][] matriz2={{3,7,1},{4,-4,2},{5,0,5}};
        // for(int i=0;i<matriz2.length;i++){//Recorre las filas
        //     for(int j=0;j<matriz2[i].length;j++){
        //         System.out.print(matriz2[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        
        
        // int[] vector2={1,2,3,4,5,6,7,6};
        // if(buscarVector(vector2,10)!=-1){
        //     System.out.println("Se ha encontrado el número 6 en el vector");
        // }
        // else{
        //     System.out.println("No está el número en el vector");
        // }
        // System.out.println(buscarVector(vector2,6));

        // // for (int dato : vector2) {
        // //     System.out.println(dato);
        // // }

        //REalizar una copia de un array
        int[] vector={3,6,8,11,33};
        int[] copiaVector=new int[vector.length];
        for(int i=0;i<vector.length;i++){
            copiaVector[i]=vector[i];
        }
        vector[4]=23;
        //Vector original
        for(int i=0;i<vector.length;i++){
            System.out.print(vector[i]+ " ");
        }
        System.out.println();
        
        //Vector copia
        for(int i=0;i<copiaVector.length;i++){
            System.out.print(copiaVector[i]+ " ");
        }
        System.out.println();


        //Insertar uno elemento más
        int[] vectorPrueba={1,2,3};
        int[] vectorFinal;
        System.out.println(vectorPrueba.length);
        //Primero: Reserva memoria para 1 elmento más
        vectorFinal=new int[vectorPrueba.length+1];
        for(int i=0;i<vectorPrueba.length;i++){
            vectorFinal[i]=vectorPrueba[i];
        }
        vectorFinal[vectorPrueba.length]=40;
        for(int i=0;i<vectorFinal.length;i++){
            System.out.print(vectorFinal[i]+" ");
        }
        System.out.println();


        //Borrar uno elemento más
        int[] vectorPrueba2={1,2,3};
        int[] vectorFinal2;
        System.out.println(vectorPrueba.length);
        //Primero: Reserva memoria para 1 elmento más
        vectorFinal2=new int[vectorPrueba2.length-1];
        for(int i=0;i<vectorFinal2.length;i++){
            vectorFinal2[i]=vectorPrueba2[i];
        }
        for(int i=0;i<vectorFinal2.length;i++){
            System.out.print(vectorFinal2[i]+" ");
        }
        System.out.println();
    }

    public static int buscarVector(int[] vector,int numero){
        int indice=-1;
        boolean encontrado=false;
        for(int i=0;i<vector.length && !encontrado;i++){
            if(vector[i]==numero){
                indice=i;
                encontrado=true;
            }
        }
        return indice;
    }
    //Vamos a copiar el array {2,3,5,7,8,2}
    public static int[] copiarArray(int[] array){
        int[] copia=new int[array.length];
        for(int i=0;i<array.length;i++){
            copia[i]=array[i];
        }
        return copia;
    }

}