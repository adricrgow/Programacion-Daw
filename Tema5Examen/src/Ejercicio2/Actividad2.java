import java.io.FileReader;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Actividad2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        try {
            JSONParser parser = new JSONParser();
            JSONObject raiz = (JSONObject) parser.parse(new FileReader("./Tema5Examen/src/Ejercicio2/Empleados.json"));
            String nombreEmpresa = (String) raiz.get("empresa");
            JSONArray empleados = (JSONArray) raiz.get("empleados");
            JSONObject direccion = (JSONObject) raiz.get("direccion");

            int opcion;

            do {
                System.out.println("MENÚ");
                System.out.println("1 - Empleados activos");
                System.out.println("2 - Empleados administradores");
                System.out.println("3 - Datos de la empresa");
                System.out.println("4 - Buscar empleado");
                System.out.println("5 - Salir");
                System.out.print("Opción: ");
                opcion = Integer.parseInt(teclado.nextLine());

                switch (opcion) {

                    case 1:
                        int activos = 0;
                        System.out.println("Empleados activos:");
                        for (Object o : empleados) {
                            JSONObject emp = (JSONObject) o;
                            boolean activo = (boolean) emp.get("activo");
                            if (activo) {
                                activos++;
                                System.out.println("- " + emp.get("nombre"));
                            }
                        }
                        System.out.println("Total activos: " + activos);
                        break;

                    case 2:
                        int admins = 0;
                        for (Object o : empleados) {
                            JSONObject emp = (JSONObject) o;
                            JSONArray roles = (JSONArray) emp.get("roles");
                            if (roles.contains("admin")) {
                                admins++;
                            }
                        }
                        System.out.println("Número de administradores: " + admins);
                        break;

                    case 3:
                        System.out.println("Empresa: " + nombreEmpresa);
                        System.out.println("Ciudad: " + direccion.get("ciudad"));
                        System.out.println("País: " + direccion.get("pais"));
                        break;

                    case 4:
                        System.out.print("Nombre del empleado: ");
                        String buscar = teclado.nextLine();
                        boolean encontrado = false;

                        for (Object o : empleados) {
                            JSONObject emp = (JSONObject) o;
                            if (emp.get("nombre").toString().equalsIgnoreCase(buscar)) {
                                System.out.println("ID: " + emp.get("id"));
                                System.out.println("Roles: " + emp.get("roles"));
                                System.out.println("Activo: " + emp.get("activo"));
                                encontrado = true;
                            }
                        }

                        if (!encontrado) {
                            System.out.println("No es empleado.");
                        }
                        break;
                }

            } while (opcion != 5);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
