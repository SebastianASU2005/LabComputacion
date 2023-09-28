/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej7_labcomputacion_tp4;

import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class Ej7_labComputacion_tp4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("cuantas personas se van a medir? ");
        int n = leer.nextInt();
        double[] altura = new double[n];
        double cont = 0;
        double sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("altura de la persona: " + i);
            altura[i] = leer.nextDouble();
            cont += 1;
            sum += altura[i];
        }
        double promedio = sum / cont;
        System.out.println("el promedio de altura es: " + promedio);
        System.out.println("las personas que pasan el promedio son: ");
        for (int i = 0; i < n; i++) {
            if (altura[i] > promedio) {
                System.out.println("persona: " + i);
            }
        }
        System.out.println("y las personas que son mas bajas que el promedio son");
        for (int i = 0; i < n; i++) {
            if (altura[i] < promedio) {
                System.out.println("persona: " + i);
            }
        }

    }

}
