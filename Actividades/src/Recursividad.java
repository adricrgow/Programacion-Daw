public class Recursividad {
    public static int factorial(int n){
        if (n==0){
            return 1;
        }
        
        else {
            return n*factorial(n-1);
        }
        
    }
    public static int suma(int n){
        if(n==1){
            return 1;
        }else {
            return n +suma(n-1);
        }
    }
    public static void incre(int n){
        if(n>0){
        incre(n-1);
        System.out.print(n);
     } else
 System.out.println();
}
    public static void main(String[] args) {
    System.out.println(factorial(5));
    System.out.println(suma(5));
    incre( 4);
    }
//     public static void main(String[] args) {
//  int a = 250;
//  System.out.println(funcion(a, 2));
//  }
//  public static int funcion(int num, int pos){
//  if(num < 10){
//  return num;
//  }else{
//  return (num % 10) * (int) Math.pow(10, pos) + (funcion(num/10, pos-1));
//  }
//  }
    
}
