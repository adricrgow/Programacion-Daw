public class Racional {
    int numerador;
    int denominador;

   
    public Racional(int n, int d) {
        numerador = n;
        denominador = d;
    }



    
    public Racional suma(Racional otro) {
        int nuevoNum = numerador * otro.denominador + otro.numerador * denominador;
        int nuevoDen = denominador * otro.denominador;
        return new Racional(nuevoNum, nuevoDen);
    }
    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
public void imprimir() {
        System.out.println(numerador + "/" + denominador);
    }


    
    public static void main(String[] args) {
        Racional r1 = new Racional(1, 2);
        Racional r2 = new Racional(3, 4);

        r1.imprimir();
        r2.imprimir();

        Racional suma = r1.suma(r2);
        System.out.print("Suma: ");
        suma.imprimir();
    }

    
}
