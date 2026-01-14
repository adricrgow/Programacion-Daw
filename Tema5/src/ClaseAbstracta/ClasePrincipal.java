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
    
    }
    public static void mostrarFiguras(ArrayList<Figura> figuras){
        for (Figura figura : figuras) {
            System.out.println("Color: "+figura.getColor());
            System.out.println("Area: "+figura.CalcularArea());
            System.out.println("Perimetro: "+figura.CalcularPerimetro());
        }
    }

}
