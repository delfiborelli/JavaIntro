/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

resolucion mas facil:

      Scanner leer = new Scanner(System.in);
        System.out.println("CONVERTIR DIVISAS");
        System.out.println("");
        System.out.println("Por favor escriba cuántos Euros desea convertir: ");
        int monto=leer.nextInt();
        int moneda;
        
        do {
        
        
        System.out.println("");
        System.out.println("Por favor selecione a que moneda desea convertir los euros:");
        System.out.println("");
        System.out.println("1.LIBRAS");
        System.out.println("");
        System.out.println("2.DÓLARES");
        System.out.println("");
        System.out.println("3.YENES");
        moneda=leer.nextInt();
        
            if (moneda>0&&moneda<4) {
              conversor(monto,moneda);      
            } else {
                System.out.println("Por favor seleccione una opcion correcta.");
            }
        
        } while ((moneda!=1)&&(moneda!=2)&&(moneda!=3));
        
        
        
        
        
    }
    
    public static void conversor(int monto,int moneda) {
        double result;
        switch (moneda) {
            case 1:
               result= monto *0.86;
                System.out.println(monto+" € convertido a libras es: "+result);
                break;
            case 2:
                result=monto*1.28611;
                System.out.println(monto+" € convertido a dólares es: "+result);
                break;
            case 3:
                result=monto*129.852;
                System.out.println(monto+" € convertido a yenes es: "+result);
                break;
        }
        
        
        
        
        
        
    }
    }

 */
package javaintro;

import java.util.Scanner;

/**
 *
 * @author delfi
 */
public class ej_14 {
    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
       
        System.out.println("¿A qué moneda desea convertir sus euros?");
        String moneda = leer.nextLine();
        
        System.out.println("Ingrese la cantidad de euros a convertir");
        double euros = leer.nextDouble();
        
        switch (moneda) {
            case "libras":
                double retornoL = conversionL(euros);
                System.out.println("Sus euros corresponden a "+ retornoL +" libras.");
                break;
            case "dolares":
                double retornoD = conversionD(euros);
                System.out.println("Sus euros corresponden a "+ retornoD +" dólares.");
                break;
            case "yenes":
                double retornoY = conversionY(euros);
                System.out.println("Sus euros corresponden a "+ retornoY +" yenes.");
                break;
            default:
                System.out.println("Moneda no disponible o incorrecta");
                break;
        }
}
    public static double conversionL(double euros){
        double calculo1;
        calculo1= euros*0.86;
        return calculo1;
    }
    public static double conversionD(double euros){
        double calculo2;
        calculo2= euros*1.28611;
        return calculo2;
    }
    public static double conversionY(double euros){
        double calculo3;
        calculo3= euros*129.852;
        return calculo3;
    }
}