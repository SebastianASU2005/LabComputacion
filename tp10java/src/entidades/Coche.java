/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author pguid
 */
public class Coche {
    private String marca;
    private String modelo;
    private String año;

    public Coche() {
    }

    public Coche(String marca, String modelo, String año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }
    
    public void acelerar(int incremento, int decremento) {
        double velocidad=0;
        velocidad += incremento;
        System.out.println("El coche aceleró a " + velocidad + " km/h");
         if (velocidad - decremento >= 0) {
            velocidad -= decremento;
            System.out.println("El coche frenó a " + velocidad + " km/h");
        } else {
            System.out.println("El coche ya está detenido.");
        }
        
    }
    
    
}
