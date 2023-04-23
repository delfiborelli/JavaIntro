/*
 *Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
 */
package javaintro;

import java.util.Scanner;

/**
 *
 * @author delfi
 */
public class ej_13 {
    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        System.out.println("Ingrese los elementos del cuadrado");
        int num = leer.nextInt();
        
        for (int i = 0; i < num; i++) {
            
            for (int j = 0; j < num; i++) {
                if (i>0 && i<num && j>0 && j<num) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
                    
            }
            System.out.println("");
        }
           
        //*System.out.println("CUADRADO DE ASTERISCOS");
        System.out.println("");
        System.out.println("Por favor diga de que tamaño desea el cuadrado: ");
        int tam=leer.nextInt();
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                if((i>0)&&(i<tam-1)&&(j>0)&&(j<tam-1)){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            
            }
            System.out.println("");
        }
            
 
        }//
}
