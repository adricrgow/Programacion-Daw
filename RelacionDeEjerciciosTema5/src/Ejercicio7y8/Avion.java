package Ejercicio7y8;

public class Avion extends Vehiculo  implements Volador{


    public Avion(String marca) {
        super(marca);
    }

    

    @Override
    public void arrancar() {
        System.out.println(getMarca() + " está arrancando");
        
    }

    @Override
    public void volar() {
        System.out.println(getMarca() + " está volando");
    }

    
}

