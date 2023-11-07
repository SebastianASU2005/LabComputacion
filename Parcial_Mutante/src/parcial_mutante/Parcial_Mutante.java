/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial_mutante;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author astud
 */
public class Parcial_Mutante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> adn = adnCreation();
        System.out.println(adn);
        boolean isMutant = isMutant(adn);
        if (isMutant) {
            System.out.println("El adn es de un mutante");
        } else {
            System.out.println("El adn no es de un mutante");
        }
    }

    // Function to create a list of DNA with 6 lines, each with 6 valid characters.
    public static List<String> adnCreation() {
        List<String> adn = new ArrayList<>();
        boolean validation = true;
        int iteration = 0;

        Scanner scanner = new Scanner(System.in);

        while (iteration < 6) {
            validation = true;
            int validationAmount = 0;

            while (validation) {
                System.out.print("Ingrese una linea de adn solo con estos caracteres(A,C,G,T) ej: acgtta ");
                String lineString = scanner.nextLine();

                if (lineString.length() == 6) {
                    for (int i = 0; i < lineString.length(); i++) {
                        char c = Character.toLowerCase(lineString.charAt(i));
                        if (c == 'a' || c == 'c' || c == 'g' || c == 't') {
                            validationAmount++;
                        } else {
                            System.out.println("Dato incorrecto");
                            validation = true;
                            break;
                        }
                    }
                    if (validationAmount == 6) {
                        System.out.println("Datos correctos");
                        adn.add(lineString.toLowerCase());
                        validation = false;
                    }
                } else {
                    System.out.println("Dato incorrecto");
                    validation = true;
                }
            }
            iteration++;
        }
        return adn;
    }

    // Function to check if there is a sequence of 4 identical characters in a row.
    public static int mutantLine(List<String> adn) {
        int num = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (adn.get(i).charAt(j) == adn.get(i).charAt(j + 1) &&
                        adn.get(i).charAt(j + 1) == adn.get(i).charAt(j + 2) &&
                        adn.get(i).charAt(j + 2) == adn.get(i).charAt(j + 3)) {
                    num++;
                    if (num >= 1) {
                        return num;
                    }
                }
            }
        }
        return num;
    }

    // Function to check if there is a sequence of 4 identical characters in a column.
    public static int mutantColumn(List<String> adn) {
        int num = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (adn.get(j).charAt(i) == adn.get(j + 1).charAt(i) &&
                        adn.get(j + 1).charAt(i) == adn.get(j + 2).charAt(i) &&
                        adn.get(j + 2).charAt(i) == adn.get(j + 3).charAt(i)) {
                    num++;
                    if (num >= 1) {
                        return num;
                    }
                }
            }
        }
        return num;
    }

    // Function to check if there is a sequence of 4 identical characters in a diagonal.
    public static int mutantDiagonal(List<String> adn) {
        int num = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (adn.get(i).charAt(j) == adn.get(i + 1).charAt(j + 1) &&
                        adn.get(i + 1).charAt(j + 1) == adn.get(i + 2).charAt(j + 2) &&
                        adn.get(i + 2).charAt(j + 2) == adn.get(i + 3).charAt(j + 3)) {
                    num++;
                    if (num >= 1) {
                        return num;
                    }
                }
            }
        }
        return num;
    }

    // Function to check if there is a sequence of 4 identical characters in a diagonal starting from the bottom left.
    public static int mutantDiagonalReverse(List<String> adn) {
        int num = 0;

        for (int i = 5; i > 2; i--) {
            for (int j = 0; j < 3; j++) {
                if (adn.get(i).charAt(j) == adn.get(i - 1).charAt(j + 1) &&
                        adn.get(i - 1).charAt(j + 1) == adn.get(i - 2).charAt(j + 2) &&
                        adn.get(i - 2).charAt(j + 2) == adn.get(i - 3).charAt(j + 3)) {
                    num++;
                    if (num >= 1) {
                        return num;
                    }
                }
            }
        }
        return num;
    }

    // Main function to check if DNA is mutant.
    public static boolean isMutant(List<String> adn) {
        int totalMutations = mutantLine(adn) + mutantColumn(adn) + mutantDiagonal(adn) + mutantDiagonalReverse(adn);
        System.out.println("Cantidad de mutaciones en linea=" + mutantLine(adn));
        System.out.println("Cantidad de mutaciones en columna=" + mutantColumn(adn));
        System.out.println("Cantidad de mutaciones en diagonal=" + mutantDiagonal(adn));
        System.out.println("Cantidad de mutaciones en diagonal inversa=" + mutantDiagonalReverse(adn));
        if (totalMutations > 1) {
            return true;
        } else {
            return false;
        }
    }
}