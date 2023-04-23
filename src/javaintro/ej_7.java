/*
 *Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java.
 */
package javaintro;

import java.util.Scanner;

/**
 *
 * @author delfi
 */
public class ej_7 {
    public static void main(String[] args) {
       Scanner read = new Scanner (System.in);
        System.out.println("Ingrese una frase");
        String frase = read.nextLine();
        String frase2 = "Eureka";
        if (frase.equalsIgnoreCase(frase2)) {
            System.out.println("Frase correcta!");
        } else {
            System.out.println("Frase incorrecta!");
        }
    }
}
    
