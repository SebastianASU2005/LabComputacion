/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej5_labcomputacion_tp4;

import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class Ej5_labComputacion_tp4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int [] nums=new int [10];
        int contp=0;
        int contn=0;
        int contc=0;
        for (int i = 0; i < 10; i++) {
            System.out.println("ingrese num: "+i);
            nums[i]=leer.nextInt();
            if (nums[i]>0){
                contp+=1;
            }else if (nums[i]<0){
                contn+=1;
            }else{
                contc+=1;
            }
        }
        System.out.println("cantidad de positivos: "+contp);
        System.out.println("cantidad de negativos: "+contn);
        System.out.println("cantidad de ceros: "+contc);
    }
    
}
