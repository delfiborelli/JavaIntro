/*
 *Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package javaintro;

import java.util.Scanner;

/**
 *
 * @author delfi
 */
public class ej_17 {
     public static void main(String[] args) {
          Scanner leer = new Scanner(System.in);
          System.out.println("LLENAR VECTOR N / CONTAR CUANTOS DIG. ES CADA NUM");
        System.out.println("");
        System.out.println("Por favor indique de que tamaño será el vector:");
        int tam=leer.nextInt();
        int[] vector = new int[tam];
        for (int i = 0; i<tam ; i++) {
            vector[i]=(int) ((Math.random()*99999));
            System.out.println("["+vector[i]+"]");
        }
      
        String tnum;
        int taman;
        int cont1=0,cont2=0,cont3=0,cont4=0,cont5=0;
        for (int i = 0; i<tam ; i++) {
            tnum=String.valueOf(vector[i]);
            taman=tnum.length();
            switch (taman) {
                case 1:
                    cont1++;
                    break;
                case 2:
                    cont2++;
                    break;
                case 3:
                    cont3++;
                    break;
                case 4:
                    cont4++;
                    break;
                case 5:
                    cont5++;
                    break;
             }
            }
        
            System.out.println("En el vector hay :"+cont1+" ,números de 1 dígitos.");
            System.out.println("");
            System.out.println("En el vector hay :"+cont2+" ,números de 2 dígitos.");
            System.out.println("");
            System.out.println("En el vector hay :"+cont3+" ,números de 3 dígitos.");
            System.out.println("");
            System.out.println("En el vector hay :"+cont4+" ,números de 4 dígitos.");
            System.out.println("");
            System.out.println("En el vector hay :"+cont5+" ,números de 5 dígitos.");
            System.out.println("");
        }
}
  
