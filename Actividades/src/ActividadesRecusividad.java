


public class ActividadesRecusividad {

    // public static int numeroDigitos(int n){
    //     int contador=0;
    //     while(n>0){
    //         n=n/10;
    //         contador++;
    //     }
    //     return contador;
    // }
    // public static int numeroDigitosRecursivo(int n){
    //     if(n>0 && n<10){
    //         return 1;
    //     } else {
    //         return 1 + numeroDigitosRecursivo(n/10);
    //     }
    // }
    // public static int devuelveSuma(int n){
    //     if(n==1){
    //         return 1;
    //     } else {
    //         return n + devuelveSuma(n-1);
    //     }
    // } 
    
    // public static double potencia(int base, int exponente){
    //     if(exponente==0){
    //         return 1;
    //     } else {
    //         return base * potencia(base, exponente-1);
    //    }
    // }
    public static int pasarabinario(int n){
        if(n<2){
            return n;
        } else {
            return (n%2) + 10*pasarabinario(n/2);
        }
    }


    public static void main(String[] args) {
        // System.out.println(numeroDigitos(250000));
        // System.out.println(numeroDigitosRecursivo(250000));
        // System.out.println(devuelveSuma(2));
        // System.out.println(potencia(2,5));
        System.out.println(pasarabinario(15));
    }
}
