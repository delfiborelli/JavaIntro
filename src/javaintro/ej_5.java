/*
 * Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().
 */
package javaintro;

import java.util.Scanner;

/**
 *
 * @author delfi
 */
public class ej_5 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un número entero");
        int num = read.nextInt();
        int numx2 = num*2;
        int numx3 = num*3;
        double raiz = Math.sqrt(num);
        System.out.println("El doble del número ingresado es: "+numx2);
        System.out.println("Eltriple del número ingresado es: "+numx3);
        System.out.println("La raiz cuadrada del número ingresado es: "+raiz);
    }
}
