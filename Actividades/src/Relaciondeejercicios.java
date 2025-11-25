
import java.time.LocalDateTime;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;
import javax.print.attribute.standard.Media;



public class Relaciondeejercicios {
    public static void fibonacci(int n){
        int a=0,b=1,c;
        System.out.print(a+" "+b);
        for(int i=2;i<n;i++){
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
}
public static int contarPares(int numero) {
    int contadorPares = 0;
    while (numero > 0) {
        int digito = numero % 10;
        if (digito % 2 == 0) {
            contadorPares++;
        }
        numero /= 10;
    }
    return contadorPares;
}
public static int contarImpares(int numero) {
    int contadorImpares = 0;
    while (numero > 0) {
        int digito = numero % 10;
        if (digito % 2 != 0) {
            contadorImpares++;
        }
        numero /= 10;
    }
    return contadorImpares;
}
    public static void main(String[] args) {
    //actividad 1
    // int hora=0;
    // Scanner teclado=new Scanner(System.in);
    // System.out.println("Introduce la hora: ");
    // hora=teclado.nextInt();
    // if(hora>=6 && hora<12){
    //     System.out.println("Buenos días");
    // } else if (hora>=12 && hora<20) {
    //     System.out.println("Buenas tardes");
    // } else if ((hora>=20 && hora<=23) || (hora>=0 && hora<6)) {
    //     System.out.println("Buenas noches");
    // } else {
    //     System.out.println("La hora introducida no es correcta");
    // }
    // teclado.close();
    //actividad 2
    // int numerodehorassemanales=0;
    // int preciohoraextra=16;
    // int preciohoranormal=12;
    // int sueldo=0;
    // Scanner teclado=new Scanner(System.in);
    // System.out.println("Introduce el número de horas semanales trabajadas: ");
    // numerodehorassemanales=teclado.nextInt();
    // if(numerodehorassemanales>40){
    //     sueldo=(numerodehorassemanales-40)*preciohoraextra+40*preciohoranormal;
    // } else {
    //     sueldo=numerodehorassemanales*preciohoranormal;
    // }
    // System.out.println("El sueldo semanal es: "+sueldo+" euros");
    // teclado.close();

    //actividad 3
    // int mesdenacimiento=0;
    // int diadenacimiento=0;
    // Scanner teclado=new Scanner(System.in);
    // System.out.println("Introduce tu dia de nacimiento: ");
    // diadenacimiento=teclado.nextInt();
    // System.out.println("Introduce tu mes de nacimiento: ");
    // mesdenacimiento=teclado.nextInt();
    // if (mesdenacimiento == 12 || mesdenacimiento == 1){
    //     if (diadenacimiento >= 22 || diadenacimiento <= 19){
    //         System.out.println("Eres Capricornio");
    //     }else {
    //         System.out.println("Fecha incorreta");
    //     }
    // }else if (mesdenacimiento == 1 || mesdenacimiento == 2){
    //     if (diadenacimiento >= 20 || diadenacimiento <= 18){
    //         System.out.println("Eres Acuario");
    //     }else {
    //         System.out.println("Fecha incorreta");
    //     }
    // }else if (mesdenacimiento == 2 || mesdenacimiento == 3){
    //     if (diadenacimiento >= 19 || diadenacimiento <= 20){
    //         System.out.println("Eres Piscis");
    //     }else {
    //         System.out.println("Fecha incorreta");
    //     }
    // } else if (mesdenacimiento == 3 || mesdenacimiento == 4){
    //     if (diadenacimiento >= 21 || diadenacimiento <= 19){
    //         System.out.println("Eres Aries");
    //     }else {
    //         System.out.println("Fecha incorreta");
    //     }
    // }else if (mesdenacimiento == 4 || mesdenacimiento == 5){
    //     if (diadenacimiento >= 20 || diadenacimiento <= 20){
    //         System.out.println("Eres Tauro");
    //     }else {
    //         System.out.println("Fecha incorreta");
    //     }
    // }else if (mesdenacimiento == 5 || mesdenacimiento == 6){
    //     if (diadenacimiento >= 21 || diadenacimiento <= 20){
    //         System.out.println("Eres Géminis");
    //     }else {
    //         System.out.println("Fecha incorreta");
    //     }
    // }else if (mesdenacimiento == 6 || mesdenacimiento == 7){
    //     if (diadenacimiento >= 21 || diadenacimiento <= 22){
    //         System.out.println("Eres Cáncer");
    //     }else {
    //         System.out.println("Fecha incorreta");
    //     }
    // }else if (mesdenacimiento == 7 || mesdenacimiento == 8){
    //     if (diadenacimiento >= 23 || diadenacimiento <= 22){
    //         System.out.println("Eres Leo");
    //     }else {
    //         System.out.println("Fecha incorreta");
    //     }
    // }else if (mesdenacimiento == 8 || mesdenacimiento == 9){
    //     if (diadenacimiento >= 23 || diadenacimiento <= 22){
    //         System.out.println("Eres Virgo");
    //     }else {
    //         System.out.println("Fecha incorreta");
    //     }
    // }else if (mesdenacimiento == 9 || mesdenacimiento == 10){
    //     if (diadenacimiento >= 23 || diadenacimiento <= 22){
    //         System.out.println("Eres Libra");
    //     }else {
    //         System.out.println("Fecha incorreta");
    //     }
    // }else if (mesdenacimiento == 10 || mesdenacimiento == 11){
    //     if (diadenacimiento >= 23 || diadenacimiento <= 21){
    //         System.out.println("Eres Escorpio");
    //     }else {
    //         System.out.println("Fecha incorreta");
    //     }
    // }else if (mesdenacimiento == 11 || mesdenacimiento == 12){
    //     if (diadenacimiento >= 22 || diadenacimiento <= 21){
    //         System.out.println("Sagitario");
    //     }else {
    //         System.out.println("Fecha incorreta");
    //     }
    //     teclado.close();
    // }

    //actividad 4

    // int nota1=0;
    // int nota2=0;
    // String recuperacion;
    // int media=(nota1+nota2 /2);
    // Scanner teclado=new Scanner(System.in);
    // System.out.println("Nota del primer examen: ");
    // nota1=teclado.nextInt();
    // System.out.println("Nota del segundo examen: ");
    // nota2=teclado.nextInt();
    // teclado.close();
    // if(media >= 5){
    //     System.out.println("Has aprobado con esta media: " + media);
    // } else if (media <= 5) {
    //     System.out.println("Has suspendido con:" + media);
    // } else {
    //     System.out.println("Nota de la recuperación: ");
    //     Scanner teclado2 = new Scanner (System.in);
    //     recuperacion = teclado2.nextLine();
    //     if(recuperacion.equals("apto")){
    //         System.out.println("Has aprobado");
    //     } else {
    //         System.out.println("Has suspendido");
    //     }
    // }

    //actividad 5
        // int dia = 0;
        // Scanner teclado = new Scanner(System.in);
        // System.out.println("Introduce un día de la semana del 1 al es lunes y con 7 sales: ");
        // dia = teclado.nextInt();
        // if (dia == 1) {
        //     System.out.println("El horario del lunes es:\nIPE, Sisemas informáticos, Base de datos, Base de datos, Programación,Programación");
        // } else if (dia == 2) {
        //     System.out.println("El horario del martes es:\nLenguaje de Marcas, Sisemas informáticos, Sistemas Informáticos, Programación, Programación, Entornos de desarrollo");
        // } else if (dia == 3) {
        //     System.out.println("El horario del miércoles es:\nBase de Datos, Base de Datos, Sistemas Informáticos, Sistemas Informáticos, Programación, Programación");
        // } else if (dia == 4) {
        //     System.out.println("El horario del jueves es:\nProgramación, Entornos de desarrollo, Entornos de desarrollo, IPE, Base de Datos, Sotenibilidad");
        // } else if (dia == 5) {
        //     System.out.println("El horario del viernes es:\nBase de Datos, Digitalización, Lenguaje de Marcas, Lenguaje de Marcas, IPE, Programación");
        // } else if (dia == 6) {
        //     System.out.println("horario completo" +
        //     "\nLunes: IPE, Sisemas informáticos, Base de datos, Base de datos, Programación,Programación" +
        //     "\nMartes: Lenguaje de Marcas, Sisemas informáticos, Sistemas Informáticos, Programación, Programación, Entornos de desarrollo" +
        //     "\nMiércoles: Base de Datos, Base de Datos, Sistemas Informáticos, Sistemas Informáticos, Programación, Programación" +
        //     "\nJueves: Programación, Entornos de desarrollo, Entornos de desarrollo, IPE, Base de Datos, Sotenibilidad" +
        //     "\nViernes: Base de Datos, Digitalización, Lenguaje de Marcas, Lenguaje de Marcas, IPE, Programación");
        // } else if (dia == 7) {
        //     System.out.println("Adiós");
            
        // }
            
        // teclado.close();

        //actividad 6
        // int cargo=0;
        // int sueldoBase1=950;
        // int sueldoBase2=1200;
        // int sueldoBase3=1600;
        // int estadoCivil=0;
        // int extradieatas=30;
        // double sueldoNeto=0;
        // double sueldoBruto=0;
        // int diasdeviaje=0;
        // int IRPFsoltero=25;
        // int IRPFcasado=20;
        // double RetencionIRPF=0;
        // Scanner teclado=new Scanner(System.in);
        // System.out.println("Introduce tu cargo (1 - Prog. junior, 2 - Prog. senior, 3 - Jefe de proyecto): ");
        // cargo=teclado.nextInt();
        
        // System.out.println("Introduce tu estado civil (1 - Soltero, 2 - Casado): ");
        // estadoCivil=teclado.nextInt();
        // System.out.println("Introduce los días que has estado de viaje por trabajo: ");
        // diasdeviaje=teclado.nextInt();
        // teclado.close();
        // if (cargo == 1) {
        //     System.out.println("|--------------------------------|");
        //     System.out.println("| Sueldo base:          "+ sueldoBase1 + " euros|");
        //     System.out.println("| Dietas por " + diasdeviaje + " días:     " + (extradieatas * diasdeviaje) + " euros|");
        //     System.out.println("|--------------------------------|");
        //     sueldoBruto = sueldoBase1 + (extradieatas * diasdeviaje);
        //     System.out.println("| Sueldo bruto:      " + sueldoBruto + " euros|");
        //     if (estadoCivil == 1) {
        //         RetencionIRPF = sueldoBruto * IRPFsoltero / 100;
        //         System.out.println("| Retención IRPF(25%) " + RetencionIRPF + " euros|");
            
        //     } else if (estadoCivil == 2) {
        //         RetencionIRPF = sueldoBruto * IRPFcasado / 100;
        //         System.out.println("| Retención IRPF(20%) " + RetencionIRPF + " euros|");
        //     }
        //     sueldoNeto = sueldoBruto - RetencionIRPF;   
        //     System.out.println("| Sueldo neto:        " + sueldoNeto + " euros|");
        //     System.out.println("----------------------------------");
        // } else if (cargo == 2) {
        //     System.out.println("|--------------------------------|");
        //     System.out.println("| Sueldo base:         "+ sueldoBase2 + " euros|");
        //     System.out.println("| Dietas por " + diasdeviaje + " días:     " + (extradieatas * diasdeviaje) + " euros|");
        //     System.out.println("|--------------------------------|");
        //     sueldoBruto = sueldoBase2 + (extradieatas * diasdeviaje);
        //     System.out.println("| Sueldo bruto:      " + sueldoBruto + " euros|");
        //     if (estadoCivil == 1) {
        //         RetencionIRPF = sueldoBruto * IRPFsoltero / 100;
        //         System.out.println("| Retención IRPF(25%) " + RetencionIRPF + " euros|");
            
        //     } else if (estadoCivil == 2) {
        //         RetencionIRPF = sueldoBruto * IRPFcasado / 100;
        //         System.out.println("| Retención IRPF(20%) " + RetencionIRPF + " euros|");
        //     }
        //     sueldoNeto = sueldoBruto - RetencionIRPF;   
        //     System.out.println("| Sueldo neto:        " + sueldoNeto + " euros|");
        //     System.out.println("----------------------------------");
        
        
        // }else if (cargo == 3) {
        //     System.out.println("|--------------------------------|");
        //     System.out.println("| Sueldo base:         "+ sueldoBase3 + " euros|");
        //     System.out.println("| Dietas por " + diasdeviaje + " días:     " + (extradieatas * diasdeviaje) + " euros|");
        //     System.out.println("|--------------------------------|");
        //     sueldoBruto = sueldoBase3 + (extradieatas * diasdeviaje);
        //     System.out.println("| Sueldo bruto:      " + sueldoBruto + " euros|");
        //     if (estadoCivil == 1) {
        //         RetencionIRPF = sueldoBruto * IRPFsoltero / 100;
        //         System.out.println("| Retención IRPF(25%) " + RetencionIRPF + " euros|");
            
        //     } else if (estadoCivil == 2) {
        //         RetencionIRPF = sueldoBruto * IRPFcasado / 100;
        //         System.out.println("| Retención IRPF(20%) " + RetencionIRPF + " euros|");
        //     }
        //     sueldoNeto = sueldoBruto - RetencionIRPF;   
        //     System.out.println("| Sueldo neto:       " + sueldoNeto + " euros|");
        //     System.out.println("----------------------------------");
        
        
        // } if (cargo > 3) {
        //     System.out.println("No has introducido un puesto de trabajo correcto");
        // }

        //actividad 7
        // int numero=0;
        // int positivos=0;
        // int negativos=0;
        // Scanner teclado=new Scanner(System.in);
        // System.out.println("Introduce un números hasta poner 0: ");
        // numero=teclado.nextInt();
        // while (numero !=0) {
        //     if (numero > 0) {
        //         positivos++;
        //     } else {
        //         negativos++;
        //     }
        //     System.out.println("Introduce un números hasta poner 0: ");
        //     numero=teclado.nextInt();
        // }
        // System.out.println("Has introducido " + positivos + " números positivos y " + negativos + " números negativos.");
        // teclado.close();

        //actividad 8
        // int numero=0;
        // int suma=0;
        // Scanner teclado=new Scanner(System.in);
        // System.out.println("Cuantos números de la serie fibonacci quieres ver: ");
        // numero=teclado.nextInt();
        // int n1=0;
        // int n2=1;
        // System.out.println("Los " + numero + " primeros números de la serie Fibonacci son: ");
        // System.out.println(n1 + " \n" + n2 + " ");
        // for (int i = 2; i < numero; i++) {
        //     suma=n1+n2;
        //     System.out.println(suma + " ");
        //     n1=n2;
        //     n2=suma;
        //     teclado.close();
        // }

        // actividad 9 función recursiva
        // Scanner teclado=new Scanner(System.in);
        // System.out.println("Cuantos números de la serie fibonacci quieres ver: ");
        // int numero=teclado.nextInt();
        // System.out.println("Los " + numero + " primeros números de la serie Fibonacci son: ");
        // fibonacci(numero);
        // teclado.close();
        
        //actividad 10 
        // Scanner teclado = new Scanner(System.in);
        // System.out.print("Introduce un número: ");
        // int numero = teclado.nextInt();
        // int numeroOriginal = numero;
    
        // int pares = contarPares(numero);
        // int impares = contarImpares(numero);
    
        // System.out.println("El " + numeroOriginal + " contiene " + pares + " dígitos pares y " + impares + " dígitos impares.");
        // teclado.close();

        //actividad 11 
        
        // Scanner teclado = new Scanner(System.in);
        // int numero1=0;
        // int numero2=0;
        // int suma=0;
        // String operacion="";
        // int resta=0;
        // int multiplicacion=0;
        // int division=0;
        // do{
        // System.out.println("Quieres hacer alguna operación o quieres salir pon -1.");
        // operacion=teclado.nextLine().toLowerCase();
        // if (operacion.equals("suma")) {
        //     System.out.println("Introduce el primer número: ");
        //     numero1=teclado.nextInt();
        //     System.out.println("Introduce el segundo número: ");
        //     numero2=teclado.nextInt();
        //     suma=numero1+numero2;
        //     System.out.println("El resultado de la suma es: "+suma);
        //     teclado.nextLine();
        // }  else if (operacion.equals("resta")) {
        //     System.out.println("Introduce el primer número: ");
        //     numero1=teclado.nextInt();
        //     System.out.println("Introduce el segundo número: ");
        //     numero2=teclado.nextInt();
        //     resta=numero1-numero2;
        //     System.out.println("El resultado de la resta es: "+resta);
        //     teclado.nextLine();
        // } else if (operacion.equals("multiplicacion")) {
        //     System.out.println("Introduce el primer número: ");
        //     numero1=teclado.nextInt();
        //     System.out.println("Introduce el segundo número: ");
        //     numero2=teclado.nextInt();
        //     multiplicacion=numero1*numero2;
        //     System.out.println("El resultado de la resta es: "+multiplicacion);
        //     teclado.nextLine();
        // } else if (operacion.equals("division")) {
        //     System.out.println("Introduce el primer número: ");
        //     numero1=teclado.nextInt();
        //     System.out.println("Introduce el segundo número: ");
        //     numero2=teclado.nextInt();
        //     division=numero1/numero2;
        //     System.out.println("El resultado de la resta es: "+division);
        //     teclado.nextLine();
        // }
        // } while(!operacion.equals("-1"));
        // teclado.close();

        //actividad 12
        // Scanner teclado = new Scanner(System.in);

        // System.out.println("Introduce el primer número: ");
        // int a = Math.abs(teclado.nextInt());

        // System.out.println("Introduce el segundo número: ");
        // int b = Math.abs(teclado.nextInt());

        // teclado.close();
        // int a_original = a;
        // int b_original = b;

        // while (b != 0) {
        //     int resto = a % b;
        //     a = b;
        //     b = resto;
        // }

        // int mcd = a;
        // int mcm = Math.abs(a_original * b_original) / mcd;

        // System.out.println("El máximo común divisor es: " + mcd);
        // System.out.println("El mínimo común múltiplo es: " + mcm);

        //ampliacion
        int numero=0;
        int numeroprimo=0;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce un número: ");
        numero=teclado.nextInt();
        for(int i=2;i<=numero;i++){
            if(numero%i==0){
                numeroprimo++;
            }
        }
        if(numeroprimo==1){
            System.out.println("El número "+numero+" es primo.");
        } else {
            System.out.println("El número "+numero+" no es primo.");    
        }
        teclado.close();

        
}
}
   
        
   
