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
public class Rectangulo {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private double width;
    private double heigth;

    public Rectangulo() {
    }

    public Rectangulo(double width, double heigth) {
        this.width = width;
        this.heigth = heigth;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }
    
    public void calcularAreaPerimetro(){
        System.out.println("ingrese ancho");
        this.width=leer.nextDouble();
        System.out.println("ingrese alto");
        this.heigth=leer.nextDouble();
        
        double area= this.width*this.heigth;
        double perimetro=2*(width+heigth);
        
        System.out.println("area: "+area);
        System.out.println("perimetro: "+perimetro);
    }
}
