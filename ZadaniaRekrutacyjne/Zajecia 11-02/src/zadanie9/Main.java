package zadanie9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static int[][] array;

    public static void main(String[] args) {
        int row = initialNumber("Podaj rozmiar wierszy:");
        int column = initialNumber("Podaj rozmiar kolumn:");
        array = new int[row][column];
        fillArrayNumber();
        showArray();
        fillSpiralArrayNumber();
        System.out.println();
        showArray();
    }

    static int initialNumber(String msg) {
        System.out.print(msg);
        return new Scanner(System.in).nextInt();
    }

    static int[][] fillArrayNumber() {
        int number = 1;
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[0].length; column++) {
                array[row][column] = number;
                number++;
            }
        }
        return array;
    }

    static void showArray() {
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[0].length; column++) {
                System.out.print(array[row][column] + " \t");
            }
            System.out.println();
        }
    }

    static int[][] fillSpiralArrayNumber() {
        int actualRow = 0;
        int actualColumn = 0;
        int actualRowLength = array.length;
        int actualColumnLength = array[0].length;
        List<Integer> lista = new ArrayList<>();

        if (array.length == array[0].length) {
            for (int i = actualRow; i < actualRowLength; i++) {
                for (int j = actualColumn; j < actualColumnLength; j++) {
                    lista.add(array[i][j]);
                    if (j == actualColumnLength - 1) {
                        if(array[0].length%2==0) {
                            for (int x = actualColumn + 1; x < actualColumnLength - 1; x++) {
                                lista.add(array[x][j]);
                            }
                            for (int y = actualColumnLength - 1; y >= actualRow; y--) {
                                lista.add(array[actualRowLength - 1][y]);
                            }
                            for (int z = actualRowLength - 2; z > actualColumn; z--) {
                                lista.add(array[z][actualRow]);
                            }
                        }else{
                            for (int x = actualColumn + 1; x < actualColumnLength - 1; x++) {
                                lista.add(array[x][j]);
                            }
                            for (int y = actualColumnLength - 1; y >= actualRow; y--) {
                                lista.add(array[actualRowLength - 1][y]);
                            }
                            for (int z = actualRowLength - 2; z > actualColumn; z--) {
                                lista.add(array[z][actualRow]);
                            }
                        }
                    }
                }
                actualColumnLength = actualColumnLength - 1;
                actualRowLength -= 1;
                actualRow += 1;
                actualColumn += 1;
            }

        } else {
            for (int i = actualRow; i < actualRowLength; i++) {
                for (int j = actualColumn; j < actualColumnLength; j++) {
                    lista.add(array[i][j]);
                    if (j == actualColumnLength - 1) {
                        if (array[0].length % 2 == 1) {
                            for (int x = actualColumn + 1; x < actualColumnLength - 1; x++) {
                                lista.add(array[x][j]);
                            }
                        } else {
                            for (int x = actualColumn + 1; x < actualColumnLength - 2; x++) {
                                lista.add(array[x][j]);
                            }
                        }
                        if (array[0].length % 2 == 1) {
                            for (int y = actualColumnLength - 2; y >= actualRow; y--) {
                                lista.add(array[actualRowLength - 1][y]);
                            }
                            for (int z = actualRowLength - 2; z > actualColumn; z--) {
                                lista.add(array[z][actualRow]);
                            }
                        } else {
                            for (int y = actualRowLength; y >= actualRow; y--) {
                                lista.add(array[actualRowLength - 1][y]);
                            }
                            System.out.println(lista);
                            for (int z = actualRowLength - 2; z > actualRow; z--) {
                                lista.add(array[z][actualRow]);
                            }
                        }
                    }
                }
                actualColumnLength = actualColumnLength - 1;
                actualRowLength -= 1;
                actualRow += 1;
                actualColumn += 1;
            }
        }
        int[][] newArray=new int[array.length][array[0].length];
        int x=0;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[0].length;j++){
                newArray[i][j]=lista.get(x);
                x++;
            }
        }
        array=newArray;
        return array;
    }
}
