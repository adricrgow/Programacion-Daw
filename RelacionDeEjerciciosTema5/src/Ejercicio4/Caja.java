package Ejercicio4;

public class Caja<T> {

    private T valor;


    public Caja(T valor) {
        this.valor = valor;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }


    @Override
    public String toString() {
        return "Caja contiene: " + valor;
    }
}
