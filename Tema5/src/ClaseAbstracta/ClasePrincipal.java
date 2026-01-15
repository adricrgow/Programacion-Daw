package ClaseAbstracta;

import java.util.ArrayList;

public class ClasePrincipal {
    public static void main(String[] args) {
        ArrayList<Circulo> circulos = new ArrayList<>();
        ArrayList<Rectangulo> rectangulos = new ArrayList<>();
        ArrayList<Figura> figurasGeneral = new ArrayList<>();
        circulos.add(new Circulo(3,"Azul"));
        circulos.add(new Circulo(7,"Verde"));
        rectangulos.add(new Rectangulo(4,5,"Amarillo"));
        rectangulos.add(new Rectangulo(6,8,"Naranja"));
        figurasGeneral.addAll(circulos);
        figurasGeneral.addAll(rectangulos);

        mostrarFiguras(figurasGeneral);
        mostrarCirculos(circulos);
        mostrarRectangulos(rectangulos);
        AreaTotal(figurasGeneral);
    
    }
    public static void mostrarCirculos(ArrayList<Circulo> circulos){
        for (Circulo circulo : circulos) {
            System.out.println("Color: "+circulo.getColor());
            System.out.println("Area: "+circulo.CalcularArea());
            System.out.println("Perimetro: "+circulo.CalcularPerimetro());
        }
    }
    public static void mostrarRectangulos(ArrayList<Rectangulo> rectangulos){
        for (Rectangulo rectangulo : rectangulos) {
            System.out.println("Color: "+rectangulo.getColor());
            System.out.println("Area: "+rectangulo.CalcularArea());
            System.out.println("Perimetro: "+rectangulo.CalcularPerimetro());
        }
    }
    public static void mostrarFiguras(ArrayList<Figura> figuras){
        for (Figura figura : figuras) {
            System.out.println("Color: "+figura.getColor());
            System.out.println("Area: "+figura.CalcularArea());
            System.out.println("Perimetro: "+figura.CalcularPerimetro());
        }
    }

    public static void AreaTotal(ArrayList<Figura> figuras){
        double areaTotal=0;
        for (Figura figura : figuras) {
            areaTotal+=figura.CalcularArea();
        }
        System.out.println("Area total: "+areaTotal);
    }
}
