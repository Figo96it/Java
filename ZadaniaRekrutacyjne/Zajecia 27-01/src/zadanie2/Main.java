package zadanie2;

import java.util.Random;
import java.util.Scanner;

public class Main {

    static int[][] array;

    public static void main(String[] args) {
        getTheSizeOfTheArray();
        fillWithRandomNumbers();
        printArray();

    }

    public static void getTheSizeOfTheArray() {
        Scanner scan = new Scanner(System.in);
        int line, column;
        do {
            System.out.println("ENTER THE NUMBER OF ROWS ");

            while (!scan.hasNextInt()) {
                System.out.println("INVALID");
                scan.next();
            }
            line = scan.nextInt();

            System.out.println("ENTER THE NUMBER OF COLUMNS: ");

            while (!scan.hasNextInt()) {
                System.out.println("INVALID");
                scan.next();
            }
            column = scan.nextInt();

        } while (line < 0 && column < 0);
        array = new int[line][column];
    }

    public static void fillWithRandomNumbers() {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(20);
            }
        }
    }

    public static void printArray() {
        int[] sumColumn = new int[array.length]; //druga tablica przechowujaca sume wierszy w kazdej z kolumn
        int allSumLine = 0;

        for (int i = 0; i < array.length; i++) {
            int sumLine = 0;
            for (int j = 0; j < array[i].length; j++) {
                sumColumn[j] += array[i][j];
                sumLine += array[i][j];
                System.out.print(array[i][j]);
                if (j < array[i].length - 1) {
                    System.out.print(",");
                }
                if (j < array[i].length) {
                    System.out.print("\t");
                }
            }
            allSumLine += sumLine;
            System.out.print(" | " + sumLine);
            System.out.println();
        }
        printSpecialCharacter();
        System.out.println();


        int allSumColumn = 0;

        for (int i = 0; i < array[i].length; i++) {
            allSumColumn += sumColumn[i];
            System.out.print(sumColumn[i]);
            if (i < array[i].length - 1) {
                System.out.print(",");
            }
            if (i < array.length) {
                System.out.print("\t");
            }
        }
        if (allSumColumn == allSumLine) {
            System.out.println(" | " + (allSumColumn + allSumLine));
        }
    }

    private static void printSpecialCharacter() {
        for (int i = 0; i < array[i].length; i++) {
            System.out.print("-\t");
        }
        System.out.print("-\t");
        System.out.print("-\t");
    }

}
