package Ejercicio4;

public class MainPrueba {
    public static void main(String[] args) {
        Coche coche1 = new Coche("1234-ABC");
        coche1.entrar();
        int horas = (int) (Math.random() * 10) + 1;
        System.out.println("Horas generadas aleatoriamente: " + horas);
        coche1.CaldularPrecioHoras(horas);
        coche1.Salir();

        Coche coche2 = new Coche("4321-CBA");
        coche2.entrar();

        Moto moto1 = new Moto("5678-DEF");
        moto1.entrar();
        horas = (int) (Math.random() * 10) + 1;
        System.out.println("Horas generadas aleatoriamente: " + horas);
        moto1.CaldularPrecioHoras(horas);
        moto1.Salir();
    }
}
