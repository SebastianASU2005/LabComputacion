/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej3_labcomputacion_tp4;

import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class Ej3_labComputacion_tp4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("cuantos alumnos hay en la clase? ");
        int alumns=leer.nextInt();
        double [] notas=new double [alumns];
        int cont=0;
        int sum=0;
        for (int i = 0; i < alumns; i++) {
            System.out.println("ingresa la nota del alumno: "+i);
            notas[i]=leer.nextDouble();
            cont+=1;
            sum+=notas[i];            
        }
        double promNotas=sum/cont;
        System.out.println("el promedio del curso es: "+promNotas);
        
        System.out.println("alumnos con nota mayor al promedio");
        for (int i = 0; i < alumns; i++) {
            if (notas[i]>promNotas){
                System.out.println("alumno: "+i);
            }
        }
    }
    
}
