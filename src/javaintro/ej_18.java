/*
 *       Scanner leer = new Scanner(System.in);
        System.out.println("LLENAR MATRIZ 4X4 ALEATORIOS");
        System.out.println("");
        int [][] matriz=new int[4][4];
     
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j]=(int)(Math.random()*10);
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
        System.out.println("La traspuesta: ");

Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se
obtiene cambiando sus filas por columnas (o viceversa).
 */
package javaintro;

import java.util.Scanner;

/**
 *
 * @author delfi
 */
public class ej_18 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("LLENAR MATRIZ 4X4 ALEATORIOS");
        System.out.println("");
        int [][] matriz=new int[4][4];
     
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j]=(int)(Math.random()*10);
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
        System.out.println("La traspuesta: ");
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
}
}