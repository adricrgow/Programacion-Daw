package actividadcarta;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Mazo {
   ArrayList<Carta>carta;
    public Mazo (){
        carta = new ArrayList<Carta>();
    }

    public void barajar(Carta c){
        carta.add(c);
    }
}
