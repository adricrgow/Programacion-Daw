
import java.util.Scanner;

public class Actividad3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes"};
        String[][] horario = {
            {"IPE", "Sisemas informáticos", "Base de datos", "Base de datos", "Programación","Programación"},
            {"Lenguaje de Marcas", "Sisemas informáticos", "Sistemas Informáticos", "Programación", "Programación","Entornos de desarrollo"},
            {"Base de Datos", "Base de Datos", "Sistemas Informáticos", "Sistemas Informáticos", "Programación","Programación"},
            {"Programación", "Entornos de desarrollo", "Entornos de desarrollo", "IPE", "Base de Datos","Sotenibilidad"},
            {"Base de Datos", "Digitalización", "Lenguaje de Marcas", "Lenguaje de Marcas", "IPE","Programación"}
        };
        
        int opcion;
        do { 
            System.out.println("1 Mostrar el horario ");
            System.out.println("2 Mostrar el horario de un dia concreto");
            System.out.println("3 obtener la clase de una hora indicada");
            System.out.println("4 modificar la clase de un dia a otro");
            System.out.println("5 salir");
            opcion = teclado.nextInt();
            
            switch (opcion) {
                case 1:
                    Mostrarhorario(dias, horario);
                    break;
                case 2:
                    horarioclasedia(dias, horario);
                    break;
                case 3:
                    
                break;
                case 4:
                    
                break;
                default: System.out.println("opcion no valida");
            }
        } while (opcion !=5);

    }
    public static void horarioclasedia( String[] dias,String[][] horario){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un día de la semana (Lunes a Viernes):");
        String dia = scanner.nextLine();
        boolean diaValido = false;
        for (int i = 0; i < dias.length; i++) {
            if(dias[i].equalsIgnoreCase(dia)){
                diaValido = true;
                System.out.println("Horario del " + dias[i] + ": ");
                for (int j = 0; j < horario[i].length; j++) {
                    System.out.println((j + 1) + "ª hora: " + horario[i][j]);
                }
            }
        }
    }

    public static  void Mostrarhorario( String[] dias,String[][] horario){
        for (int i = 0; i < horario.length; i++) {
            System.out.println("Horario" + dias[i] + ": ");
            for (int j = 0; j < horario.length; j++) {
                System.out.println((j + 1) + "ª hora: " + horario[i][j]);
            }
        }
    }


}
