/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintro;

import java.util.Scanner;

/**
 *
 * @author delfi
 */
public class ej_19 {
         public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Indique el tamaño de la matriz");
        int n = sc.nextInt();

        int matriz[][] = new int[n][n];
        int matriztras[][] = new int [n][n];

        System.out.println("Rellene la matriz de " + n + " por " + n);

        // relleno matriz
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                matriz[i][j] = sc.nextInt();
            }

        }
        
        // imprimo matriz
        System.out.println("La matriz es:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
        System.out.println("La traspuesta cambiada de signo es");
        // genero la traspuesta con signo negativo
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                matriztras[i][j] = -matriz[j][i];
            }

        }
        //imprimo la traspuesta
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriztras[i][j]);
            }
            System.out.println("");
    }
        int cont = 0;
        
        // comparo dato por dato
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                
              if (matriz[i][j] == matriztras[i][j]){
                  cont = cont + 0;
              }  
              else {
                  cont = cont + 1;
              }
            }
            }
        
        if (cont == 0){
            System.out.println("La matriz ingresada es Antisimetrica");
        } 
        else {
            System.out.println("La matriz ingresada no es Antisimetrica");
        }
}
}
