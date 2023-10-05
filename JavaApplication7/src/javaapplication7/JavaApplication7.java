/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication7;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Alumno
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*1.Ordenar un array de números enteros de menor a mayor.*/
        Integer[] nums = {1, 2, 3, 4, 5, 62, 54, 67, 23};
        Arrays.sort(nums);
        for (int s : nums) {
            System.out.println(s);

        }
        /*2.Ordenar un array de números enteros de mayor a menor.*/
        Arrays.sort(nums, Collections.reverseOrder());
        for (Integer n : nums) {
            System.out.println(n);
        }
        System.out.println(" ");
        /*3.Ordenar un array de números flotantes de menor a mayor.*/
        Float[] nums_des = {1.2f, 1.3f, 3.2f, 1.1f, 2.4f, 2.5f};
        Arrays.sort(nums_des);
        for (float s : nums_des) {
            System.out.println(s);
        }
        /*4.Ordenar un array de números flotantes de mayor a menor.*/
        Arrays.sort(nums_des, Collections.reverseOrder());
        for (float m : nums_des) {
            System.out.println(m);
        }
        System.out.println(" ");
        /*5.	Ordenar un array de cadenas de texto en orden alfabético.*/
        String[] letras = {"m", "c", "a", "l", "b", "d"};
        Arrays.sort(letras);
        for (String l : letras) {
            System.out.println(l);
        }
        /*6.	Ordenar un array de cadenas de texto en orden inverso.*/
        Arrays.sort(letras, Collections.reverseOrder());
        for (String s : letras) {
            System.out.println(s);
        }
        System.out.println(" ");
        /*9.Ordenar un array de números enteros utilizando el algoritmo de ordenamiento burbuja.*/
        int[] num_tuñora = {1, 15, 7, 9, 26, 27, 50};
        //int i,j,aux;
        /*    for (i = 0; i < num_tuñora.length-1; i++) {
            for ( j = 0; j < num_tuñora.length -i -1; j++) {
                if (num_tuñora[j+1]<num_tuñora[j]){
                aux=num_tuñora[j+1];
                num_tuñora[j+1]=num_tuñora[j];
                num_tuñora[j]= aux;
                
                }
            }
        }
        for (int l : num_tuñora){
            System.out.println(l);
        }*/
        System.out.println(" ");
        /*10.Ordenar un array de números enteros utilizando el algoritmo de ordenamiento por selección.*/
        Integer[] numeros = {1, 5, 2, 8, 3, 9, 34, 23};
        int i, j, menor, pos, tmp;
        for (i = 0; i < numeros.length - 1; i++) {      // tomamos como menor el primero
            menor = numeros[i];                       // de los elementos que quedan por ordenar                    
            pos = i;                            // y guardamos su posición
            for (j = i + 1; j < numeros.length; j++) { // buscamos en el resto
                if (numeros[j] < menor) {           // del array algún elemento
                    menor = numeros[j];             // menor que el actual
                    pos = j;
                }
            }
            if (pos != i) {                      // si hay alguno menor se intercambia                         
                tmp = numeros[i];
                numeros[i] = numeros[pos];
                numeros[pos] = tmp;
            }
        }
        for (Integer p : numeros) {
            System.out.println(p);
        }
        System.out.println(" ");
        /*11.	Ordenar un array de números enteros utilizando el algoritmo de ordenamiento por inserción.*/

        int aux;
        for (i = 1; i < numeros.length; i++) { // desde el segundo elemento hasta
            aux = numeros[i];           // el final, guardamos el elemento y
            j = i - 1;            // empezamos a comprobar con el anterior
            while ((j >= 0) && (aux < numeros[j])) { // mientras queden posiciones y el                                
                // valor de aux sea menor que los
                numeros[j + 1] = numeros[j];   // de la izquierda, se desplaza a
                j--;               // la derecha
            }
            numeros[j + 1] = aux;       // colocamos aux en su sitio
        }
        for (Integer s : numeros) {
            System.out.println(s);
        }
        System.out.println(" ");
        /*12.	Ordenar un array de números enteros utilizando el algoritmo de ordenamiento por mezcla.*/
        int izq,der;
                                                                                 
    

    }
}
