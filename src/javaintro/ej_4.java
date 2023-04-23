/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package javaintro;

import java.util.Scanner;

/**
 *
 * @author delfi
 */
public class ej_4 {
    public static void main(String[] args) {
        Scanner read= new Scanner (System.in);
        System.out.println("Ingrese la cantidad de grados centígrados");
        int gradosC = read.nextInt();
        int gradosF = 32 + (9 * gradosC / 5);
        System.out.println("Los grados centígrados ingresados corresponden a " + gradosF +" Fahrenheit");
    }        
}
