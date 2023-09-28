/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej8_labcomputacion_tp4;

import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class Ej8_labComputacion_tp4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String[]empleados=new String[20];
        double[]sueldo=new double[20];
        double sueldoMayor=0;
        String nombre="";
        for (int  i = 0;  i < 20;  i++) {
            System.out.println("ingrese nombre del empleado: "+i);
            empleados[i]=leer.next();
            System.out.println("ingrese sueldo del empleado: "+i);
            sueldo[i]=leer.nextDouble();
        }
        for (int i = 0; i < 20; i++) {
            if(sueldo[i]>sueldoMayor){
                sueldoMayor=sueldo[i];
                nombre=empleados[i];
            }
        }
        System.out.println("la persona con mayor sueldo es: "+nombre);
        System.out.println("y el sueldo es: "+sueldoMayor);
    }
    
}
