/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej9_labcomputacion_tp4;

import java.util.Random;

/**
 *
 * @author pguid
 */
public class Ej9_labComputacion_tp4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] arrayAleatorio = arrayAleatorio();

        for (int i = 0; i < 10; i++) {
            System.out.println(arrayAleatorio[i]);
        }
        
    }

    public static int[] arrayAleatorio() {

        Random ran = new Random();
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = ran.nextInt(10) + 1;
        }
        return array;

    }

}

