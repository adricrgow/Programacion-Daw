package Ejercicio6;

public class Vertebrados extends Animales{
        
    protected int columnaVertebral;

    public Vertebrados(){}

    public Vertebrados(String nombre, String alimentacion, int edad, int columnaVertebral) {
        super(nombre, alimentacion, edad);
        this.columnaVertebral = columnaVertebral;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Columna vertebral: " + columnaVertebral + " vértebras");
    }
}
