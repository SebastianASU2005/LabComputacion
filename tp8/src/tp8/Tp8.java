/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp8;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author User10
 */
public class Tp8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Random ran = new Random();
        int [][] m=new int [3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j]=ran.nextInt(20);
            }
        }
        int [][] n=new int [3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                n[i][j]=ran.nextInt(20);
            }
        }
        
        int [][] r=new int [3][3];
        int [][] s=new int [3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                r[i][j]=m[i][j]+n[i][j];
                s[i][j]=m[i][j]+n[i][j];
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+r[i][j]+"]");
            }
            System.out.println("");
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+s[j][i]+"]");
            }
            System.out.println("");
        }
        boolean vof=true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (s[i][j]!=s[j][i]){
                    vof=false;
                }
            }
        }
        System.out.println(vof);
        
        int []v={1,2,3,4};
        System.out.println("ingrese numero para escalar");
        int x= leer.nextInt();
        int [] resultado= new int [v.length];
        for (int i = 0; i < v.length; i++) {
            resultado[i]=v[i]*x;
        }
        for (int i = 0; i < v.length; i++) {
            System.out.println(resultado[i]);
        }
        int sum=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
            sum+=s[i][j];    
            }
        }
        System.out.println(sum);
        
        int nummayor=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(s[i][j]>nummayor){
                    nummayor=s[i][j];
                }
            }
        }
        System.out.println("el numero mayor es: "+nummayor);
        int sumar=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i==0){
                    sumar+=s[i][j];
                }
            }
        }
        boolean diagonal;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((i!=j) && (s[i][j]==0)){
                    diagonal=true;
                }else if ( i==j && s[i][j]==0){
                    diagonal=false;
                }
            }
        }
        
        int [][]p= new int [3][3];
        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p.length; j++) {
                if (i==j){
                    p[i][j]=1;
                }else{
                    p[i][j]=0;
                }
            }
        }
        
        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p.length; j++) {
                System.out.print("["+p[i][j]+"]");
            }
            System.out.println("");
        }
        
        int contp=0;
        int contimp=0;
        
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s.length; j++) {
                if (s[i][j] % 2==0){
                    contp++;
                }else{
                    contimp++;
                }
            }
        }

        int[][] matrizOriginal = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrizRotada = rotarMatriz90Grados(matrizOriginal);

        // Imprimir la matriz rotada
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizRotada[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] rotarMatriz90Grados(int[][] matriz) {
        int n = matriz.length;
        int[][] matrizRotada = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrizRotada[i][j] = matriz[n - 1 - j][i];
            }
        }

        return matrizRotada;
    }

}
