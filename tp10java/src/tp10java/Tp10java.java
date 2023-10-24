/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp10java;

import entidades.Circulo;
import entidades.Coche;
import entidades.CuentaBancaria;
import entidades.Estudiante;
import entidades.Libro;
import entidades.Pelicula;
import entidades.Perro;
import entidades.Rectangulo;

/**
 *
 * @author pguid
 */
public class Tp10java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Perro perro= new Perro();
        perro.crearPerro();
        System.out.println(perro);
        perro.guauguau();
        Circulo cir= new Circulo();
        cir.calcular_area_perimetro();
        Estudiante e1= new Estudiante();
        e1.crearEstudiante();
        Libro l1= new Libro();
        l1.crearLibro();
        CuentaBancaria cb= new CuentaBancaria();
        cb.depositaryretirar();
        Rectangulo r= new Rectangulo();
        r.calcularAreaPerimetro();
        Coche ch= new Coche("fiat", "uno", "2011");
        ch.acelerar(50, 20);
        Pelicula pel= new Pelicula("iron man", "marvel", "1200");
        System.out.println(pel);


    }
    
}
