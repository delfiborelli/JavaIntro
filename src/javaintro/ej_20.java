/*
 * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 
 2*/
package javaintro;

import java.util.Scanner;

/**
 *
 * @author delfi
 */
public class ej_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los valores de su cuadrado de 3x3");
        int matriz[][]= new int [3][3];  
        matriz= llenarMatriz(matriz, sc);
        mostrarMatriz(matriz);
        
        int sumaFilas=0;
        int sumaColumnas=0;
        int sumaDiag1=0;
        int sumaDiag2=0;
        
        

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++){
              sumaFilas+=matriz[i][j];
              sumaColumnas+=matriz[j][i];
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++){
              if (i==j){  
              sumaDiag1+=matriz[i][j];
            }
        }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++){
              if (((i==0)&&(j==2))||((i==1)&&(j==1))||((i==2)&&(j==0))){  
              sumaDiag2+=matriz[i][j];
              }
            }
        }
        
        if ((sumaFilas==sumaColumnas)&&(sumaDiag1==sumaDiag2)) {
            System.out.println("La matriz es mágica");
        } else {
            System.out.println("La matriz no es mágica");
    }    
    }    
    public static int[][] llenarMatriz(int[][] arreglo, Scanner sc){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arreglo[i][j]=sc.nextInt();
            }
        }
        return arreglo;
    }
    public static void mostrarMatriz(int[][] arreglo) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[ " + arreglo[i][j] + " ]");
            }
            System.out.println("");
        }
    }
}