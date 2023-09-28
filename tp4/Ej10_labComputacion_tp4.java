/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej10_labcomputacion_tp4;

import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class Ej10_labComputacion_tp4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ej10_labComputacion_tp4 programa = new Ej10_labComputacion_tp4();
        int[][] matrizA = programa.llenarMatriz();
        programa.mostrarMatriz(matrizA);
        int[][] matrizB = programa.llenarMatriz();
        programa.mostrarMatriz(matrizA);
        int[][] c = programa.sumar(matrizA, matrizB);
        System.out.println("suma de 2 matrices");
        programa.mostrarMatriz(c);
    }

    public int num() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Indique tamaÃ±o de matriz:");
        return leer.nextInt();
    }

    public int[][] declararMatriz(int tamaño) {
        return new int[tamaño][tamaño];
    }

    public int[][] llenarMatriz() {
        int tamaño = num();
        int[][] matriz = declararMatriz(tamaño);
        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                System.out.print("Ingrese el valor para la posiciÃ³n [" + i + "][" + j + "]: ");
                matriz[i][j] = leer.nextInt();
            }
        }
        return matriz;
    }

    public int[][] sumar(int[][] a, int[][] b) {

        int filas = a.length;
        int columnas = a[0].length;
        int[][] suma = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                suma[i][j] = a[i][j] + b[i][j];
            }
        }
        return suma;

    }

    public void mostrarMatriz(int[][] matriz) {
        int n = matriz.length;
        int m = matriz[0].length;
        System.out.println("Matriz:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
