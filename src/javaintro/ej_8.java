/*
 * Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si
el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje
por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. Nota: investigar la función Lenght() en Java.
 */
package javaintro;

import java.util.Scanner;

/**
 *
 * @author delfi
 */
public class ej_8 {
    public static void main(String[] args) {
       Scanner read = new Scanner (System.in);
       System.out.println("Ingrese una frase");
       String frase = read.nextLine();
       int longitud = frase.length();
        if (longitud==8) {
            System.out.println("La longitud de la frase es correcta");
        } else {
            System.out.println("La longitud es incorrecta");
        }
        
}
}