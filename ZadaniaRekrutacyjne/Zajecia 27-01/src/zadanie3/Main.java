package zadanie3;

import java.util.Random;
import java.util.Scanner;

public class Main {

    static boolean[][] bombArray;
    static int[][] array;
    static int line, column;

    public static void main(String[] args) {
        getTheSizeOfBoard();
        drawingOfFields();
        printArray();
        insertingFieldsValue();
        printArrayTwo();

    }

    public static void getTheSizeOfBoard() {
        Scanner scan = new Scanner(System.in);
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
        bombArray = new boolean[line][column];
    }

    public static void drawingOfFields() {
        Random random = new Random();
        for (int i = 0; i < (line * column) / 3; i++) {
            int a = random.nextInt(line);
            int b = random.nextInt(column);
            if (!bombArray[a][b]) {
                bombArray[a][b] = true;
            } else {
                i--;
            }
        }
    }

    public static void printArray() {
        for (int i = 0; i < bombArray.length; i++) {
            for (int j = 0; j < bombArray[i].length; j++) {
                System.out.print(bombArray[i][j]);
                if (j < bombArray[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }

    public static void insertingFieldsValue() {
        for (int i = 0; i < bombArray.length; i++) {
            for (int j = 0; j < bombArray[i].length; j++) {
                try {
                    if (!bombArray[i][j]) {
                        array[i][j] = calculationOfFieldsValue(i, j);
                    } else {
                        array[i][j] = -1;
                    }
                }catch (Exception e){
                    continue;
                }
            }
        }
    }

    private static int calculationOfFieldsValue(int i,int j){
        int counter=0;
        for(int x=i-1;x<i+2;x++){
            for(int y=j-1;y<j+2;y++){
                if(bombArray[x][y]){
                    counter+=1;
                }
            }
        }
        return counter;
    }

    public static void printArrayTwo(){
        System.out.println();
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print("\t"+array[i][j]);
                if(j<array[i].length-1){
                    System.out.print(",");
                }
            }
            System.out.println();
        }
    }
}
