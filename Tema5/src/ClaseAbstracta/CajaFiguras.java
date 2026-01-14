package ClaseAbstracta;

import java.util.ArrayList;

public class CajaFiguras  {
    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<>();
        figuras.add(new Circulo(5,"Rojo"));
        
        mostrarFiguras(figuras);
        System.out.println("Area total: "+areaTotal(figuras));
    
    }
    public static void mostrarFiguras(ArrayList<Figura> figuras){
        for (Figura figura : figuras) {
            System.out.println("Color: "+figura.getColor());
            System.out.println("Area: "+figura.CalcularArea());
            System.out.println("Perimetro: "+figura.CalcularPerimetro());
        }
    }
    public static double areaTotal(ArrayList<Figura> figuras){
        double areaTotal=0;
        for (Figura figura : figuras) {
            areaTotal+=figura.CalcularArea();
        }
        return areaTotal;
    }
}
