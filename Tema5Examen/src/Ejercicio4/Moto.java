package Ejercicio4;

public class Moto extends Vehicuo {
    
    public Moto(String matricula) {
        super(matricula);
    }

    @Override
    public void CaldularPrecioHoras(int horas) {
        int precioPorHora = 1; // Precio fijo por hora para motos
        int total = precioPorHora * horas;
        System.out.println("El precio por " + horas + " horas es: " + total + " euros.");
    }
}
