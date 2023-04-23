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
public class ej_20bis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Llene una matriz de 3X3 para verificar si es magica o no.");
        int[][] cuadrado = new int[3][3];
        int sumaInicial = 0;
        cuadrado = llenarCuadrado(cuadrado, sc);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sumaInicial += cuadrado[i][j];
            }
            break;
        }

        mostrarCuadrado(cuadrado);

        if (verificarFilaYcolumnas(cuadrado, sumaInicial) == true && verificarDiagonal(cuadrado, sumaInicial) == true) {
            System.out.println("El cuadrado es Magico");
        } else {
            System.out.println("El cuadrado no es Magico");
        }
    }

    public static int[][] llenarCuadrado(int[][] arreglo, Scanner sc) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    System.out.println("Ingrese un numero entre 1 y 9 para la posicion: " + "[ " + i + " ]" + "[ " + j + " ]");
                    arreglo[i][j] = sc.nextInt();
                } while (arreglo[i][j] < 1 || arreglo[i][j] > 9);
            }
        }
        return arreglo;
    }

    public static boolean verificarFilaYcolumnas(int[][] arreglo, int sumaInicial) {
        boolean bandera = false;
        boolean correcto = true;
        int sumaFilas = 0;
        int sumaColumnas = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sumaFilas += arreglo[i][j];
                sumaColumnas += arreglo[j][i];
            }
            if (sumaFilas != sumaInicial || sumaColumnas != sumaInicial) {
                correcto = false;
            }
            sumaFilas = 0;
            sumaColumnas = 0;
        }
        if (correcto == true) {
            bandera = true;
        }
        return bandera;
    }

    public static boolean verificarDiagonal(int[][] arreglo, int sumaInicial) {
        boolean banderaD = false;
        int sumaD = 0;
        int sumaDi = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    sumaD += arreglo[i][j];
                    sumaDi += arreglo[j][i];
                }
            }
        }
        if (sumaD == sumaInicial && sumaDi == sumaInicial) {
            banderaD = true;
        }
        return banderaD;
    }

    public static void mostrarCuadrado(int[][] arreglo) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[ " + arreglo[i][j] + " ]");
            }
            System.out.println("");
        }
    }
}
