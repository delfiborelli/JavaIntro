/*
 *Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
 */
package javaintro;

import java.util.Scanner;

/**
 *
 * @author delfi
 */
public class JavaIntro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner read = new Scanner (System.in);
        System.out.println("Ingrese el primer número");
        int num1 = read.nextInt();
        System.out.println("Ingrese el segundo nùmero");
        int num2 = read.nextInt();
        int suma = num1 +num2;
        System.out.println("El resultado es: "+suma);
    }
    
}
