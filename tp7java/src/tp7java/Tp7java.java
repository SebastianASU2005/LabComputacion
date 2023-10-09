/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp7java;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class Tp7java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int[] a = new int[5];
        Integer[] b = new Integer[5];
        for (int i = 0; i < 5; i++) {
            a[i] = leer.nextInt();
            b[i] = leer.nextInt();
        }
        Arrays.sort(a);
        for (int i : a) {
            System.out.println(i);
        }
        Arrays.sort(b, Collections.reverseOrder());
        for (Integer integer : b) {
            System.out.println(integer);
        }

        float[] c = {3f, 5f, 7f, 2f};
        Float[] d = {3f, 5f, 7f, 2f};
        Arrays.sort(c);
        for (float f : c) {
            System.out.println(f);
        }
        Arrays.sort(d, Collections.reverseOrder());
        for (Float float1 : d) {
            System.out.println(float1);
        }

        String[] p = {"hola", "messi", "chau"};
        Arrays.sort(p);
        for (String string : p) {
            System.out.println(string);
        }
        Arrays.sort(p, Collections.reverseOrder());
        for (String string : p) {
            System.out.println(string);
        }
        int aux;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (a[j] > a[i]) {
                    aux = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = aux;
                }
            }
        }
        for (int i : a) {
            System.out.println(i);
        }

        int[] array = {64, 25, 12, 22, 11};

        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int Index = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[Index]) {
                    Index = j;
                }
            }

            int temp = array[i];
            array[i] = array[Index];
            array[Index] = temp;
        }

        System.out.println("Array ordenado:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        int[] array2 = {64, 25, 12, 22, 11};

        int nu = array2.length;
        for (int i = 1; i < nu; i++) {
            int clave = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > clave) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = clave;
        }

        System.out.println("Array ordenado:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

}
