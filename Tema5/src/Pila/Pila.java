package Pila;

import java.util.ArrayList;

public class Pila<T> {
    private ArrayList<T> elementos;

    public Pila() {
        elementos = new ArrayList<>();
    }


    public void insertar(T elemento) {
        elementos.add(elemento);
    }

  
    public T borrar() {
        if (!estaVacia()) {
            return elementos.remove(elementos.size() - 1);
        }
        return null;
    }


    public int buscar(T elemento) {
        return elementos.indexOf(elemento); // devuelve -1 si no está
    }


    public T devolver() {
        if (!estaVacia()) {
            return elementos.get(elementos.size() - 1);
        }
        return null;
    }


    public boolean estaVacia() {
        return elementos.isEmpty();
    }

   
    @Override
    public String toString() {
        return "Pila: " + elementos.toString();
    }
}
