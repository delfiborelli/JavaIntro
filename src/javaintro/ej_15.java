/*
 * Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 */
package javaintro;

import java.util.Scanner;

/**
 *
 * @author delfi
 */
public class ej_15 {
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("LLENAR VECTOR");
        System.out.println("");
        int[] vector = new int[100];
        for (int i = 99; i >-1 ; i--) {
            vector[i] =i;
            System.out.print("["+vector[i]+"]");
        }
        
         
        
    }
}     
