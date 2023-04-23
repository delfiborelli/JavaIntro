/*
 * Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla
que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota:
investigar la función Substring y equals() de Java.
 */
package javaintro;

import java.util.Scanner;

/**
 *
 * @author delfi
 */
public class ej_9 {
    public static void main(String[] args) {
       Scanner read = new Scanner (System.in);
       System.out.println("Ingrese una palabra");
       String palabra = read.nextLine();
       String primeraletra = palabra.substring(0,1);
       
        if (primeraletra.equalsIgnoreCase("a")) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
}
}