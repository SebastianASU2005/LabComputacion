/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosdeprácticaarrays;

import java.util.Scanner;

/**
 *
 * @author pguid
 */
public class EjerciciosdeprácticaArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//1
        int[] arra = new int[10];

        for (int i = 0; i < 10; i++) {
            arra[i] = i + 1;
        }

//2
        double[] numerosPrimos = new double[10];
        int contador = 0;

        int numero = 2;

        while (contador < 10) {
            boolean esPrimo = true;

            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) {
                numerosPrimos[contador] = numero;
                contador++;
            }

            numero++;
        }

//3
        int[][] arrayBidimensional = new int[10][10];
//4        
        int dimension1 = 3;
        int dimension2 = 4;
        int dimension3 = 5;

        double[][][] arrayTridimensional = new double[dimension1][dimension2][dimension3];

//lectura y escritura        
//1
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {
            array[i] = leer.nextInt();
        }
//2        
        double[] arrays = new double[10];

        for (int i = 0; i < 10; i++) {
            arrays[i] = leer.nextDouble();
        }

//3
        String[] caracteres = new String[5];
        for (int i = 0; i < caracteres.length; i++) {
            caracteres[i] = leer.next();
        }
        for (int i = 0; i < caracteres.length; i++) {
            System.out.println(caracteres[i]);
        }
//4        
        boolean[] booleans = new boolean[5];
        for (int i = 0; i < booleans.length; i++) {
            booleans[i] = leer.nextBoolean();
        }
        for (int i = 0; i < booleans.length; i++) {
            System.out.println(booleans[i]);
        }
//ooperaciones aritmeticas

//1
        int cont = 0;
        for (int i = 0; i < 10; i++) {
            if (array[i] % 2 == 0) {
                cont++;
            }
        }
        System.out.println(cont);
//2     

        int contM = 0;
        for (int i = 0; i < 10; i++) {
            if (arrays[i] > 10) {
                contM++;
            }
        }
//3     

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            if (array[i] % 3 == 0) {
                sum += array[i];
            }
        }
//4
        int mayor = 0;

        for (int i = 0; i < 10; i++) {
            if (array[i] > mayor) {
                mayor = array[i];
            }
        }
//5

        int min = 10000000;
        for (int i = 0; i < 5; i++) {
            if (caracteres[i].length() < min) {
                min = caracteres[i].length();
            }
        }
        int[] a = new int[10];
        int[] b = new int[10];

        
        for (int i = 0; i < 10; i++) {
            a[i]=leer.nextInt();
            b[i]=a[i];
        }
    }

}
