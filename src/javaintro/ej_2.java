/*
 *Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.
 */
package javaintro;

import java.util.Scanner;

/**
 *
 * @author delfi
 */
public class ej_2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = read.nextLine();
        System.out.println("El nombre ingresado es: "+nombre);
    }
}
