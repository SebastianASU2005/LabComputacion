/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo_practico_9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/**
 *
 * @author User10
 */
public class Trabajo_practico_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList();
        lista.add(2);
        lista.add(6);
        lista.add(1);
        lista.add(12);
        lista.add(12);
        lista.add(3);
        ArrayList<String> listaString = new ArrayList();
        listaString.add("paulo");
        listaString.add("Seba");
        listaString.add("Colo");
        listaString.add("Colo");
        listaString.add("Sebastian");

        System.out.println(lista);
        System.out.println(listaString.size());

        listaString.remove(0);
        System.out.println(listaString);

        if (lista.isEmpty()) {
            System.out.println("la lista esta vacia");
        } else {
            System.out.println("la lista no esta vacia");
        }

        int max = 0;
        for (Integer integer : lista) {
            if (max < integer) {
                max = integer;
            }
        }
        System.out.println("el numero maximo de la lista es: " + max);

        ArrayList<String> listaS2 = new ArrayList();

        listaS2 = listaString;
        System.out.println(listaS2);

        for (int i = lista.size() - 1; i > -1; i--) {
            int num = lista.get(i);
            System.out.println(num);
        }

        ArrayList<String> listaS3 = new ArrayList();

        listaS3.addAll(listaString);
        listaS3.addAll(listaS2);

        System.out.println(listaS3);

        ArrayList<Integer> impares = new ArrayList();

        for (int i = 0; i < lista.size(); i++) {
            int num = lista.get(i);
            if (num % 2 != 0) {
                impares.add(num);
            }
        }

        System.out.println(impares);

        String elem = "colo";

        for (int i = 0; i < listaString.size(); i++) {
            String c = listaString.get(i);
            if (c.equalsIgnoreCase(elem)) {
                System.out.println(elem + " se encuentra en la posicion: " + i);
            }
        }

        if (listaString == listaS2) {
            System.out.println("las listas son iguales");
        } else {
            System.out.println("no son iguales");
        }

        Integer min = lista.get(2);

        for (int i = 0; i < lista.size(); i++) {

            int num = lista.get(i);
            if (min > num) {
                min = num;
            }
        }
        System.out.println(min);
        int suma = 0;

        for (Integer i : lista) {
            suma += i;
        }
        System.out.println(suma);

        String phrase = "";

        for (String st : listaString) {
            phrase += st;
        }

        System.out.println(phrase);

        HashSet<String> noduplicados = new HashSet();
        noduplicados.addAll(listaString);
        System.out.println(noduplicados);

        int sumaindicesimpares = 0;
        for (int i = 0; i < lista.size(); i++) {
            int num = lista.get(i);
            if (i % 2 == 0) {

                sumaindicesimpares += num;
            }
        }
        System.out.println(sumaindicesimpares);
        
        
        if (lista.contains(2)){
            System.out.println("el elemento si");
        }else{
            System.out.println("no");
        }
        
        int longi=0;
        String larga="";
        for (int i = 0; i < listaString.size(); i++) {
            String c= listaString.get(i);
            if (c.length()>longi){
                larga=c;
            }
        }
        
        System.out.println("la palabra mas larga es: "+larga);
    
        
        int sum=0;
        for (Integer i : lista) {
            sum += i;
        }
        double prom=sum/lista.size();
        System.out.println(prom);
         
        Collections.sort(lista);
        System.out.println(lista);
        
        
        int num=6;
        for (int i = 0; i < lista.size(); i++) {
            int n= lista.get(i);
            if (n>6){
                lista.remove(i);
            }
        }
        System.out.println(lista);
        
         
        int count=0;
        for (int i = 0; i < listaString.size(); i++) {
            String c = listaString.get(i);
            if (c.equalsIgnoreCase(elem)) {
                System.out.println(elem + " se encuentra en la posicion: " + i);
                count++;
            }
        }
        System.out.println("el elemento se encuentra "+count+" veces");
        
        
        
        Collections.sort(listaString);
        System.out.println(listaString);
        
        
        
        
    
    }

}
