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
public class Perro {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private String nombre;
    private String raza;
    private int edad;

    public Perro() {
    }

    public Perro(String nombre, String raza, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Perro{"  + "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + '}';
    }
    
    public void crearPerro(){
        System.out.println("ingrese nombre del perro");
        this.nombre=leer.next();
        System.out.println("ingrese raza del perro");
        this.raza=leer.next();
        System.out.println("ingrese edad del perro");
        this.edad=leer.nextInt();
        
    }
    public void guauguau(){
        System.out.println("guau guau");
    }
    
    
}
