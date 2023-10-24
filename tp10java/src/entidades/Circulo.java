/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class Circulo {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public void calcular_area_perimetro(){
        System.out.println("ingrese radio");
        radio=leer.nextDouble();
        double area=3.14*(radio*radio);
        double perimetro=3.14*2*radio;
        System.out.println("el area es: "+area);
        System.out.println("el perimetro es: "+perimetro);
    }
}
