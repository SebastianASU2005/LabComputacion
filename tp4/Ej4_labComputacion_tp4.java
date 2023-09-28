/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej4_labcomputacion_tp4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class Ej4_labComputacion_tp4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Random ran = new Random();
        int k=0;
        int[] num = new int[20];
        for (int i = 1; i < 21; i++) {
            if (i % 2 == 0) {
                num[k] = i;
                k++;
            }

        }
        for (int j = 1; j < 11; j++) {
            System.out.println(num[j]);
        }

    }

}
