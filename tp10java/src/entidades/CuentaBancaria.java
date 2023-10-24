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
public class CuentaBancaria {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private double saldo;
    private int nro;

    public CuentaBancaria() {
    }

    public CuentaBancaria(double saldo, int nro) {
        this.saldo = saldo;
        this.nro = nro;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public void depositaryretirar() {
        this.saldo = 0;
        System.out.println("desea ingresar dinero?");
        String op = leer.next();
        if ("si".equals(op)) {
            System.out.println("ingrese dinero en la cuenta");
            double ingreso = leer.nextDouble();
            this.saldo += ingreso;
            System.out.println("saldo: " + saldo);
        } else {
            System.out.println("saldo: " + saldo);
        }

        System.out.println("desea retirar dinero");
        String op2 = leer.next();
        if ("si".equals(op2)) {
            System.out.println("retire dinero");
            double retirada = leer.nextDouble();
            if (retirada < saldo) {
                this.saldo -= retirada;
            } else {
                System.out.println("no puede retirar ese dinero ya que es mayor al saldo");
            }
            System.out.println("saldo: " + saldo);
        } else {
            System.out.println("saldo: " + saldo);
        }


    }
}
