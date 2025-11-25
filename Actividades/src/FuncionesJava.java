public class FuncionesJava {
    public static int suma (int numero1, int numero2){
        return numero1+numero2;
    }
    public static double suma (double numero1, double numero2){
        return numero1+numero2;
    }
    public static int maximo (int numero1, int numero2){
        if (numero1>=numero2) return numero1;
        else return numero2;
            
    }
    public static void escribir3saludos(){
        System.out.println("Hola");
        System.out.println("Adiós");
        System.out.println("Hasta luego");
    }
    public static void main(String[] args) {
        // System.out.println(suma(numero1:2, numero2:3));
        // System.out.println(suma(numero1:1.5, numero2:3.7));
        //funcion que devuelve el valor maximo entre dos numeros
        // System.out.println(maximo(maximo(maximo(numero1:11, numero2:33),maximo(numero1:22, numero2:44))));
}

}
