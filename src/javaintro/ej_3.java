/*
 * To change this license header, choose License Headers in Project Properties.
 *Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en
Java.
 */
package javaintro;

import java.util.Scanner;

/**
 *
 * @author delfi
 */
public class ej_3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = read.nextLine();
        String frasemayu = frase.toUpperCase();
        System.out.println(frasemayu);
        String fraseminu = frase.toLowerCase();
        System.out.println(fraseminu);
        
    }
}
