import Controlador.CategoriaController;
import Controlador.PiezaController;
import Controlador.ProvedorController;
import Controlador.SuministroController;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        CategoriaController categoriaController = new CategoriaController();
        PiezaController piezaController = new PiezaController();
        ProvedorController provedorController = new ProvedorController();
        SuministroController suministroController = new SuministroController();

        int opcion;
        do {
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Gestionar Categorías");
            System.out.println("2. Gestionar Piezas");
            System.out.println("3. Gestionar Proveedores");
            System.out.println("4. Gestionar Suministros");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    categoriaController.iniciar();
                    break;
                case 2:
                    piezaController.iniciar();
                    break;
                case 3:
                    provedorController.iniciar();
                    break;
                case 4:
                    suministroController.iniciar();
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        } while (opcion != 0);

        sc.close();

}
}
