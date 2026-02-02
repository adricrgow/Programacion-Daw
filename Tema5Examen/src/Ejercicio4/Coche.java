package Ejercicio4;

public class Coche extends Vehicuo {

    public Coche(String matricula) {
        super(matricula);
    }

    @Override
    public void CaldularPrecioHoras(int horas) {
        int precioPorHora = 2; // Precio fijo por hora para coches
        int total = precioPorHora * horas;
        System.out.println("El precio por " + horas + " horas es: " + total + " euros.");
    }
    
}
