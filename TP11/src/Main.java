import org.w3c.dom.ranges.Range;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        /*
        ArrayList<String>Autos=new ArrayList<>();
        int decision=0;
        do {
            System.out.println("Ingrese la marca del auto");
            Autos.add(leer.next());
            System.out.println("Desea ingesar otro auto 1_SI 2_NO");
            decision= leer.nextInt();
        }while(decision==1);
        for(String i:Autos){
            System.out.println(i);
        }
        EquipoDeFutbol e1=new EquipoDeFutbol();
        int decision1=0;
        do {
            System.out.println("Que desea hacer?");
            System.out.println("1_Ingresar jugador");
            System.out.println("2_Eliminar Jugador");
            System.out.println("3_Mostrar planter");
            decision1= leer.nextInt();
            switch (decision1){
                case 1:
                    e1.Ingresar();
                    break;
                case 2:
                    e1.Eliminar();
                    break;
                case 3:
                    e1.Mostrar();
                    break;
            }
        }while(decision1!=3);
        Factura f1=new Factura();
        String op;
        f1.setNum_factura(1);
        f1.setFecha_emision("09/02/2023");
        f1.setCliente("Santiago");
        do{
            f1.agregar_articulo();
            System.out.println("Desea añadir otro artículo?s/n");
            op= leer.next();
        }while(op.equalsIgnoreCase("s"));
        f1.mas_iva();
        ArrayList<Double> num_decimales=new ArrayList<>();
        for (int i=0;i<20;i++){
            num_decimales.add(leer.nextDouble());
        }
        double max=0;
        double min=num_decimales.get(1);
        for (Double i:num_decimales) {
            if (i>max){
                max=i;
            } else if (i<min) {
                min=i;
            }
        }
        double num=max-min;
        System.out.println("Numero mas grande "+max+" ,numero mas chico "+min+" El rango entre estos es: "+num);
         */
        Random ran =new Random();
        int suma=0;
        ArrayList<Integer> numeros=new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            numeros.add(ran.nextInt(100));
        }
        for (int j:numeros) {
            suma+=j;
        }
        int con1=0;
        int con2=0;
        int con3=0;

        int promedio=suma/20;
        for (Integer i:numeros) {
            if (i==promedio){
                con1++;
            } else if (i>promedio) {
                con2++;
            } else if (i<promedio) {
                con3++;
            }

        }
        for (int i :numeros) {
            System.out.print(i+" ");
        }
        System.out.println("El promedio es: "+promedio);
        System.out.println("Numero igual al promedio: "+con1);
        System.out.println("Numero mayores al promedio: "+con2);
        System.out.println("Numero menores al promedio "+con3);
    }

}