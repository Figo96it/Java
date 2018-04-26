package zadanie4;

import java.util.Scanner;

public class Main {

    static int[][] array;

    public static void main(String[] args) {
        getTheHieghtOfTriangle();
        completeArray();
        creatingThePascalTriangle();
    }

    public static void getTheHieghtOfTriangle() {
        Scanner scan = new Scanner(System.in);
        int height;
        do {
            System.out.println("ENTER THE HEIGHT OF PASCAL TRIANGLE:  ");

            while (!scan.hasNextInt()) {
                System.out.println("INVALID");
                scan.next();
            }
            height = scan.nextInt();

        } while (height < 0);

        try {
            array = new int[height][];
            for (int i = 0; i < height; i++) {
                array[i] = new int[i + 1];
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void creatingThePascalTriangle() {
        for (int i = 0; i < array.length; i++) {
            printSpecialCharacter(i);
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
                if (j < array[i].length) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void printSpecialCharacter(int x) {
        for (int i = 0; i <= array.length - x; i++) {
            System.out.print(" ");
        }
    }

    public static void completeArray() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                    if (i == 0) {
                        array[i][j] = 1;
                    } else {
                        array[i][j] = array[i - 1][j - 1];
                    }
            }
        }
    }

}
