/*
 * Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere el
límite inicial.
 */
package javaintro;

import java.util.Scanner;

/**
 *
 * @author delfi
 */
public class ej_10 {
    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        System.out.print("Ingrese un número positivo Límite: ");
        int numLim = leer.nextInt();
        int sumatoria = 0;
        
        while (sumatoria<=numLim){
            System.out.print("Ingrese otro número: ");
            int num = leer.nextInt();
        sumatoria += num;
        //es igual que poner sumatoria = sumatoria + num
           
        }
        System.out.println("Ha superado el Límite. ("+sumatoria+" es mayor a "+numLim+")");
    }
}
        
    

