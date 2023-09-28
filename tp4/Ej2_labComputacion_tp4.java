/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej2_labcomputacion_tp4;

import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class Ej2_labComputacion_tp4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int [] nums=new int [10];
        int sum_p=0;
        int cont_p=0;
        for (int i = 0; i < 10; i++) {
            System.out.println("ingrese el numero: "+i);
            nums[i]=leer.nextInt();
            if (nums[i] %2==0){
                sum_p+=nums[i];
                cont_p+=1;
            }
            
        }
        double prom_pares=sum_p/cont_p;
        System.out.println("el promedio de numeros pares es: "+prom_pares);
    }
    
}
