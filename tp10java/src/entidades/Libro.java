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
public class Libro {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private String title;
    private String autor;
    private String year;

    public Libro() {
    }

    public Libro(String title, String autor, String year) {
        this.title = title;
        this.autor = autor;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
    
    public void crearLibro(){
        System.out.println("ingrese nombre");
        this.title=leer.next();
        System.out.println("ingrese autor");
        this.autor=leer.next();
        System.out.println("ingrese año");
        this.year=leer.next();
        
        System.out.println("nombre: "+title);
        System.out.println("autor: "+autor);
        System.out.println("año: "+year);
    }
}
