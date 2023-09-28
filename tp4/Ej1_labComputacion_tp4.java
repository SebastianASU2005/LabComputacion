/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej1_labcomputacion_tp4;

import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class Ej1_labComputacion_tp4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        int [] nums=new int [10];
        int cont_p=0;
        int cont_n=0;
        int sum_p=0;
        int sum_n=0;
        for (int i = 0; i < 10; i++) {
            System.out.println("ingrese numero: "+i);
            nums[i]=leer.nextInt();
            if (nums[i]>0){
                cont_p+=1;
                sum_p+=nums[i];
            }else{
                cont_n+=1;
                sum_n+=nums[i];
            }
        }
        double prom_p=sum_p/cont_p;
        double prom_n=sum_n/cont_n;
        System.out.println("el promedio de los numeros positivos es: "+prom_p);
        System.out.println("el promedio de los numeros negativos es: "+prom_n);
    }
    
}
